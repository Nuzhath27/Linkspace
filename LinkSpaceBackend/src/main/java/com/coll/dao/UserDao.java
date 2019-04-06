package com.coll.dao;

import com.coll.models.User;

public interface UserDao {
void registerUser(User user);
boolean isEmailValid(String email);
User login(User user);
void update(User user);
User getUser(String email);
}
