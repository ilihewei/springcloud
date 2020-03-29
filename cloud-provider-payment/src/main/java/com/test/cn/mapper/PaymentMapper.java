package com.test.cn.mapper;

import com.test.cn.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment  getPaymentById(@Param("id") Integer id);

}
