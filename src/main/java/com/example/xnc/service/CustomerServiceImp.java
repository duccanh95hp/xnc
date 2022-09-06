package com.example.xnc.service;

import com.example.xnc.model.Customers;
import com.example.xnc.reponsitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomers(Customers customers) {
        customerRepository.save(customers);
    }

    @Override
    public void deleteCustomers(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customers> findCustomersByID(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customers getOne(long id) {
        return customerRepository.findById(id).get();
    }
}
