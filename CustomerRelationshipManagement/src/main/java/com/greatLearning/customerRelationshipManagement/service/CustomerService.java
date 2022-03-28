package com.greatLearning.customerRelationshipManagement.service;

import java.util.List;
import com.greatLearning.customerRelationshipManagement.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}