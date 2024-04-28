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

    @Query("SELECT u FROM User u")
    List<User> getAllUsers();

    @Query("SELECT u FROM User u where u.id = ?1")
    Optional<User> getUserById(Integer id);

    @Query("SELECT u FROM User u where u.firstName = ?1")
    Optional<List<User>> getUserByFirstName(String firstName);

    @Query("SELECT u FROM User u where u.lastName = ?1")
    Optional<List<User>> getUserByLastName(String lastName);

    @Query("SELECT u FROM User u where u.email = ?1")
    Optional<User> getUserByEmail(String email);

    @Query("SELECT u FROM User u where u.phoneNumber = ?1")
    Optional<List<User>> getUsersByPhoneNumber(String phoneNumber);

    // TODO - Write custom queries for these later ... The framework knows better than the dev lol. 
    List<User> findByAdminTrue();

    @Transactional
    User save(User user);

    @Transactional
    void deleteAllById(Integer id);
}
