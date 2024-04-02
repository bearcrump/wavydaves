package com.wavydaves.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.wavydaves.api.interfaces.ICreditCardService;
import com.wavydaves.api.models.CreditCard;
import org.springframework.

@RestController
@RequestMapping("api/v1/credit_cards")
public class CreditCardController {
    
    private final ICreditCardService creditCardService;

    @Autowired
    CreditCardController(ICreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @PostMapping("auth")
    public ResponseEntity<Boolean> authorizeCard(@RequestBody String cardNumber) {
        boolean auth = creditCardService.authorizeCard(cardNumber);

        return ResponseEntity.ok(creditCardService.authorizeCard(cardNumber));
    }

    @GetMapping("/id")
    public ResponseEntity<CreditCard> getCreditCardbyId(@RequestParam Integer id) {
        return ResponseEntity.ok(creditCardService.getCreditCardbyId(id));
    }

    @GetMapping("/user_id")
    public ResponseEntity<List<CreditCard>> getCreditCardsByUserId(Integer userId) {
        return ResponseEntity.ok(creditCardService.getCreditCardsByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<CreditCard> postCreditCard(@RequestBody CreditCard creditCard) {
        return ResponseEntity.ok(creditCardService.upsertCreditCard(creditCard));
    }

    @PutMapping
    public ResponseEntity<CreditCard> putCreditCard(@RequestBody CreditCard creditCard) {
        return ResponseEntity.ok(creditCardService.upsertCreditCard(creditCard));
    }

    public void deleteCreditCardById(Integer id) {
        creditCardService.deleteCreditCardById(id);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }

    @ExceptionHandler(NotFound.class)
    public ResponseEntity<String> handleResourceNotFound(NotFound e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
