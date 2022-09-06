package com.example.xnc.controller;

import com.example.xnc.model.CamXnc;
import com.example.xnc.service.CamXncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/camxnc")
public class CamXncController {
    @Autowired
    CamXncService camXncService;

    @GetMapping("/get")
    public ResponseEntity<List<CamXnc>> listAllCamXnc () {
        List<CamXnc> camXncList = camXncService.getAllCamXnc();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<CamXnc> saveCamXnc (@RequestBody CamXnc camXnc){
        camXncService.saveCamXnc(camXnc);
        return ResponseEntity.ok(camXnc);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CamXnc> updateCamXnc (@PathVariable("id") long id,
                                            @RequestBody CamXnc camXnc){
        CamXnc oldCamXnc = camXncService.getOne(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setHoTen(camXnc.getHoTen());
            oldCamXnc.setGioiTinh(camXnc.getGioiTinh());
            oldCamXnc.setQuocTich(camXnc.getQuocTich());
            oldCamXnc.setNoiSinh(camXnc.getNoiSinh());
            oldCamXnc.setSoGiayTo(camXnc.getSoGiayTo());
            oldCamXnc.setLoaiGiayTo(camXnc.getLoaiGiayTo());
            oldCamXnc.setNgayBd(camXnc.getNgayBd());
            oldCamXnc.setNgayKt(camXnc.getNgayKt());
            camXncService.saveCamXnc(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CamXnc> deleteCamXnc (@PathVariable("id") long id){
        Optional<CamXnc> deleteCamXnc = camXncService.findCamXncByID(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            camXncService.deleteCamXnc(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<CamXnc> findCamXncById ( @PathVariable("id") long id){
        CamXnc camXnc = camXncService.getOne(id);
        return new ResponseEntity(camXnc, HttpStatus.OK);
    }
}
