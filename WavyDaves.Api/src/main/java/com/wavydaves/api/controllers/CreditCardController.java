package com.wavydaves.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wavydaves.api.interfaces.ICreditCardService;
import com.wavydaves.api.models.CreditCard;

@RestController
@RequestMapping("api/v1/credit_cards")
public class CreditCardController {
    
    private final ICreditCardService creditCardService;

    @Autowired
    CreditCardController(ICreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @PostMapping("auth")
    public ResponseEntity<Boolean> authorizeCard(@RequestBody Integer cardNumber) {
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
}
