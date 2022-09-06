package com.example.xnc.service;

import com.example.xnc.model.LoaiGiayPhep;
import com.example.xnc.repository.LoaiGiayPhepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiGiayPhepServiceIML implements LoaiGiayPhepService{
    @Autowired
    LoaiGiayPhepRepository loaiGiayPhepRepository;

    @Override
    public List<LoaiGiayPhep> getAllLoaiGiayPhep() {
        return loaiGiayPhepRepository.findAll();
    }

    @Override
    public Optional<LoaiGiayPhep> findLoaiGiayPhepbyid(Long id) {
        return loaiGiayPhepRepository.findById(id);
    }

    @Override
    public LoaiGiayPhep getOneLoaiGiayPhep(Long id) {
        return loaiGiayPhepRepository.findById(id).get();
    }

    @Override
    public void saveLoaiGiayPhep(LoaiGiayPhep loaiGiayPhep) {
        loaiGiayPhepRepository.save(loaiGiayPhep);
    }

    @Override
    public void deleteLoaiGiayPhep(Long id) {
        loaiGiayPhepRepository.deleteById(id);
    }
}
