package com.wavydaves.api.repositories;

import com.wavydaves.api.models.User;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {



    //Written with JPQL syntax??


    // ~~~~~ Taken From IUserService ~~~~~~~~~
    // public List<User> getAllUsers();
    // public User getById(Integer id);
    // public User getUserByFirstName(String firstName); --TODO findByProperty?
    // public User getUserByLastName(String lastName); -- TODO findByProperty?
    // public User getUserByEmail(String email); --TODO
    // public User getUserByPhoneNumber(String phoneNumber); -- TODO
    // public ArrayList<User> getAdminUsers(); -- TODO
    // public void postUser(User user);
    // public void updateUser(User newUser);
    // public void deleteUser(Integer userId);

    @Query("SELECT u FROM User u")
    List<User> findAll();

    // @Query("")
    // Optional<User> findById(Integer id);
    // some other repository methods hopefully.


    @Transactional
    User save(User user);
    void deleteAllById(Integer id);

}
