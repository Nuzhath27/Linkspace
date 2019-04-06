package com.coll.dao;

import java.util.List;


import com.coll.models.Notification;

public interface NotificationDao {
void addNotification(Notification notification);
List<Notification> getAllNotificationsNotViewed(String email);
Notification getNotification(int notificationId);
void updateNotificactionViewedStatus(int notificationId);
}