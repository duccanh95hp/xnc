package com.example.xnc.service;

import com.example.xnc.model.MucDichXnc;
import com.example.xnc.reponsitory.MucDinhXncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MucDichXncServiceIMl implements MucDichXncService{
    @Autowired
    MucDinhXncRepository mucDinhXncRepository;

    @Override
    public List<MucDichXnc> getAllMucDichXnc() {
        return mucDinhXncRepository.findAll();
    }

    @Override
    public Optional<MucDichXnc> findMucDichXncbyid(Long id) {
        return mucDinhXncRepository.findById(id);
    }

    @Override
    public MucDichXnc getOneMucDichXnc(Long id) {
        return mucDinhXncRepository.findById(id).get();
    }

    @Override
    public void saveMucDichXnc(MucDichXnc mucDichXnc) {
        mucDinhXncRepository.save(mucDichXnc);
    }

    @Override
    public void deleteMucDichXnc(Long id) {
        mucDinhXncRepository.deleteById(id);
    }
}
