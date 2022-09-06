package com.example.xnc.controller;

import com.example.xnc.model.GiayPhep;
import com.example.xnc.service.GiayPhepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/giayphep")
public class GiayPhepController {
    @Autowired
    GiayPhepService giayPhepService;

    @GetMapping("/get")
    public ResponseEntity<List<GiayPhep>> listAllCamXnc () {
        List<GiayPhep> camXncList = giayPhepService.getAllGiayPhep();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<GiayPhep> saveCamXnc (@RequestBody GiayPhep giayPhep){
        giayPhepService.saveGiayPhep(giayPhep);
        return ResponseEntity.ok(giayPhep);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GiayPhep> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody GiayPhep giayPhep){
        GiayPhep oldCamXnc = giayPhepService.getOneGiayPhep(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setSoGiayTo(giayPhep.getSoGiayTo());
            oldCamXnc.setCustomerId(giayPhep.getCustomerId());
            oldCamXnc.setNgayCap(giayPhep.getNgayCap());
            oldCamXnc.setNgayHetHan(giayPhep.getNgayHetHan());
            oldCamXnc.setLoaiGpId(giayPhep.getLoaiGpId());
            oldCamXnc.setUserId(giayPhep.getUserId());
            oldCamXnc.setNoiCap(giayPhep.getNoiCap());
            giayPhepService.saveGiayPhep(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<GiayPhep> deleteCamXnc (@PathVariable("id") long id){
        Optional<GiayPhep> deleteCamXnc = giayPhepService.findGiayPhepbyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            giayPhepService.deleteGiayPhep(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<GiayPhep> findCamXncById ( @PathVariable("id") long id){
        GiayPhep giayPhep = giayPhepService.getOneGiayPhep(id);
        return new ResponseEntity(giayPhep, HttpStatus.OK);
    }
}
