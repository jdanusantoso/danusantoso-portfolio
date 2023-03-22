package com.revature.service;

import com.revature.models.PaymentInformation;
import com.revature.repositories.PaymentInformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentInformationService {

    private final PaymentInformationRepository paymentInformationRepository;


    public PaymentInformation save(PaymentInformation p) {
        return paymentInformationRepository.save(p);
    }


}
