package com.example.xnc.controller;

import com.example.xnc.dto.SelectTheoLoaiGiayTo;
import com.example.xnc.model.Customers;
import com.example.xnc.model.ThongTinXnc;
import com.example.xnc.service.ThongTinXncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 36000)
public class ThongTinXncController {
    @Autowired
    ThongTinXncService thongTinXncService;

    @GetMapping("/getByGiayPhep")
    public ResponseEntity<List<SelectTheoLoaiGiayTo>> listAllXncTheoGiayPhep(@RequestParam String tenLoaiGp,
                                                                             @RequestParam Date startDate,
                                                                             @RequestParam Date endDate) {
        List<SelectTheoLoaiGiayTo> listTheoGiayPhep= thongTinXncService.findAllXncTheoLoaiGiayPhep(tenLoaiGp, startDate, endDate);
        if (listTheoGiayPhep.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(listTheoGiayPhep, HttpStatus.OK);
    }

    @GetMapping("/getByGiayTo")
    public ResponseEntity<List<SelectTheoLoaiGiayTo>> listAllXncTheoGiayTo(@RequestParam String tenLoaiGt,
                                                                             @RequestParam Date startDate,
                                                                             @RequestParam Date endDate) {
        List<SelectTheoLoaiGiayTo> listTheoGiayTo= thongTinXncService.findAllXncTheoLoaiGiayTo(tenLoaiGt, startDate, endDate);
        if (listTheoGiayTo.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(listTheoGiayTo, HttpStatus.OK);
    }

    @GetMapping("/getByQuocTich")
    public ResponseEntity<List<SelectTheoLoaiGiayTo>> listAllXncTheoQuocTich(@RequestParam String quocTich) {
        List<SelectTheoLoaiGiayTo> listTheoQuocTich= thongTinXncService.findAllXncTheoQuocTich(quocTich);
        if (listTheoQuocTich.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(listTheoQuocTich, HttpStatus.OK);
    }


}
