package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;

import java.util.ArrayList;

public interface CustomerService
{
    //Create
    Customer save(Customer customer);

    // Read
    Customer findCustomerByName(String custName);
    ArrayList<Customer> findAll();
    ArrayList<Customer> findAllByAgent(Agent agent);

    // Update
    Customer update(Customer customer, long custCode);

    // Delete
    void delete(long custCode);
}
