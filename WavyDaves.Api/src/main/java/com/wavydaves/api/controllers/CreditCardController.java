package com.wavydaves.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.wavydaves.api.interfaces.ICreditCardService;

@RestController
public class CreditCardController {
    
    private final ICreditCardService creditCardService;

    @Autowired
    CreditCardController(ICreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    



}
