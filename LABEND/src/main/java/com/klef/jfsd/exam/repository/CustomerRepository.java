package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.exam.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
