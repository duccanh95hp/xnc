package com.example.xnc.repository;

import com.example.xnc.model.MucDichXnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MucDinhXncRepository extends JpaRepository<MucDichXnc,Long> {
}
