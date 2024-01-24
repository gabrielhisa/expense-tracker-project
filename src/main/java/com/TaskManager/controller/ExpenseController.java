package com.TaskManager.controller;

import com.TaskManager.entity.Expense;
import com.TaskManager.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // Annotation to set this class as a controller class for SpringBoot
@RequestMapping("/exp") // Base mapping for the URL requests
public class ExpenseController {

        private ExpenseService expenseService;

        public ExpenseController(ExpenseService expenseService){
            this.expenseService = expenseService;
        }

        @GetMapping("/list")
        public String listExpenses(Model theModel){ // Assigning content to a Spring Model

            // Getting a list of expenses from the DB
            List<Expense> expenses = expenseService.findAll();

            // Adding the expense information to the Spring model
            theModel.addAttribute("expenses", expenses); // Attributing the model information to a Thymeleaf tag

            return "list-expenses";

        }


}
