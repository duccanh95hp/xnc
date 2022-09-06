package com.example.xnc.repository;

import com.example.xnc.model.LoaiGiayTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaigiayToRepository extends JpaRepository<LoaiGiayTo,Long> {
}
