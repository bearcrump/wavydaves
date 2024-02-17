package com.WavyDaves.Api.controllers;

import com.WavyDaves.Api.interfaces.IUserService;
import com.WavyDaves.Api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    @Autowired
    private IUserService userService;
    private ArrayList<User> fakeUsers = new ArrayList<User>();

    UsersController(IUserService userService) {
        this.userService = userService;
        addUsers();
    }

    public void addUsers () {
        User dirf = new User(null, null,null,"Dirf","McDoogenhauser", "itzDirfOrNuthin@dmail.net", "dirfedyermom", "689-6969", false);
        User doot = new User(null,null,null,"Doot", "Doot", "doot@doot.doot", "doot", "979-9797",false);
        this.fakeUsers.add(dirf);
        this.fakeUsers.add(doot);
    }

    @GetMapping
    public ArrayList<User> getAllUsers() {
        return fakeUsers;
    }

    //@GetMapping("/byFirstName")
    @GetMapping
    public User getUserByFirstName(@RequestParam String firstname) {
        for (User user : fakeUsers ) {
            if (user.firstName().equals(firstname)) {
                return user;
            }
        }
        return null;
    }
}
