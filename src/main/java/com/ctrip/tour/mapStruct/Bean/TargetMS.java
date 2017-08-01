package com.ctrip.tour.mapStruct.Bean;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class TargetMS {
    private Calendar timestamp;
    private Calendar date;
    private String calendar;

    public TargetMS(Calendar timestamp, Calendar date, String calendar) {
        this.timestamp = timestamp;
        this.date = date;
        this.calendar = calendar;
    }

    public TargetMS() {
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }
}
