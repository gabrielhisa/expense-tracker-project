package com.TaskManager.service;

import com.TaskManager.dao.ExpenseRepository;
import com.TaskManager.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImplementation implements ExpenseService {

    private ExpenseRepository expenseRepository;

    @Autowired // Assigns object creation to SpringBoot
    public ExpenseServiceImplementation(ExpenseRepository expenseRepository){ // Injecting the DAO class, which will allow for SpringData JPA CRUD methods to be called
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll(); // SpringData JPA method
    }

    @Override
    public Optional<Expense> findById(Integer id) {
        return expenseRepository.findById(id);
    }

    @Override
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public void deleteById(Integer id) {
        expenseRepository.deleteById(id);
    }
}
