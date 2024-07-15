package com.paymentservice.repository;

import com.paymentservice.entities.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    //customer find the method

    List<Payment> findByUserId(String userId);
    List<Payment> findByProductId(String productId);

}
