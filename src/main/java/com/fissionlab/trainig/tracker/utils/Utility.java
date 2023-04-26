package com.fissionlab.trainig.tracker.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALID_PHONE_NUMBER_REGEX =
            Pattern.compile("^\\+[0-9]{1,3}[0-9]{11,14}(?:x.+)?$", Pattern.CASE_INSENSITIVE);
    public static final Pattern NEW_VALID_PHONE_NUMBER_REGEX =
            Pattern.compile("^\\+[0-9]{1,3}[0-9]{10,14}(?:x.+)?$", Pattern.CASE_INSENSITIVE);
    public static boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if (!matcher.find()) {
            return false;
        }
        return true;
    }


    public static long getRandomLongValue() {
        long number = (long) Math.floor(Math.random() * 900_000L) + 100_000L;
        return number;
    }

    public static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    public static boolean checkIfStringConatinsNumber(String s) {
        String regex = "(.)*(\\d)(.)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Boolean isMatched = matcher.matches();
        return isMatched;
    }
    public static boolean checkIfStringConatinsAlphabets(String s) {
        String regex = ".*[a-zA-Z]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Boolean isMatched = matcher.matches();
        return isMatched;
    }
    // if returns false
    public static boolean checkIfStringConatinsSpecialCharacters(String s) {
        String regex = "[a-zA-Z0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Boolean isMatched;
        if (!matcher.matches()) {
            isMatched = true;
        } else {
            isMatched = false;
        }
        return isMatched;
    }

    public static boolean checkIfNameIsValid(String s) {
        String regex = "^[a-zA-Z ]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        Boolean isMatched = matcher.matches();
        return isMatched;
    }
}
