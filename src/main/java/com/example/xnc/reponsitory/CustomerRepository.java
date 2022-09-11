package com.example.xnc.reponsitory;

import com.example.xnc.dto.TimKiemXNC;
import com.example.xnc.model.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.sql.Date;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

    @Query("SELECT new com.example.xnc.dto.TimKiemXNC ( " +
            "c.id,c.hoTen,c.gioiTinh,c.quocTich,c.ngaySinh,c.noiSinh,gt.soGiayTo) from Customers c inner join GiayTo gt on c.id = gt.customerId where c.hoTen like ?1 and c.gioiTinh = ?2 and c.quocTich like ?3 and gt.soGiayTo like ?4")
    Page<TimKiemXNC> timKiemXnk(String hoten, Integer gioiTinh, String quocTich, String soGt, Pageable pageable);
}
