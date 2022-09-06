package com.example.xnc.service;

import com.example.xnc.model.HoatDong;
import com.example.xnc.model.LoaiGiayTo;

import java.util.List;
import java.util.Optional;

public interface HoatDongService {
    List<HoatDong> getAllHoatDong();
    Optional<HoatDong> findHoatDongbyid(Long id);
    HoatDong getOneHoatDong(Long id);
    void saveHoatDong(HoatDong hoatDong);
    void deleteHoatDong(Long id);
}
