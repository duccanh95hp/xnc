package com.example.xnc.reponsitory;

import com.example.xnc.model.CamXnc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamXncRepository extends JpaRepository<CamXnc, Long> {

    List<CamXnc> findByGioiTinhAndHoTenAndNoiSinhAndQuocTich(int gioitinh,String hoten,String noisinh,String quoctich);

    @Override
    Page<CamXnc> findAll(Pageable pageable);

}
