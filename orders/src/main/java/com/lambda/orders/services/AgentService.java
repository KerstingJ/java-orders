package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.ArrayList;

public interface AgentService
{
    //Create
    Customer save(Agent agent);

    // Read
    ArrayList<Agent> findAll();
    Agent findByCustomer(Customer customer);
    Agent findByOrder(Order order);

    // Update
    Customer update(Agent agent, long agentCode);

    // Delete
    void delete(long agentCode);
}
