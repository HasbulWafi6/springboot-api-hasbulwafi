package com.example.api.springboot_api.repository;

import com.example.api.springboot_api.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
