package com.kurra.service;

import com.kurra.dto.Customer;
import com.kurra.repository.CustomerRepository;
import com.kurra.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers(){
        return repository.findAll();
    }

    public Customer saveCustomer(Customer dto){
        return repository.saveCustomer(dto);
    }

    public Customer findByCustomerId(int id){
        return repository.findById(id);
    }

    public Customer updateCustomer(Customer customer){
        return repository.updateCustomer(customer);
    }

    public String deleteCustomerById(int id){
        repository.deleteCustomerById(id);
        return Util.toUpperCase("customer deleted successfully");
    }



}
