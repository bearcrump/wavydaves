package com.wavydaves.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wavydaves.api.models.Address;
import jakarta.transaction.Transactional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

    @Query("SELECT u FROM Address u")
    List<Address> getAllAddresses();

    @Query("SELECT u FROM Address u where u.id = ?1")
    Optional<Address> getAddressById(Integer id);

    @Query("SELECT u FROM Address u where u.country = ?1")
    Optional<List<Address>> getAddressesByCountry(String country);

    @Query("SELECT u FROM Address u where u.state = ?1")
    Optional<List<Address>> getAddressesByState(String state);

    @Query("SELECT u FROM Address u where u.city = ?1")
    Optional<List<Address>> getAddressesByCity(String city);

    @Query("SELECT u FROM Address u where u.zip = ?1")
    Optional<List<Address>> getAddressesByZip(Integer zip);

    @Transactional
    Address save(Address address);

    @Transactional
    void deleteAllById(Integer id);
    
}
