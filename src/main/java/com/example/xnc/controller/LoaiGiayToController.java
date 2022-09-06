package com.example.xnc.controller;

import com.example.xnc.model.LoaiGiayTo;
import com.example.xnc.service.LoaiGiayToService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/loaigiayto")
public class LoaiGiayToController {
    @Autowired
    LoaiGiayToService loaiGiayToService;

    @GetMapping("/get")
    public ResponseEntity<List<LoaiGiayTo>> listAllCamXnc () {
        List<LoaiGiayTo> camXncList = loaiGiayToService.getAllLoaiGiayTo();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<LoaiGiayTo> saveCamXnc (@RequestBody LoaiGiayTo loaiGiayTo){
        loaiGiayToService.saveLoaiGiayTo(loaiGiayTo);
        return ResponseEntity.ok(loaiGiayTo);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<LoaiGiayTo> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody LoaiGiayTo loaiGiayTo){
        LoaiGiayTo oldCamXnc = loaiGiayToService.getOneLoaiGiayTo(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setTenLoaiGt(loaiGiayTo.getTenLoaiGt());
            oldCamXnc.setMoto(loaiGiayTo.getMoto());
            loaiGiayToService.saveLoaiGiayTo(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<LoaiGiayTo> deleteCamXnc (@PathVariable("id") long id){
        Optional<LoaiGiayTo> deleteCamXnc = loaiGiayToService.findLoaiGiayTobyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            loaiGiayToService.deleteLoaiGiayTo(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<LoaiGiayTo> findCamXncById ( @PathVariable("id") long id){
        LoaiGiayTo loaiGiayTo = loaiGiayToService.getOneLoaiGiayTo(id);
        return new ResponseEntity(loaiGiayTo, HttpStatus.OK);
    }
}
