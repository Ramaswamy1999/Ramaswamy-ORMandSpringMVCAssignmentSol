package com.greatLearning.customerRelationshipManagement.dao;

import java.util.List;
import com.greatLearning.customerRelationshipManagement.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}