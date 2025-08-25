package com.yash.eventmanagementsystem.domain;

import java.sql.Timestamp;
import java.util.Objects;

public class Registration {
    private int reg_id;
    private int user_id;
    private int event_id;
    private Status status;
    private Timestamp time;

    public enum Status {
        PENDING,
        APPROVED,
        REJECTED
    }

    public Registration() {
    }

    public Registration(int reg_id, int user_id, int event_id, Status status, Timestamp time) {
        this.reg_id = reg_id;
        this.user_id = user_id;
        this.event_id = event_id;
        this.status = status;
        this.time = time;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return reg_id == that.reg_id && user_id == that.user_id && event_id == that.event_id && status == that.status && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reg_id, user_id, event_id, status, time);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "reg_id=" + reg_id +
                ", user_id=" + user_id +
                ", event_id=" + event_id +
                ", status=" + status +
                ", time=" + time +
                '}';
    }
}
