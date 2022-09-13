package com.example.xnc.service;

import com.example.xnc.dto.SelectTheoLoaiGiayTo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public interface ThongTinXncService {
    List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayPhep(String tenLoaiGp, Date startDate, Date endDate);

    List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayTo(String tenLoaiGt, Date startDate, Date endDate);

    List<SelectTheoLoaiGiayTo> findAllXncTheoQuocTich(String quocTich);
}
