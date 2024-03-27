package com.wavydaves.api.interfaces;

import java.util.List;
import com.wavydaves.api.models.CreditCard;

public interface ICreditCardService {
    public boolean authorizeCard(Integer cardNumber);
    public CreditCard getCreditCardbyId(Integer id);
    public List<CreditCard> getCreditCardsByUserId(Integer userId);
    public CreditCard upsertCreditCard(CreditCard creditCard);
    public void deleteCreditCardById(Integer id);
}
