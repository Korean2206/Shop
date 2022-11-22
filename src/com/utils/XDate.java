package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    /**
     * Chuyển đổi String sang Date
     * @param date là String cần chuyển
     * @param pattern là định dạng thời gian
     * @return Date kết quả
     */
    
    public static Date toDate(String stringDate, String pattern) {
        try {
            Date date = new SimpleDateFormat(pattern).parse(stringDate);
            return date;
        } 
        catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static String toString(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

}
