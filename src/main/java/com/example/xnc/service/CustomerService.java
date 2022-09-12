package com.example.xnc.service;

import com.example.xnc.dto.DetailsXNC;
import com.example.xnc.dto.TimKiemXNC;
import com.example.xnc.model.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customers> getAllCustomers();

    void saveCustomers(Customers customers);

    void deleteCustomers(long id);

    Optional<Customers> findCustomersByID(long id);

    Customers getOne(long id);

    Page<TimKiemXNC> timKiemXNC(String hoten, Integer[] gioiTinh, String quocTich, String soGt, Pageable pageable);

    Page<DetailsXNC> detailsXnc(long customerId,Pageable pageable);
}
