package com.lambda.orders.daos;

import com.lambda.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentDao extends CrudRepository<Agent, Long>
{
}
