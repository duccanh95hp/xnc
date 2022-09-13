package com.example.xnc.service;

import com.example.xnc.dto.SelectTheoLoaiGiayTo;
import com.example.xnc.reponsitory.ThongTinXncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ThongTinXncServiceImp implements ThongTinXncService {
    @Autowired
    ThongTinXncRepository thongTinXncRepository;

    @Override
    public List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayPhep(String tenLoaiGp, Date startDate, Date endDate) {
        return thongTinXncRepository.findAllXncTheoLoaiGiayPhep(tenLoaiGp, startDate, endDate);
    }

    @Override
    public List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayTo(String tenLoaiGt, Date startDate, Date endDate) {
        return thongTinXncRepository.findAllXncTheoLoaiGiayTo(tenLoaiGt, startDate, endDate);
    }

    @Override
    public List<SelectTheoLoaiGiayTo> findAllXncTheoQuocTich(String quocTich) {
        return thongTinXncRepository.findAllXncTheoQuocTich(quocTich);
    }
}
