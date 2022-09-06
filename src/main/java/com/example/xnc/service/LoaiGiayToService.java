package com.example.xnc.service;
import com.example.xnc.model.LoaiGiayTo;

import java.util.List;
import java.util.Optional;

public interface LoaiGiayToService {
    List<LoaiGiayTo> getAllLoaiGiayTo();
    Optional<LoaiGiayTo> findLoaiGiayTobyid(Long id);
    LoaiGiayTo getOneLoaiGiayTo(Long id);
    void saveLoaiGiayTo(LoaiGiayTo loaiGiayTo);
    void deleteLoaiGiayTo(Long id);
}
