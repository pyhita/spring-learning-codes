package com.pyhita.aop.a_aspectj.service;

import java.util.List;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public interface OrderService {

    void createOrder();

    void deleteOrderById(String id);

    String getOrderById(String id);

    List<String> findAll();
}