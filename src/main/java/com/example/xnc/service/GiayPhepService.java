package com.example.xnc.service;

import com.example.xnc.model.GiayPhep;

import java.util.List;
import java.util.Optional;

public interface GiayPhepService {
    List<GiayPhep> getAllGiayPhep();
    Optional<GiayPhep> findGiayPhepbyid(Long id);
    GiayPhep getOneGiayPhep(Long id);
    void saveGiayPhep(GiayPhep giayPhep);
    void deleteGiayPhep(Long id);
}
