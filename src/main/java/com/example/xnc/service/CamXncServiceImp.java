package com.example.xnc.service;

import com.example.xnc.model.CamXnc;
import com.example.xnc.repository.CamXncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamXncServiceImp implements CamXncService{
    @Autowired
    CamXncRepository camXncRepository;

    @Override
    public List<CamXnc> getAllCamXnc() {
        return camXncRepository.findAll();
    }

    @Override
    public void saveCamXnc(CamXnc camXnc) {
        camXncRepository.save(camXnc);
    }

    @Override
    public void deleteCamXnc(long id) {
        camXncRepository.deleteById(id);
    }

    @Override
    public Optional<CamXnc> findCamXncByID(long id) {
        return camXncRepository.findById(id);
    }

    @Override
    public CamXnc getOne(long id) {
        return camXncRepository.findById(id).get();
    }
}
