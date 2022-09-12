package com.example.xnc.service;

import com.example.xnc.dto.GetAllDto;

import java.util.Date;
import java.util.List;

public interface ThongTinXncService {

    List<GetAllDto> findAllByCreatedAt(Date date);
}
