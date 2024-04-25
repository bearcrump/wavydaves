package com.wavydaves.api.interfaces;

import java.util.List;
import com.wavydaves.api.models.Address;

public interface IAddressService {
    public List<Address> getAllAddresses();
    public Address getAddressById(Integer id);
    public List<Address> getAddressesByCountry(String country);
    public List<Address> getAddressesByState(String state);
    public List<Address> getAddressesByCity(String city);
    public List<Address> getAddressesByZip(Integer zip);
    public Address upsertAddress(Address address);
    public void deleteAddressById(Integer id);
}
