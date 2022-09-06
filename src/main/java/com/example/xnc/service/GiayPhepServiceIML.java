package com.example.xnc.service;

import com.example.xnc.model.GiayPhep;
import com.example.xnc.repository.GiayPhepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiayPhepServiceIML implements GiayPhepService{

    @Autowired
    GiayPhepRepository giayPhepRepository;

    @Override
    public List<GiayPhep> getAllGiayPhep() {
        return giayPhepRepository.findAll();
    }

    @Override
    public Optional<GiayPhep> findGiayPhepbyid(Long id) {
        return giayPhepRepository.findById(id);
    }

    @Override
    public GiayPhep getOneGiayPhep(Long id) {
        return giayPhepRepository.findById(id).get();
    }

    @Override
    public void saveGiayPhep(GiayPhep giayPhep) {
        giayPhepRepository.save(giayPhep);
    }

    @Override
    public void deleteGiayPhep(Long id) {
        giayPhepRepository.deleteById(id);
    }
}
