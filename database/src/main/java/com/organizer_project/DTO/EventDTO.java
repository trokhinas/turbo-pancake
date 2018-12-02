package com.organizer_project.DTO;

import java.util.Date;

public class EventDTO {
    private int eventId;
    private String eventName;
    private boolean notify;
    private boolean signal;
    private Date eventTime;

    //eventId
    public int getEventId() {
        return eventId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    //eventName
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    //Notify
    public boolean isNotify() {
        return notify;
    }
    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    //Signal
    public boolean isSignal() {
        return signal;
    }
    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    //EventTime
    public Date getEventTime() {
        return eventTime;
    }
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }
}
