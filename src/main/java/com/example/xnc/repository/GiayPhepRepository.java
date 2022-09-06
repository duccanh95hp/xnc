package com.example.xnc.repository;

import com.example.xnc.model.GiayPhep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiayPhepRepository extends JpaRepository<GiayPhep,Long> {
}
