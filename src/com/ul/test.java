package com.ul;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.utils.XDate;

public class test {

    private static int getCurrentWeek() {
        LocalDate date = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return date.get(weekFields.weekOfWeekBasedYear());
    }
    private static Date getFirstDateOfWeek(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.WEEK_OF_YEAR, getCurrentWeek());
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }
    public static void main(String[] args) throws Exception {
        Calendar c = Calendar.getInstance();   // this takes current date
        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c.set(Calendar.DAY_OF_MONTH, days);
        System.out.println(XDate.toString(c.getTime(),"dd-MM-yyyy")); 
    }
}
