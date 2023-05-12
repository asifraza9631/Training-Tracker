package com.fissionlab.trainig.tracker.security;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.fissionlab.trainig.tracker.exception.GoogleTokenException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoogleAuthProvider implements AuthenticationProvider {

    @Override
    public GoogleAuthToken authenticate(Authentication authentication) throws AuthenticationException {

        GoogleAuthToken tokenObj = (GoogleAuthToken) authentication;
        // read clientId from properties file.
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory())
                .setAudience(Arrays.asList("1037219380694-5aupoe2rciib07h41pivfm0talaav3lm.apps.googleusercontent.com",
                        "1037219380694-o2nalno8jsjduiaa62sd1ecmnafms7e7.apps.googleusercontent.com",
                        "1037219380694-ukgdnatd0r2peoq9f8thhc806qkqbdun.apps.googleusercontent.com"))
                .build();
        GoogleIdToken idToken = null;
        try {
            idToken = verifier.verify((String) tokenObj.getCredentials());
        } catch (GeneralSecurityException | IOException e) {
            throw new GoogleTokenException("Error while parsing google token", e);
        }
        if (idToken != null) {
            Payload payload = idToken.getPayload();
            log.info(payload.getEmail());
            GoogleAuthToken token = new GoogleAuthToken(payload.getEmail(), null, null, null);
            return token;
        } else {
            throw new  GoogleTokenException("Error while parsing google token");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (GoogleAuthToken.class.isAssignableFrom(authentication));
    }

}