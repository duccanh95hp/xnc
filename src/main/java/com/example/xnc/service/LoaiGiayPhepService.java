package com.example.xnc.service;

import com.example.xnc.model.LoaiGiayPhep;

import java.util.List;
import java.util.Optional;

public interface LoaiGiayPhepService {
    List<LoaiGiayPhep> getAllLoaiGiayPhep();
    Optional<LoaiGiayPhep> findLoaiGiayPhepbyid(Long id);
    LoaiGiayPhep getOneLoaiGiayPhep(Long id);
    void saveLoaiGiayPhep(LoaiGiayPhep loaiGiayPhep);
    void deleteLoaiGiayPhep(Long id);
}
