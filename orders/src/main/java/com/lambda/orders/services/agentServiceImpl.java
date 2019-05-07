package com.lambda.orders.services;

import com.lambda.orders.daos.AgentDao;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value="agentService")
public class agentServiceImpl implements agentService
{
    @Autowired
    private AgentDao agentDao;

    @Override
    public Customer save(Agent agent)
    {
        return null;
    }

    @Override
    public List<Agent> findAll()
    {
        return null;
    }

    @Override
    public Agent findByCustomer(Customer customer)
    {
        return null;
    }

    @Override
    public Agent findByOrder(Order order)
    {
        return null;
    }

    @Override
    public Customer update(Agent agent, long agentCode)
    {
        return null;
    }

    @Override
    public void delete(long agentCode)
    {

    }
}
