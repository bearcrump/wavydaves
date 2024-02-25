package com.wavydaves.api.services;

import com.wavydaves.api.interfaces.IUserService;
import com.wavydaves.api.models.User;
import com.wavydaves.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(Integer id) {
        var result = userRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No users with Id " + id + "found.");
        }     
        return null;
    }

    public List<User> getUsersByFirstName(String firstName) {
        var result = userRepository.getUserByFirstName(firstName);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No users with first name " + firstName + "found.");
        }     
        return null;
    }

    public List<User> getUsersByLastName(String lastName) {
        var result = userRepository.getUserByLastName(lastName);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No users with last name " + lastName + "found.");
        }
        return null;
    }

    public User getUserByEmail(String email) {
        var result = userRepository.getUserByEmail(email);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No users with email" + email + "found.");
        }
        return null;
    }

    public List<User> getUsersByPhoneNumber(String phoneNumber) {
        var result = userRepository.getUsersByPhoneNumber(phoneNumber);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No users with phone number " + phoneNumber + "found.");
        }
        return null;
    }

    public List<User> getAdminUsers() {
        List<User> adminUsers = new ArrayList<User>();
        var result = userRepository.findByAdminTrue();
        if (!result.isEmpty()) {
            for (User user : result) {
                adminUsers.add(user);
            }
            return adminUsers;
        }
        else {
            System.out.println("No admin users found");
        }
        return null;
    }

    public User upsertUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteAllById(userId);
    }
}
