package com.kurra.controller;

import com.kurra.dto.Customer;
import com.kurra.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;


    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return service.findByCustomerId(id);
    }

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }


    @DeleteMapping("/delete")
    public String deleteCustomerById(@RequestParam(required = true) int id){
        return service.deleteCustomerById(id);
    }




}
