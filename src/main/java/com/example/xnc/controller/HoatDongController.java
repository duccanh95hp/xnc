package com.example.xnc.controller;

import com.example.xnc.model.HoatDong;
import com.example.xnc.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/hoatdong")
public class HoatDongController {
    @Autowired
    HoatDongService hoatDongService;

    @GetMapping("/get")
    public ResponseEntity<List<HoatDong>> listAllCamXnc () {
        List<HoatDong> camXncList = hoatDongService.getAllHoatDong();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<HoatDong> saveCamXnc (@RequestBody HoatDong hoatDong){
        hoatDongService.saveHoatDong(hoatDong);
        return ResponseEntity.ok(hoatDong);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<HoatDong> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody HoatDong hoatDong){
        HoatDong oldCamXnc = hoatDongService.getOneHoatDong(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setTenHd(hoatDong.getTenHd());
            hoatDongService.saveHoatDong(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HoatDong> deleteCamXnc (@PathVariable("id") long id){
        Optional<HoatDong> deleteCamXnc = hoatDongService.findHoatDongbyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            hoatDongService.deleteHoatDong(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<HoatDong> findCamXncById ( @PathVariable("id") long id){
        HoatDong hoatDong = hoatDongService.getOneHoatDong(id);
        return new ResponseEntity(hoatDong, HttpStatus.OK);
    }
}
