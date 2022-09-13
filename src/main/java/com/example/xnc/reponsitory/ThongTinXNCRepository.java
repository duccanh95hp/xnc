package com.example.xnc.reponsitory;

import com.example.xnc.dto.GetAllDto;
import com.example.xnc.model.ThongTinXnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ThongTinXNCRepository extends JpaRepository<ThongTinXnc, Long> {



    @Query("SELECT NEW com.example.xnc.dto.GetAllDto(" +
            "c.hoTen, c.gioiTinh, c.ngaySinh, c.quocTich, xnc.createdAt, md.tenMd, lgt.tenLoaiGt, gt.soGiayTo, gt.noiCap, gt.ngayCap, lgp.tenLoaiGp, gp.soGiayTo, gp.noiCap, gp.ngayCap) " +
            "FROM ThongTinXnc xnc " +
            "INNER JOIN Customers c ON xnc.customerId = c.id " +
            "INNER JOIN MucDichXnc md ON md.id = xnc.mucDichXncId " +
            "INNER JOIN GiayPhep gp ON c.id = gp.customerId " +
            "INNER JOIN LoaiGiayPhep lgp ON lgp.id = gp.loaiGpId " +
            "INNER JOIN GiayTo gt ON c.id = gt.customerId " +
            "INNER JOIN LoaiGiayTo lgt ON gt.loaiGtId = lgt.id WHERE xnc.createdAt = ?1")
    List<GetAllDto> findAllByCreatedAt(Date date);
}
