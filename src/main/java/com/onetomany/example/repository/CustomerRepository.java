package com.onetomany.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onetomany.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
// commenting in repo gitdemo