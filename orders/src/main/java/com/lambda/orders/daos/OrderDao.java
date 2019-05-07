package com.lambda.orders.daos;

import com.lambda.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao extends CrudRepository<Order, Long>
{
}
