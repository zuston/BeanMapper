package com.ctrip.tour.mapStruct.Bean;

import java.util.Calendar;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class SourceAMS {
    private Calendar timestamp;
    private Calendar date;
    public SourceAMS(){

    }

    public SourceAMS(Calendar timestamp, Calendar date){
        this.timestamp = timestamp;
        this.date = date;
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
}
