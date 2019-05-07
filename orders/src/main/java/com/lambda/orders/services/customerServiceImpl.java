package com.lambda.orders.services;

import com.lambda.orders.daos.CustomerDao;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value="customerService")
public class customerServiceImpl implements customerService
{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> findAll()
    {
        return null;
    }

    @Override
    public List<Customer> findAllByAgent(Agent agent)
    {
        return null;
    }

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return null;
    }

    @Transactional
    @Override
    public Customer update(Customer customer, long custCode)
    {
        return null;
    }

    @Override
    public void delete(long custCode)
    {

    }
}
