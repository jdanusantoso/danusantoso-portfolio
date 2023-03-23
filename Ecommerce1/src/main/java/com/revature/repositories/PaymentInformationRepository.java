package com.revature.repositories;

import com.revature.models.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInformationRepository extends JpaRepository<PaymentInformation, Integer> {


    PaymentInformation save(PaymentInformation p);



}
