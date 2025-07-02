package com.example.api.springboot_api.repository;

import com.example.api.springboot_api.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
