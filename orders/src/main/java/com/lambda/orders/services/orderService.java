package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.List;

public interface orderService
{
    //Create
    Customer save(Order order);

    // Read
    List<Order> findAll();
    List<Order> findAllByAgent(Agent agent);
    List<Order> findAllByCustomer(Customer customer);

    // Update
    Customer update(Order order, long ordCode);

    // Delete
    void delete(long ordCode);
}
