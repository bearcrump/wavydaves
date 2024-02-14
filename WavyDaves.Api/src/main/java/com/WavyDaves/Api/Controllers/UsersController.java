package com.WavyDaves.Api.Controllers;

import com.WavyDaves.Api.Models.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {
    private ArrayList<User> users = new ArrayList<User>();

    UsersController() {
        addUsers();
    }

    public void addUsers () {
        User dirf = new User("Dirf", "McDoogenhauser", "itzDirfOrNuthin@dmail.net", "dirfedyermom", false);
        User doot = new User("Doot", "Doot", "doot@doot.doot", "doot", false);
        this.users.add(dirf);
        this.users.add(doot);
    }

    @GetMapping
    public ArrayList<User> getAllUsers() {
        return users;
    }

    @GetMapping("/byFirstName")
    public User getUserByFirstName(@RequestParam String firstname) {
        for (User user : users ) {
            if (user.getFirstName().equals(firstname)) {
                return user;
            }
        }
        return null;
    }

}
