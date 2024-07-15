package com.paymentservice.controller;

import com.paymentservice.entities.Payment;
import com.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/buy")
    public ResponseEntity<Payment> create(@RequestBody Payment payment) {

        return ResponseEntity.status(HttpStatus.CREATED).body(paymentService.create(payment));
    }
@GetMapping
    public ResponseEntity<List<Payment>> getPayments() {

        return ResponseEntity.ok(paymentService.getPayments());

    }
@GetMapping("/user/{userId}")
    public ResponseEntity<List<Payment>> getPaymentByUserId(@PathVariable String userId) {

        return ResponseEntity.ok(paymentService.getPaymentByUserId(userId));


    }

    @GetMapping("product/{productId}")
    public ResponseEntity<List<Payment>> getPaymentByProductId(@PathVariable String productId) {

        return ResponseEntity.ok(paymentService.getPaymentByProductId(productId));

}
}