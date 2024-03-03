package com.wavydaves.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.wavydaves.api.models.Address;
import com.wavydaves.api.repositories.AddressRepository;

public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.getAllAddresses();
    }

    public Address getAddressById(Integer id) {
        var result = addressRepository.getAddressById(id);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No addresses with Id " + id + "found.");
        }     
        return null;
    }

    public List<Address> getAddressesByCountry(String country) {
        var result = addressRepository.getAddressesByCountry(country);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No addresses with country " + country + "found.");
        }     
        return null;
    }

    public List<Address> getAddressesByState(String state) {
        var result = addressRepository.getAddressesByState(state);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No addresses with state " + state + "found.");
        }     
        return null;
    }

    public List<Address> getAddressesByCity(String city) {
        var result = addressRepository.getAddressesByCity(city);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No addresses with city " + city + "found.");
        }     
        return null;
    }

    public List<Address> getAddressesByZip(Integer zip) {
        var result = addressRepository.getAddressesByZip(zip);
        if (result.isPresent()) {
            return result.get();
        }
        else {
            System.out.println("No addresses with zip " + zip + "found.");
        }     
        return null;
    }

    public Address upsertAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddressById(Integer id) {
        addressRepository.deleteAllById(id);
    }
}
