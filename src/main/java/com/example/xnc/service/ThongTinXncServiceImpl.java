package com.example.xnc.service;

import com.example.xnc.dto.GetAllDto;
import com.example.xnc.reponsitory.ThongTinXncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ThongTinXncServiceImpl implements ThongTinXncService{

    @Autowired
    private ThongTinXncRepository thongTinXNCRepository;

    @Override
    public List<GetAllDto> findAllByCreatedAt(Date date) {
//        return thongTinXNCRepository.findAllByCreatedAt(date);
        return null;
    }
}
