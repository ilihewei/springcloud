package com.test.cn.service;

import com.test.cn.entity.Payment;

public interface PaymentService {

    int create(Payment payment);
    Payment  getPaymentById(Integer id);

}
