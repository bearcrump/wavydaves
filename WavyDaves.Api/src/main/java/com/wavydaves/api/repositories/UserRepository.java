package com.wavydaves.api.repositories;

import com.wavydaves.api.models.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class UserRepository {

    //public UserRepository() {}
    private ArrayList<User> fakeUsers;
    public UserRepository() {
        addUsers();
    }

    public void addUsers () {
        User dirf = new User(null, null,null,"Dirf","McDoogenhauser", "itzDirfOrNuthin@dmail.net", "dirfedyermom", "689-6969", null);
        User doot = new User(null,null,null,"Doot", "Doot", "doot@doot.doot", "doot", "979-9797",false);
        this.fakeUsers.add(dirf);
        this.fakeUsers.add(doot);
    }

    public ArrayList<User> getUsers() {
        return fakeUsers;
    }




}
