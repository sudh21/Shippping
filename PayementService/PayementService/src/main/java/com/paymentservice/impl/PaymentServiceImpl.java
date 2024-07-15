package com.paymentservice.impl;

import com.paymentservice.entities.Payment;
import com.paymentservice.repository.PaymentRepository;
import com.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {
@Autowired
private PaymentRepository paymentRepository;
    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getPayments() {

        return paymentRepository.findAll();
    }

    @Override
    public List<Payment> getPaymentByUserId(String userId) {

        return paymentRepository.findByUserId(userId);
    }

    @Override
    public List<Payment> getPaymentByProductId(String productId) {
        return paymentRepository.findByProductId(productId);
    }
}
