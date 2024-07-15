package com.paymentservice.service;

import com.paymentservice.entities.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaymentService {

    //Create

    Payment create(Payment payment);

    //get all payments

    List<Payment> getPayments();
//get all by userId
    List<Payment> getPaymentByUserId(String userId);

    //get all by productid

    List<Payment> getPaymentByProductId(String productId);
}
