package com.example.xnc.service;

import com.example.xnc.model.GiayTo;

import java.util.List;
import java.util.Optional;

public interface GiayToService {
    List<GiayTo> getAllGiayTo();
    Optional<GiayTo> findGiayTobyid(Long id);
    GiayTo getOneGiayTo(Long id);
    void saveGiayTo(GiayTo giayTo);
    void deleteGiayTo(Long id);
}
