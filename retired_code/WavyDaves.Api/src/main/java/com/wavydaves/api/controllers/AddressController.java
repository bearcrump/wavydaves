package com.wavydaves.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wavydaves.api.interfaces.IAddressService;
import com.wavydaves.api.models.Address;

@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {

    private final IAddressService addressService;

    @Autowired
    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/id")
    public ResponseEntity<Address> getAddressById(@RequestParam Integer id) {
        return ResponseEntity.ok(addressService.getAddressById(id));
    }

    @GetMapping("/country")
    public ResponseEntity<List<Address>> getAddressesByCountry(@RequestParam String country) {
        return ResponseEntity.ok(addressService.getAddressesByCountry(country));
    }

    @GetMapping("/state")
    public ResponseEntity<List<Address>> getAddressesByState(@RequestParam String state) {
        return ResponseEntity.ok(addressService.getAddressesByState(state));
    }

    @GetMapping("/city")
    public ResponseEntity<List<Address>> getAddressesByCity(@RequestParam String city) {
        return ResponseEntity.ok(addressService.getAddressesByCity(city));
    }

    @GetMapping("/zip")
    public ResponseEntity<List<Address>> getAddressesByZip(@RequestParam Integer zip) {
        return ResponseEntity.ok(addressService.getAddressesByZip(zip));
    }

    @PostMapping
    public ResponseEntity<Address> postItem(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.upsertAddress(address));
    }

    @PutMapping
    public ResponseEntity<Address> putItem(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.upsertAddress(address));
    }

    @DeleteMapping
    public void deleteAddressById(@RequestParam Integer id) {
        addressService.deleteAddressById(id);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }
}
