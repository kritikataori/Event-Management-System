package com.yash.eventmanagementsystem.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Event {
    private int eventId;
    private int categoryId;
    private String eventName;
    private LocalDate startDate;   // registration start date
    private LocalDate endDate;     // registration end date
    private String location;
    private LocalDate eventDay;
    private LocalTime eventTime;
    private EventStatus eventStatus;

    public enum EventStatus {
        ACTIVE,
        UPCOMING,
        COMPLETED
    }

    public Event(int eventId) {
        this.eventId = eventId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEventDay() {
        return eventDay;
    }

    public void setEventDay(LocalDate eventDay) {
        this.eventDay = eventDay;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Event(int categoryId, LocalDate endDate, LocalDate eventDay, int eventId, String eventName, EventStatus eventStatus, LocalTime eventTime, String location, LocalDate startDate) {
        this.categoryId = categoryId;
        this.endDate = endDate;
        this.eventDay = eventDay;
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventStatus = eventStatus;
        this.eventTime = eventTime;
        this.location = location;
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventId == event.eventId && categoryId == event.categoryId && Objects.equals(eventName, event.eventName) && Objects.equals(startDate, event.startDate) && Objects.equals(endDate, event.endDate) && Objects.equals(location, event.location) && Objects.equals(eventDay, event.eventDay) && Objects.equals(eventTime, event.eventTime) && eventStatus == event.eventStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, categoryId, eventName, startDate, endDate, location, eventDay, eventTime, eventStatus);
    }

    @Override
    public String toString() {
        return "Event{" +
                "categoryId=" + categoryId +
                ", eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", location='" + location + '\'' +
                ", eventDay=" + eventDay +
                ", eventTime=" + eventTime +
                ", eventStatus=" + eventStatus +
                '}';
    }
}
