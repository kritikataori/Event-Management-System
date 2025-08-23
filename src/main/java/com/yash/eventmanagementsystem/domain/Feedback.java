package com.yash.eventmanagementsystem.domain;

public class Feedback {
    private int feedbackId;
    private int userId;
    private int eventId;
    private String type;        // general-purpose or event-specific
    private int categoryId; // nullable if general-purpose
    private String remark;
    // Default constructor
    public Feedback() {
    }
    // Parameterized constructor
    public Feedback(int feedbackId, int userId, int eventId, String type, int categoryId, String remark) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.eventId = eventId;
        this.type = type;
        this.categoryId = categoryId;
        this.remark = remark;
    }
    // Getters
    public int getFeedbackId() {
        return feedbackId;
    }
    public int getUserId() {
        return userId;
    }
    public int getEventId() {
        return eventId;
    }
    public String getType() {
        return type;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public String getRemark() {
        return remark;
    }
    // Setters
    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    // toString
    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", userId=" + userId +
                ", eventId=" + eventId +
                ", type='" + type + '\'' +
                ", categoryId=" + categoryId +
                ", remark='" + remark + '\'' +
                '}';
    }
    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Feedback feedback = (Feedback) obj;
        return feedbackId == feedback.feedbackId &&
                userId == feedback.userId &&
                eventId == feedback.eventId &&
                java.util.Objects.equals(type, feedback.type) &&
                java.util.Objects.equals(categoryId, feedback.categoryId) &&
                java.util.Objects.equals(remark, feedback.remark);
    }
    // hashCode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(feedbackId, userId, eventId, type, categoryId, remark);
    }
}