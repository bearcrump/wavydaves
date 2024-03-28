package com.wavydaves.api.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.wavydaves.api.models.CreditCard;
import jakarta.transaction.Transactional;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
    
    @Query("SELECT u FROM CreditCard u where u.id = ?1")
    Optional<CreditCard> getCreditCardById(Integer id);

    @Query("SELECT u FROM CreditCard u where u.userId = ?1")
    Optional<List<CreditCard>> getCreditCardsByUserId(Integer userId);

    @Query("SELECT u FROM CreditCard u where u.cardNumber = ?1")
    Optional<List<CreditCard>> getCreditCardByCardNumber(Integer cardNumber);

    @Transactional
    CreditCard save(CreditCard creditCard);

    @Transactional
    void deleteById(Integer id);

}
