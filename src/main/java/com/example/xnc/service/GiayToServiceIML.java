package com.example.xnc.service;

import com.example.xnc.model.GiayTo;
import com.example.xnc.reponsitory.GiayToRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiayToServiceIML implements GiayToService{
    @Autowired
    GiayToRepository giayToRepository;

    @Override
    public List<GiayTo> getAllGiayTo() {
        return giayToRepository.findAll();
    }

    @Override
    public Optional<GiayTo> findGiayTobyid(Long id) {
        return giayToRepository.findById(id);
    }

    @Override
    public GiayTo getOneGiayTo(Long id) {
        return giayToRepository.findById(id).get();
    }

    @Override
    public void saveGiayTo(GiayTo giayTo) {
        giayToRepository.save(giayTo);
    }

    @Override
    public void deleteGiayTo(Long id) {
        giayToRepository.deleteById(id);
    }
}
