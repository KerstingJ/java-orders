package com.lambda.orders.daos;

import com.lambda.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Long>
{
}
