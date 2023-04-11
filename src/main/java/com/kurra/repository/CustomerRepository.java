package com.kurra.repository;

import com.kurra.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository {

    private final Map<Integer, Customer> DB = new HashMap<>();

    public List<Customer> findAll(){

        DB.put(6,new Customer(6,"sravan6",6,"jhalli"));
        DB.put(7,new Customer(7,"sravan7",7,"jhalli"));
        DB.put(8,new Customer(8,"sravan8",8,"jhalli"));
        return new ArrayList<>(DB.values());
    }

    public Customer findById(int id){
        return DB.get(id);
    }

    public void deleteCustomerById(int id){
        DB.remove(id);
    }

    public Customer saveCustomer(Customer customer){
        DB.put(customer.getCustomerId(), customer);
        return DB.get(customer.getCustomerId());
    }


    public Customer updateCustomer(Customer customer) {
        return new Customer();
    }
}
