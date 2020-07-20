package com.jforce.project.util;



import com.jforce.project.exception.ErrorCode;
import com.jforce.project.exception.GenericException;
import com.jforce.project.exception.Throw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    public final static TimeZone ISTANBUL;

    private final static String DATE_FORMAT_STRING;
    private final static String NOTIFICATION_FORMAT_STRING;

    static {
        ISTANBUL = TimeZone.getTimeZone("Europe/Istanbul");
        DATE_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";
        NOTIFICATION_FORMAT_STRING = "dd MMMM";
    }

    private DateUtils() {
    }

    public static Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance(ISTANBUL);
        return calendar;
    }

    public static Calendar getCalendar(Date date) {
        Calendar c = getCalendar();
        c.setTime(date);
        return c;
    }

    public static Date getCurrentTime() {
        return getCalendar().getTime();
    }

    public static Date getAfterTime(int type, int amount) {
        Calendar calendar = getCalendar();
        calendar.add(type, amount);
        return calendar.getTime();
    }

    public static Date parseDate(String dateString) throws GenericException {
        if (dateString == null || dateString.trim().isEmpty()) {
            return null;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
            dateFormat.setTimeZone(ISTANBUL);
            return dateFormat.parse(dateString.trim());
        } catch (ParseException ex) {
            Throw.throwException(ErrorCode.UNKNOWN, "Cannot parse  " + dateString + " with DateFormat " + DATE_FORMAT_STRING, ex);
            return null;
        } catch (Exception ex) {
            Throw.throwException(ErrorCode.UNKNOWN, "Cannot parse  " + dateString + " with DateFormat " + DATE_FORMAT_STRING, ex);
            return null;
        }
    }

    public static String toDateString(Date date) {

        if (date == null) {
            return null;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
        dateFormat.setTimeZone(ISTANBUL);
        return dateFormat.format(date);
    }
}
