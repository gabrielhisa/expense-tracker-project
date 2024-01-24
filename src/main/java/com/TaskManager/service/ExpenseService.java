package com.TaskManager.service;

import com.TaskManager.entity.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {

    List<Expense> findAll();

    Optional<Expense> findById(Integer id);

    Expense save(Expense expense);

    void deleteById(Integer id);

}
