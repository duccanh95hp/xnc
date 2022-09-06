package com.example.xnc.repository;

import com.example.xnc.model.CamXnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamXncRepository extends JpaRepository<CamXnc, Long> {
}
