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

    @GetMapping("/id")
    public ResponseEntity<User> getByUserId(@RequestParam Integer userId) {
        return ResponseEntity.ok(userService.getById(userId));
    }

    @GetMapping("/first_name")
    public ResponseEntity<List<User>> getUserByFirstName(@RequestParam String firstName) {
        return ResponseEntity.ok(userService.getUsersByFirstName(firstName));
    }

    @GetMapping("/last_name")
    public ResponseEntity<List<User>> getUsersByLastName(@RequestParam String lastName) {
        return ResponseEntity.ok(userService.getUsersByLastName(lastName));
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.upsertUser(user));
    }

    @PutMapping
    public ResponseEntity<User> putUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.upsertUser(user));
    }

    @DeleteMapping
    public void deleteUserById(@RequestParam Integer userId) {
        userService.deleteUser(userId);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}
