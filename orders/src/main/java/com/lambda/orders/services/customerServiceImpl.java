package com.lambda.orders.services;

import com.lambda.orders.daos.CustomerDao;
import com.lambda.orders.daos.OrderDao;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Service(value="customerService")
public class customerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private OrderDao orderDao;

    @Override
    public ArrayList<Customer> findAll()
    {
        ArrayList<Customer> customers = new ArrayList<>();
        customerDao.findAll().iterator().forEachRemaining(c -> customers.add(c));

        for (Customer c: customers) {
            c.setOrders(orderDao.findAllByCustomer(c));
        }

        return customers;
    }

    @Override
    public Customer findCustomerByName(String custName)
    {
        return customerDao.findCustomerByCustName(custName);
    }

    @Override
    public ArrayList<Customer> findAllByAgent(Agent agent)
    {
        return null;
    }

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        customerDao.save(customer);

        return customerDao.findCustomerByCustName(customer.getCustName());
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
