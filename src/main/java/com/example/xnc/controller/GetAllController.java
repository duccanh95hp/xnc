package com.example.xnc.controller;

import com.example.xnc.dto.GetAllDto;
import com.example.xnc.service.CustomerServiceImp;
import com.example.xnc.service.ThongTinXncServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class GetAllController {

    @Autowired
    private ThongTinXncServiceImpl thongTinXncService;

    @GetMapping(path = "/thongtin")
        public ResponseEntity<List<GetAllDto>> getALL(@RequestParam("date") Date date) {


        List<GetAllDto> getAll = thongTinXncService.findAllByCreatedAt(date);
        if (getAll.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(getAll, HttpStatus.OK);
        }

    }
}
