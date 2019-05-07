package com.lambda.orders.models;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ordNum;

    private double ordAmount, advanceAmount;

    @ManyToOne
    @JoinColumn(name="custCode", nullable=false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="agentCode", nullable=false)
    private Agent agent;

    private String ordDescription;
}
