package com.openlab.service;

import com.openlab.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getUserList();

    public void creatUser(User user);

    public void updateUser(Long id,User user);

    public void deleteUser(Long id);

    public User getUser(Long id);
}
