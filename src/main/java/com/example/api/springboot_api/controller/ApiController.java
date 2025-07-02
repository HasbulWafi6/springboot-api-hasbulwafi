package com.example.api.springboot_api.controller;

import com.example.api.springboot_api.model.Transaction;
import com.example.api.springboot_api.model.Status;
import com.example.api.springboot_api.repository.TransactionRepository;
import com.example.api.springboot_api.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private TransactionRepository transactionRepo;

    @Autowired
    private StatusRepository statusRepo;

    @GetMapping("/view-data")
    public ResponseEntity<Map<String, Object>> getViewData() {
        Map<String, Object> response = new HashMap<>();
        response.put("data", transactionRepo.findAll());
        response.put("status", statusRepo.findAll());
        return ResponseEntity.ok(response);
    }
}
