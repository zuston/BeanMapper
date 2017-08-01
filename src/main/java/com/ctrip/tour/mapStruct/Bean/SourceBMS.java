package com.ctrip.tour.mapStruct.Bean;

/**
 * Created by zhang_jf on 2017/8/1.
 */
public class SourceBMS {
    private String calendar;

    public SourceBMS(String calendar) {
        this.calendar = calendar;
    }

    public SourceBMS() {
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }
}
