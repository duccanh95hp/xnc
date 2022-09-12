package com.example.xnc.service;

import com.example.xnc.dto.GetAllDto;
import com.example.xnc.reponsitory.ThongTinXNCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ThongTinXncServiceImpl implements ThongTinXncService{

    @Autowired
    private ThongTinXNCRepository thongTinXNCRepository;

    @Override
    public List<GetAllDto> findAllByCreatedAt(Date date) {
        return thongTinXNCRepository.findAllByCreatedAt(date);
    }
}
