package com.wavydaves.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wavydaves.api.models.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<Integer, CreditCard> {
    
}
