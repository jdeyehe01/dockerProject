package com.example.test.backend;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
