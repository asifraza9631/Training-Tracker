package com.fissionlab.coe.utils;

import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeUtilities {

    public static Date getCurrentDateInUTC() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        return Date.from(utc.toInstant());
    }

    public static String getUTCDateInString() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdfDate.format(Date.from(utc.toInstant()));
    }

    public static String getUTCDateTimeInString() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdfDate.format(Date.from(utc.toInstant()));
    }


    public static String getUTCDateTimeInStringFormatted() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdfDate.format(Date.from(utc.toInstant()));
    }

    public static String getDateMMDDYYYY(Date date) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdfDate.format(date);
    }

}
