package com.TaskManager.dao;

import com.TaskManager.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;


// Extending the SpringData JPA, for CRUD methods
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
