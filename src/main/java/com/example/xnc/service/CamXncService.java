package com.example.xnc.service;

import com.example.xnc.model.CamXnc;

import java.util.List;
import java.util.Optional;

public interface CamXncService {
    List<CamXnc> getAllCamXnc();

    void saveCamXnc(CamXnc camXnc);

    void deleteCamXnc(long id);

    Optional<CamXnc> findCamXncByID(long id);

    CamXnc getOne(long id);
    List<CamXnc> getCamXnc(int gioitinh,String hoten,String noisinh,String quoctich);
}
