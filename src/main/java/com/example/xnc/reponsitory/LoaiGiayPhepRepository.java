package com.example.xnc.reponsitory;

import com.example.xnc.model.LoaiGiayPhep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiGiayPhepRepository extends JpaRepository<LoaiGiayPhep,Long> {
}
