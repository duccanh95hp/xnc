package com.example.xnc.service;

import com.example.xnc.model.LoaiGiayTo;
import com.example.xnc.repository.LoaigiayToRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiGiayToServiceIML implements LoaiGiayToService{
    @Autowired
    LoaigiayToRepository loaigiayToRepository;
    @Override
    public List<LoaiGiayTo> getAllLoaiGiayTo() {
        return loaigiayToRepository.findAll();
    }

    @Override
    public Optional<LoaiGiayTo> findLoaiGiayTobyid(Long id) {
        return loaigiayToRepository.findById(id);
    }

    @Override
    public LoaiGiayTo getOneLoaiGiayTo(Long id) {
        return loaigiayToRepository.findById(id).get();
    }

    @Override
    public void saveLoaiGiayTo(LoaiGiayTo loaiGiayTo) {
        loaigiayToRepository.save(loaiGiayTo);
    }

    @Override
    public void deleteLoaiGiayTo(Long id) {
        loaigiayToRepository.deleteById(id);
    }
}
