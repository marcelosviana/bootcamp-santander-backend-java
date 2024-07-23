package me.dio.service;

import me.dio.model.Customer;

import java.util.List;

public interface CustomerService {

    void createCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    List<Customer> listAllCustomers();
}
