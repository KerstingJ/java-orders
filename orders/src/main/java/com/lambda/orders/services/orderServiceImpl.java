package com.lambda.orders.services;

import com.lambda.orders.daos.OrderDao;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value="orderService")
public class orderServiceImpl implements OrderService
{
    @Autowired
    private OrderDao orderDao;

    @Override
    public Customer save(Order order)
    {
        return null;
    }

    @Override
    public ArrayList<Order> findAll()
    {
        ArrayList<Order> orders = new ArrayList<>();
        orderDao.findAll().iterator().forEachRemaining(x -> orders.add(x));

        return orders;
    }

    @Override
    public ArrayList<Order> findAllByAgent(Agent agent)
    {
        return null;
    }

    @Override
    public ArrayList<Order> findAllByCustomer(Customer customer)
    {
        return null;
    }

    @Override
    public Customer update(Order order, long ordCode)
    {
        return null;
    }

    @Override
    public void delete(long ordCode)
    {

    }
}
