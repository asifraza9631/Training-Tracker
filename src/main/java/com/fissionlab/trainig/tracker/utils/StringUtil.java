package com.fissionlab.trainig.tracker.utils;

public final class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String join(String[] arr, String delimiter) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static String toTitleCase(String str) {
        if (isNullOrEmpty(str)) {
            return "";
        }
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!isNullOrEmpty(word)) {
                sb.append(word.substring(0, 1).toUpperCase());
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
