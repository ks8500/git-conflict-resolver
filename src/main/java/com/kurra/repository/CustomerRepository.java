package com.kurra.repository;

import com.kurra.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class CustomerRepository {

    private final Map<Integer, Customer> DB = new HashMap<>();

    public List<Customer> findAll(){
        DB.put(1,new Customer(1,"sravan1",29,"jhalli"));
        DB.put(2,new Customer(2,"sravan2",28,"jhalli"));
        DB.put(3,new Customer(3,"sravan3",27,"jhalli"));
        DB.put(4,new Customer(4,"sravan4",26,"jhalli"));
        DB.put(5,new Customer(5,"sravan5",25,"jhalli"));
        DB.put(6,new Customer(6,"sravan6",6,"jhalli"));
        DB.put(7,new Customer(7,"sravan7",7,"jhalli"));
        DB.put(8,new Customer(8,"sravan8",8,"jhalli"));
        return DB.values().stream().collect(Collectors.toList());
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
