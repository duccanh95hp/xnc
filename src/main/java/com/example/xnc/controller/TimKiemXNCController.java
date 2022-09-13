package com.example.xnc.controller;

import com.example.xnc.dto.DetailsXNC;
import com.example.xnc.dto.TimKiemXNC;
import com.example.xnc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController

public class TimKiemXNCController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/api/timKiemXnc")
    public ResponseEntity<Page<TimKiemXNC>> listAllCustomers (@RequestParam String hoTen,
                                                              @RequestParam (defaultValue = "") Integer[] gioiTinh,
                                                              @RequestParam String quocTich,
                                                              @RequestParam String soGt,
                                                              @RequestParam (defaultValue = "1") int page,
                                                              @RequestParam (defaultValue = "10") int limit) {
        if(hoTen == ""){
            hoTen = "%[A-Z]%";
        }
        if(quocTich == ""){
            quocTich = "%[A-Z]%";
        }
        if(soGt == ""){
            soGt = "%[A-Z]%";
        }
        if(gioiTinh.length <= 0){
         gioiTinh = new Integer[]{1, 2};
        }


        Page<TimKiemXNC> results = customerService.timKiemXNC(hoTen,gioiTinh,quocTich,soGt, PageRequest.of(page-1,limit));
        if (results.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(results.getContent(), HttpStatus.OK);
    }

    @GetMapping(value = "/api/details/{customerId}")
    public ResponseEntity<Page<DetailsXNC>> detailsCustomer(@PathVariable long customerId,
                                                            @RequestParam (defaultValue = "1") int page,
                                                            @RequestParam (defaultValue = "10") int limit){
        Page<DetailsXNC> results = customerService.detailsXnc(customerId,PageRequest.of(page-1,limit));
        if (results.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(results.getContent(), HttpStatus.OK);
    }


}
