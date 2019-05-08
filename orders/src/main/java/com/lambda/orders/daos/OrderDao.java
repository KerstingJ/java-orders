package com.lambda.orders.daos;

import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDao extends CrudRepository<Order, Long>
{
    List<Order> findAllByCustomer(Customer customer);
}
