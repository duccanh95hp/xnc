package com.example.xnc.controller;

import com.example.xnc.model.GiayTo;
import com.example.xnc.service.GiayToService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/giayto")
public class GiayToController {
    @Autowired
    GiayToService giayToService;

    @GetMapping("/get")
    public ResponseEntity<List<GiayTo>> listAllCamXnc () {
        List<GiayTo> camXncList = giayToService.getAllGiayTo();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<GiayTo> saveCamXnc (@RequestBody GiayTo giayTo){
        giayToService.saveGiayTo(giayTo);
        return ResponseEntity.ok(giayTo);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GiayTo> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody GiayTo giayTo){
        GiayTo oldCamXnc = giayToService.getOneGiayTo(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setSoGiayTo(giayTo.getSoGiayTo());
            oldCamXnc.setCustomerId(giayTo.getCustomerId());
            oldCamXnc.setLoaiGtId(giayTo.getLoaiGtId());
            oldCamXnc.setNgayCap(giayTo.getNgayCap());
            oldCamXnc.setNgayHetHan(giayTo.getNgayHetHan());
            oldCamXnc.setNoiCap(giayTo.getNoiCap());

            giayToService.saveGiayTo(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<GiayTo> deleteCamXnc (@PathVariable("id") long id){
        Optional<GiayTo> deleteCamXnc = giayToService.findGiayTobyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            giayToService.deleteGiayTo(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<GiayTo> findCamXncById ( @PathVariable("id") long id){
        GiayTo giayTo = giayToService.getOneGiayTo(id);
        return new ResponseEntity(giayTo, HttpStatus.OK);
    }
}
