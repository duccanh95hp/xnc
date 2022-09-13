package com.example.xnc.reponsitory;

import com.example.xnc.dto.SelectTheoLoaiGiayTo;
import com.example.xnc.model.ThongTinXnc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Repository
public interface ThongTinXncRepository extends JpaRepository<ThongTinXnc, Long> {
    //count theo giay phep
    @Query("Select new com.example.xnc.dto.SelectTheoLoaiGiayTo(" +
            "COUNT(tt.id), tt.id , c.hoTen, tt.noiDen, tt.ngayDkQuayVe, tt.ghiChu, tt.createdAt, hd.tenHd, md.tenMd, lgp.tenLoaiGp, lgt.tenLoaiGt ) " +
            "FROM ThongTinXnc tt join Customers c on tt.customerId = c.id " +
                                "join HoatDong hd on tt.hoatDongId = hd.id " +
                                "join MucDichXnc md on tt.mucDichXncId = md.id " +
                                "join GiayPhep gp on tt.giayPhepId = gp.id " +
                                "join LoaiGiayPhep lgp on gp.loaiGpId = lgp.id " +
                                "join GiayTo gt on tt.giayToId = gt.id " +
                                "join LoaiGiayTo lgt on gt.loaiGtId = lgt.id where lgp.tenLoaiGp = ?1 and tt.createdAt between :#{#startDate}  and :#{#endDate}")
//    List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayPhep(String tenLoaiGp, Date dateStart, Date dateEnd);
    List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayPhep(String tenLoaiGp, @Param("startDate")Date startDate,@Param("endDate") Date endDate);

    //count theo giay to
    @Query("Select new com.example.xnc.dto.SelectTheoLoaiGiayTo(" +
            "COUNT(tt.id), tt.id, c.hoTen, tt.noiDen, tt.ngayDkQuayVe, tt.ghiChu, tt.createdAt, hd.tenHd, md.tenMd, lgp.tenLoaiGp, lgt.tenLoaiGt ) " +
            "FROM ThongTinXnc tt join Customers c on tt.customerId = c.id " +
            "join HoatDong hd on tt.hoatDongId = hd.id " +
            "join MucDichXnc md on tt.mucDichXncId = md.id " +
            "join GiayPhep gp on tt.giayPhepId = gp.id " +
            "join LoaiGiayPhep lgp on gp.loaiGpId = lgp.id " +
            "join GiayTo gt on tt.giayToId = gt.id " +
            "join LoaiGiayTo lgt on gt.loaiGtId = lgt.id where lgt.tenLoaiGt = ?1 and tt.createdAt between :#{#startDate}  and :#{#endDate} " )
    List<SelectTheoLoaiGiayTo> findAllXncTheoLoaiGiayTo(String tenLoaiGt, @Param("startDate")Date startDate,@Param("endDate") Date endDate);

    //count theo quoc tich
    @Query("Select new com.example.xnc.dto.SelectTheoLoaiGiayTo(" +
            "COUNT(tt.id), tt.id, c.hoTen, tt.noiDen, tt.ngayDkQuayVe, tt.ghiChu, tt.createdAt, hd.tenHd, md.tenMd, lgp.tenLoaiGp, lgt.tenLoaiGt ) " +
            "FROM ThongTinXnc tt join Customers c on tt.customerId = c.id " +
            "join HoatDong hd on tt.hoatDongId = hd.id " +
            "join MucDichXnc md on tt.mucDichXncId = md.id " +
            "join GiayPhep gp on tt.giayPhepId = gp.id " +
            "join LoaiGiayPhep lgp on gp.loaiGpId = lgp.id " +
            "join GiayTo gt on tt.giayToId = gt.id " +
            "join LoaiGiayTo lgt on gt.loaiGtId = lgt.id where c.quocTich = ?1" )
    List<SelectTheoLoaiGiayTo> findAllXncTheoQuocTich(String quocTich);







}
