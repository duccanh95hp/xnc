<<<<<<< HEAD
package com.example.xnc.controller;

import com.example.xnc.model.MucDichXnc;
import com.example.xnc.service.MucDichXncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/mucdich")
public class MucDichXncController
{
    @Autowired
    MucDichXncService mucDichXncService;

    @GetMapping("/get")
    public ResponseEntity<List<MucDichXnc>> listAllCamXnc () {
        List<MucDichXnc> camXncList = mucDichXncService.getAllMucDichXnc();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MucDichXnc> saveCamXnc (@RequestBody MucDichXnc mucDichXnc){
        mucDichXncService.saveMucDichXnc(mucDichXnc);
        return ResponseEntity.ok(mucDichXnc);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MucDichXnc> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody MucDichXnc mucDichXnc){
        MucDichXnc oldCamXnc = mucDichXncService.getOneMucDichXnc(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setTenMd(mucDichXnc.getTenMd());
            oldCamXnc.setMoTa(mucDichXnc.getMoTa());
            mucDichXncService.saveMucDichXnc(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MucDichXnc> deleteCamXnc (@PathVariable("id") long id){
        Optional<MucDichXnc> deleteCamXnc = mucDichXncService.findMucDichXncbyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            mucDichXncService.deleteMucDichXnc(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<MucDichXnc> findCamXncById ( @PathVariable("id") long id){
        MucDichXnc mucDichXnc = mucDichXncService.getOneMucDichXnc(id);
        return new ResponseEntity(mucDichXnc, HttpStatus.OK);
    }
}
=======
package com.example.xnc.controller;

import com.example.xnc.model.MucDichXnc;
import com.example.xnc.service.MucDichXncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/mucdich")
public class MucDichXncController
{
    @Autowired
    MucDichXncService mucDichXncService;

    @GetMapping("/get")
    public ResponseEntity<List<MucDichXnc>> listAllCamXnc () {
        List<MucDichXnc> camXncList = mucDichXncService.getAllMucDichXnc();
        if (camXncList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(camXncList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MucDichXnc> saveCamXnc (@RequestBody MucDichXnc mucDichXnc){
        mucDichXncService.saveMucDichXnc(mucDichXnc);
        return ResponseEntity.ok(mucDichXnc);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<MucDichXnc> updateCamXnc (@PathVariable("id") long id,
                                                @RequestBody MucDichXnc mucDichXnc){
        MucDichXnc oldCamXnc = mucDichXncService.getOneMucDichXnc(id);
        if (oldCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            oldCamXnc.setTenMd(mucDichXnc.getTenMd());
            oldCamXnc.setMoTa(mucDichXnc.getMoTa());
            mucDichXncService.saveMucDichXnc(oldCamXnc);
            return ResponseEntity.ok(oldCamXnc);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<MucDichXnc> deleteCamXnc (@PathVariable("id") long id){
        Optional<MucDichXnc> deleteCamXnc = mucDichXncService.findMucDichXncbyid(id);
        if (deleteCamXnc == null) {
            return ResponseEntity.notFound().build();
        } else {
            mucDichXncService.deleteMucDichXnc(id);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<MucDichXnc> findCamXncById ( @PathVariable("id") long id){
        MucDichXnc mucDichXnc = mucDichXncService.getOneMucDichXnc(id);
        return new ResponseEntity(mucDichXnc, HttpStatus.OK);
    }
}
>>>>>>> origin/master
