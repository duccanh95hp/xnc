package com.example.xnc.service;

import com.example.xnc.model.LoaiGiayTo;
import com.example.xnc.model.MucDichXnc;

import java.util.List;
import java.util.Optional;

public interface MucDichXncService {
    List<MucDichXnc> getAllMucDichXnc();
    Optional<MucDichXnc> findMucDichXncbyid(Long id);
    MucDichXnc getOneMucDichXnc(Long id);
    void saveMucDichXnc(MucDichXnc mucDichXnc);
    void deleteMucDichXnc(Long id);
}
