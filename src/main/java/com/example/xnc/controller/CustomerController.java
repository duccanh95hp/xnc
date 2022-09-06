package com.example.xnc.controller;

import com.example.xnc.model.CamXnc;
import com.example.xnc.model.Customers;
import com.example.xnc.service.CamXncService;
import com.example.xnc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/get")
    public ResponseEntity<List<Customers>> listAllCustomers () {
        List<Customers> customersList = customerService.getAllCustomers();
        if (customersList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(customersList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Customers> saveCustomer (@RequestBody Customers customers){
        customerService.saveCustomers(customers);
        return ResponseEntity.ok(customers);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customers> updateCustomer (@PathVariable("id") long id,
                                                @RequestBody Customers customers){
        Customers oldCustomer = customerService.getOne(id);
        if (oldCustomer == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCustomer.setHoTen(customers.getHoTen());
            oldCustomer.setGioiTinh(customers.getGioiTinh());
            oldCustomer.setQuocTich(customers.getQuocTich());
            oldCustomer.setNgaySinh(customers.getNgaySinh());
            oldCustomer.setNoiSinh(customers.getNoiSinh());
            customerService.saveCustomers(oldCustomer);
            return ResponseEntity.ok(oldCustomer);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Customers> deleteCustomer (@PathVariable("id") long id){
        Optional<Customers> deleteCustomer= customerService.findCustomersByID(id);
        if (deleteCustomer == null) {
            return ResponseEntity.notFound().build();
        } else {
            customerService.deleteCustomers(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Customers> findCustomerById ( @PathVariable("id") long id){
        Customers customers = customerService.getOne(id);
        return new ResponseEntity(customers, HttpStatus.OK);
    }
}
