package com.wavydaves.api.interfaces;

import com.wavydaves.api.models.User;
import java.util.ArrayList;
import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public User getById(Integer id);
    public User getUserByFirstName(String firstName);
    public User getUserByLastName(String lastName);
    public User getUserByEmail(String email);
    public User getUserByPhoneNumber(String phoneNumber);
    public ArrayList<User> getAdminUsers();
    public void postUser(User user);
    public void updateUser(User newUser);
    public void deleteUser(Integer userId);
}
