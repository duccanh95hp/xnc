package com.example.xnc.service;

import com.example.xnc.model.HoatDong;
import com.example.xnc.reponsitory.HoatDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoatDongServiceIML implements HoatDongService{

    @Autowired
    HoatDongRepository hoatDongRepository;
    @Override
    public List<HoatDong> getAllHoatDong() {
        return hoatDongRepository.findAll();
    }

    @Override
    public Optional<HoatDong> findHoatDongbyid(Long id) {
        return hoatDongRepository.findById(id);
    }

    @Override
    public HoatDong getOneHoatDong(Long id) {
        return hoatDongRepository.findById(id).get();
    }

    @Override
    public void saveHoatDong(HoatDong hoatDong) {
        hoatDongRepository.save(hoatDong);
    }

    @Override
    public void deleteHoatDong(Long id) {

    }
}
