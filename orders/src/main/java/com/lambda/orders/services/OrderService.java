package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.ArrayList;

public interface OrderService
{
    //Create
    Customer save(Order order);

    // Read
    ArrayList<Order> findAll();
    ArrayList<Order> findAllByAgent(Agent agent);
    ArrayList<Order> findAllByCustomer(Customer customer);

    // Update
    Customer update(Order order, long ordCode);

    // Delete
    void delete(long ordCode);
}
