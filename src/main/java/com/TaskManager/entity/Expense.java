package com.TaskManager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity // Tells SpringBoot this relates to an entity on the DB
@Table(name="expense")
public class Expense {

    @Id // Sets this var as the key in the DB table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto generate ID number
    @Column(name="id") // Assigns this var to a column in the DB
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="date")
    private Date date;

    @Column(name="amount")
    private double amount;


    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
