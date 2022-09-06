package com.example.xnc.reponsitory;

import com.example.xnc.model.GiayTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiayToRepository extends JpaRepository<GiayTo,Long> {
}
