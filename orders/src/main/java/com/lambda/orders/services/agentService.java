package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.List;

public interface agentService
{
    //Create
    Customer save(Agent agent);

    // Read
    List<Agent> findAll();
    Agent findByCustomer(Customer customer);
    Agent findByOrder(Order order);

    // Update
    Customer update(Agent agent, long agentCode);

    // Delete
    void delete(long agentCode);
}
