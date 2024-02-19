package com.wavydaves.api.services;

import com.wavydaves.api.interfaces.IUserService;
import com.wavydaves.api.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    private ArrayList<User> fakeUsers = new ArrayList<User>();
    public UserService() {
        addUsers();
    }

    public void addUsers () {
        User dirf = new User(null, null,null,"Dirf","McDoogenhauser", "itzDirfOrNuthin@dmail.net", "dirfedyermom", "689-6969", null);
        User doot = new User(null,null,null,"Doot", "Doot", "doot@doot.doot", "doot", "979-9797",false);
        fakeUsers.add(dirf);
        fakeUsers.add(doot);
    }

    public ArrayList<User> getUsers() {
        return fakeUsers;
    }

    public List<User> getAllUsers() {
        return fakeUsers;
    }

    public User getById(Integer id) {
        for (User user : fakeUsers) {
            if (user.getId().equals(id)) {
                return user;
            }
            else {
                System.out.println("No users with Id " + id + "found.");
            }
        }
        return null;
    }

    public User getUserByFirstName(String firstName) {
        for (User user : fakeUsers) {
            if (user.getFirstName().equals(firstName)) {
                return user;
            }
            else {
                System.out.println("No users with first name " + firstName + "found.");
            }
        }
        return null;
    }

    public User getUserByLastName(String lastName) {
        for (User user : fakeUsers) {
            if (user.getLastName().equals(lastName)) {
                return user;
            }
            else {
                System.out.println("No users with last name " + lastName + "found.");
            }
        }
        return null;
    }

    public User getUserByEmail(String email) {
        for (User user : fakeUsers) {
            if (user.getEmail().equals(email)) {
                return user;
            }
            else {
                System.out.println("No users with email " + email + "found.");
            }
        }
        return null;
    }

    public User getUserByPhoneNumber(String phoneNumber) {
        for (User user : fakeUsers) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                return user;
            }
            else {
                System.out.println("No users with phone number " + phoneNumber + "found.");
            }
        }
        return null;
    }

    public ArrayList<User> getAdminUsers() {

        ArrayList<User> admins = new ArrayList<User>();

        for (User user : fakeUsers) {
            if (user.getAdmin().equals(true)) {
                admins.add(user);
            }
            else {
                System.out.println("No admins found.");
            }
        }
        return admins;
    }

    public void postUser(User user) {
        fakeUsers.add(user);
    }

    public void updateUser(User newUser) {
        for (User user : fakeUsers) {
            if (newUser.equals(user)) {
                user = newUser;
                return;
            }
        }
        System.out.println("Matching user could not be found - no users updated");
    }

    public void deleteUser(Integer userId) {
        for (User user : fakeUsers) {
            if (userId.equals(user.getId())) {
                fakeUsers.remove(user);
                return;
            }
        }
        System.out.println("Matching user could not be found - no users deleted");
    }
}
