package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;

import java.util.List;

public interface customerService
{
    //Create
    Customer save(Customer customer);

    // Read
    List<Customer> findAll();
    List<Customer> findAllByAgent(Agent agent);

    // Update
    Customer update(Customer customer, long custCode);

    // Delete
    void delete(long custCode);
}
