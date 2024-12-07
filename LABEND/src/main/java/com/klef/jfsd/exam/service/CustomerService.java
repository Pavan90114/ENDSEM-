package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Insert a new customer
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Update customer name and address
    public Customer updateCustomer(Long customerId, String name, String address) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));
        customer.setName(name);
        customer.setAddress(address);
        return customerRepository.save(customer);
    }
}
