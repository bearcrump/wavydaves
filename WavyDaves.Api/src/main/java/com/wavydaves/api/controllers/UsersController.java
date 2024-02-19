package com.wavydaves.api.controllers;

import com.wavydaves.api.interfaces.IUserService;
import com.wavydaves.api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    private final IUserService userService;

    @Autowired
    UsersController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping
    public ResponseEntity<User> getByUserId(Integer userId) {
        return ResponseEntity.ok(userService.getById(userId));
    }

    @GetMapping("/FirstName")
    public User getUserByFirstName(@RequestParam String firstname) {
        return userService.getUserByFirstName(firstname);
    }

    @GetMapping("/LastName")
    public User getUserByLastName(@RequestParam String lastName) {
        return userService.getUserByLastName(lastName);
    }

    @PostMapping
    public void postUser(User user) {
        userService.postUser(user);
    }

    @PutMapping
    public void putUser(User user) {
        userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUserById(Integer userId) {
        userService.deleteUser(userId);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}
