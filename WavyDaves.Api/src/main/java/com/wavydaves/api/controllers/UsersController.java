package com.wavydaves.api.controllers;

import com.wavydaves.api.interfaces.IUserService;
import com.wavydaves.api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}
