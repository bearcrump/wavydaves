package com.wavydaves.api.controllers;

import com.wavydaves.api.interfaces.IUserService;
import com.wavydaves.api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    private final IUserService userService;
    private ArrayList<User> fakeUsers = new ArrayList<User>();

    @Autowired
    UsersController(IUserService userService) {
        this.userService = userService;
        addUsers();
    }

    public void addUsers () {
        User dirf = new User(null, null,null,"Dirf","McDoogenhauser", "itzDirfOrNuthin@dmail.net", "dirfedyermom", "689-6969", null);
        User doot = new User(null,null,null,"Doot", "Doot", "doot@doot.doot", "doot", "979-9797",false);
        this.fakeUsers.add(dirf);
        this.fakeUsers.add(doot);
    }

    @GetMapping
    public ResponseEntity<ArrayList<User>> getAllUsers() {
        return ResponseEntity.ok(fakeUsers);
    }

    @GetMapping("/byFirstName")
    public User getUserByFirstName(@RequestParam String firstname) {
        for (User user : fakeUsers ) {
            if (user.getFirstName().equals(firstname)) {
                return user;
            }
        }
        return null;
    }

    @PostMapping
    public void postUser() {
        throw new RuntimeException("Method not Implemented");
    }

    @PutMapping
    public void putUser() {
        throw new RuntimeException("Method not implemented");
    }

    @DeleteMapping
    public void deleteUserById() {
        throw new RuntimeException("Method not Implemented");
    }
}
