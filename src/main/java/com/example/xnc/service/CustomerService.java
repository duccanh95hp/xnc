package com.example.xnc.service;

import com.example.xnc.model.Customers;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customers> getAllCustomers();

    void saveCustomers(Customers customers);

    void deleteCustomers(long id);

    Optional<Customers> findCustomersByID(long id);

    Customers getOne(long id);
}
