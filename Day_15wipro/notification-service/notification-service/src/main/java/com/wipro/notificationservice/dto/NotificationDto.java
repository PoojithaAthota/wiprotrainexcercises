package com.wipro.notificationservice.dto;

public class NotificationDto {
    private User user;
    private String action;
    
    public NotificationDto() {
        // default constructor
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
}
