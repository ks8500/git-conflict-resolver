package com.kurra.service;

import com.kurra.dto.Customer;
import com.kurra.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        repository.findAll();
        return customers;
    }

    public Customer saveCustomer(Customer dto){
        return repository.saveCustomer(dto);
    }

    public Customer findByCustomerId(int id){
        return repository.findById(id);
    }

    public String deleteCustomerById(int id){
        repository.deleteCustomerById(id);
        return "customer deleted successfully";
    }



}
