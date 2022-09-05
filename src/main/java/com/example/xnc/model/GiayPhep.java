package com.example.xnc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class GiayPhep {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "soGiayTo")
    private String soGiayTo;
    @Basic
    @Column(name = "noiCap")
    private String noiCap;
    @Basic
    @Column(name = "ngayCap")
    private Date ngayCap;
    @Basic
    @Column(name = "ngayHetHan")
    private Date ngayHetHan;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "loaiGP_id")
    private Long loaiGpId;
    @Basic
    @Column(name = "customer_id")
    private Long customerId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSoGiayTo() {
        return soGiayTo;
    }

    public void setSoGiayTo(String soGiayTo) {
        this.soGiayTo = soGiayTo;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLoaiGpId() {
        return loaiGpId;
    }

    public void setLoaiGpId(Long loaiGpId) {
        this.loaiGpId = loaiGpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GiayPhep giayPhep = (GiayPhep) o;

        if (id != giayPhep.id) return false;
        if (soGiayTo != null ? !soGiayTo.equals(giayPhep.soGiayTo) : giayPhep.soGiayTo != null) return false;
        if (noiCap != null ? !noiCap.equals(giayPhep.noiCap) : giayPhep.noiCap != null) return false;
        if (ngayCap != null ? !ngayCap.equals(giayPhep.ngayCap) : giayPhep.ngayCap != null) return false;
        if (ngayHetHan != null ? !ngayHetHan.equals(giayPhep.ngayHetHan) : giayPhep.ngayHetHan != null) return false;
        if (userId != null ? !userId.equals(giayPhep.userId) : giayPhep.userId != null) return false;
        if (loaiGpId != null ? !loaiGpId.equals(giayPhep.loaiGpId) : giayPhep.loaiGpId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (soGiayTo != null ? soGiayTo.hashCode() : 0);
        result = 31 * result + (noiCap != null ? noiCap.hashCode() : 0);
        result = 31 * result + (ngayCap != null ? ngayCap.hashCode() : 0);
        result = 31 * result + (ngayHetHan != null ? ngayHetHan.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (loaiGpId != null ? loaiGpId.hashCode() : 0);
        return result;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
