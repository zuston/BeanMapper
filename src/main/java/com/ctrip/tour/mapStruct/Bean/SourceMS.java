package com.ctrip.tour.mapStruct.Bean;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class SourceMS {
    private Timestamp timestamp;
    private Date date;
    private Calendar calendar;

    public SourceMS() {
    }

    public SourceMS(Timestamp timestamp, Date date, Calendar calendar) {
        this.timestamp = timestamp;
        this.date = date;
        this.calendar = calendar;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
