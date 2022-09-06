package com.example.xnc.controller;

import com.example.xnc.model.LoaiGiayPhep;
import com.example.xnc.service.LoaiGiayPhepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/loaigiayphep")
public class LoaiGiayPhepController {
    @Autowired
    LoaiGiayPhepService loaiGiayPhepService;

    @GetMapping("/get")
    public ResponseEntity<List<LoaiGiayPhep>> listAllCamXnc () {
        List<LoaiGiayPhep> camXncList = loaiGiayPhepService.getAllLoaiGiayPhep();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<LoaiGiayPhep> saveCamXnc (@RequestBody LoaiGiayPhep loaiGiayPhep){
        loaiGiayPhepService.saveLoaiGiayPhep(loaiGiayPhep);
        return ResponseEntity.ok(loaiGiayPhep);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<LoaiGiayPhep> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody LoaiGiayPhep loaiGiayPhep){
        LoaiGiayPhep oldCamXnc = loaiGiayPhepService.getOneLoaiGiayPhep(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setTenLoaiGp(loaiGiayPhep.getTenLoaiGp());
            oldCamXnc.setMoto(loaiGiayPhep.getMoto());
            loaiGiayPhepService.saveLoaiGiayPhep(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<LoaiGiayPhep> deleteCamXnc (@PathVariable("id") long id){
        Optional<LoaiGiayPhep> deleteCamXnc = loaiGiayPhepService.findLoaiGiayPhepbyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            loaiGiayPhepService.deleteLoaiGiayPhep(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<LoaiGiayPhep> findCamXncById ( @PathVariable("id") long id){
        LoaiGiayPhep loaiGiayPhep = loaiGiayPhepService.getOneLoaiGiayPhep(id);
        return new ResponseEntity(loaiGiayPhep, HttpStatus.OK);
    }
}
