package com.fissionlab.trainig.tracker.security;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

import com.fissionlab.trainig.tracker.DTO.EmployeeDTO;
import com.fissionlab.trainig.tracker.entity.Employee;
import com.fissionlab.trainig.tracker.exception.ResourceNotFoundException;
import com.fissionlab.trainig.tracker.repository.EmployeeRepository;

import org.apache.http.HttpStatus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TokenService {
//    @Value("${secretkey}")
    private String SECRET_KEY = "fission";

    @Autowired
    private EmployeeRepository userRepo;
    @Autowired
    private ModelMapper mapper;

    // add the jwt token genertaed with the secret key from properties file to the
    // header.
    // add jwt to response headers
    public void addTokenToAuthHeader(String email, HttpServletResponse response) throws ResourceNotFoundException {
        log.info(email + " adding email");
        Employee emp = userRepo.findByEmail(email);


        String token = null;

        if(emp.getStatus().equalsIgnoreCase("active")) {

            EmployeeDTO empdto = mapper.map(emp, EmployeeDTO.class);
            token = createToken(empdto);
            response.addHeader("accessToken", token);
            response.setStatus(HttpStatus.SC_OK);
            response.setContentType("application/json");
        }else {
            throw new ResourceNotFoundException("User is inactive");
        }

    }

    private Claims extractAllClaims(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(Base64.getEncoder().encodeToString(SECRET_KEY.getBytes()))
                    .parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException ex) {
            throw new tokenExpirationException("token expired");
        }
        return claims;
    }

    public Claims getAllClaims(String token) {
        return extractAllClaims(token);
    }

    private String createToken(EmployeeDTO empDto) {
        Claims claim = Jwts.claims();
        claim.put("id", empDto.getOrgEmpId());
        claim.put("email", empDto.getEmail());
        //claim.put("role", empDto.getRole());
        return Jwts.builder().setIssuedAt(new Date(System.currentTimeMillis())).setClaims(claim)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encodeToString(SECRET_KEY.getBytes()))
                .compact();
    }
//  System.currentTimeMillis() + 1000 * 60 * 60 * 10


    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }



    public Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

}