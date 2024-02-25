package com.wavydaves.api.interfaces;

import com.wavydaves.api.models.User;
import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public User getById(Integer id);
    public List<User> getUsersByFirstName(String firstName);
    public List<User> getUsersByLastName(String lastName);
    public User getUserByEmail(String email);
    public List<User> getUsersByPhoneNumber(String phoneNumber);
    public List<User> getAdminUsers();
    public User upsertUser(User user);
    public void deleteUser(Integer userId);
}
