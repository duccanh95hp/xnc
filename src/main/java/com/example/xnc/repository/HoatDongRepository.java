package com.example.xnc.repository;

import com.example.xnc.model.HoatDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoatDongRepository extends JpaRepository<HoatDong,Long> {
}
