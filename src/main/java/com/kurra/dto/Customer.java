package com.kurra.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int customerId;
    private String name;
    private int age;
    private String location;
    
//	public Customer(int customerId, String name, int age, String location) {
//		super();
//		this.customerId = customerId;
//		this.name = name;
//		this.age = age;
//		this.location = location;
//	}
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
//	@Override
//	public String toString() {
//		return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", location=" + location
//				+ "]";
//	}
//	public Customer() {
//		super();
//	}

    
    
}
