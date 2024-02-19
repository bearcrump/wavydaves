package com.wavydaves.api.repositories;

import com.wavydaves.api.models.User;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface BaseRepository<T> {

    public getById(Integer id, List<T> list) {
        for (T t : list) {
            if (t.getClass(.equals(id)) {
                return t;
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
            if (user.getId().equals(lastName)) {
                return user;
            }
            else {
                System.out.println("No users with last name " + lastName + "found.");
            }
        }
        return null;
    }

    public User getUsers(Integer id) {
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
}
