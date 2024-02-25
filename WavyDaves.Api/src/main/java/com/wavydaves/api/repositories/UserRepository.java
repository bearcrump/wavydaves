package com.wavydaves.api.repositories;

import com.wavydaves.api.entities.UserEntity;
import com.wavydaves.api.models.User;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {



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

    @Query("SELECT u FROM UserEntity u")
    List<UserEntity> findAll();

    @Query("")
    Optional<UserEntity> findById(Integer id);
    // some other repository methods hopefully.
    UserEntity save(UserEntity userEntity);
    void deleteAllById(Integer id);

}
