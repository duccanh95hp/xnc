package com.example.xnc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class ThongTinXnc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "noiDen")
    private String noiDen;
    @Basic
    @Column(name = "ngayDKQuayVe")
    private Date ngayDkQuayVe;
    @Basic
    @Column(name = "ghiChu")
    private String ghiChu;
    @Basic
    @Column(name = "created_at")
    private Date createdAt;
    @Basic
    @Column(name = "hoatDong_id")
    private Long hoatDongId;
    @Basic
    @Column(name = "mucDichXNC_id")
    private Long mucDichXncId;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "giayPhep_id")
    private Long giayPhepId;
    @Basic
    @Column(name = "giayTo_id")
    private Long giayToId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public Date getNgayDkQuayVe() {
        return ngayDkQuayVe;
    }

    public void setNgayDkQuayVe(Date ngayDkQuayVe) {
        this.ngayDkQuayVe = ngayDkQuayVe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getHoatDongId() {
        return hoatDongId;
    }

    public void setHoatDongId(Long hoatDongId) {
        this.hoatDongId = hoatDongId;
    }

    public Long getMucDichXncId() {
        return mucDichXncId;
    }

    public void setMucDichXncId(Long mucDichXncId) {
        this.mucDichXncId = mucDichXncId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGiayPhepId() {
        return giayPhepId;
    }

    public void setGiayPhepId(Long giayPhepId) {
        this.giayPhepId = giayPhepId;
    }

    public Long getGiayToId() {
        return giayToId;
    }

    public void setGiayToId(Long giayToId) {
        this.giayToId = giayToId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThongTinXnc that = (ThongTinXnc) o;

        if (id != that.id) return false;
        if (noiDen != null ? !noiDen.equals(that.noiDen) : that.noiDen != null) return false;
        if (ngayDkQuayVe != null ? !ngayDkQuayVe.equals(that.ngayDkQuayVe) : that.ngayDkQuayVe != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (hoatDongId != null ? !hoatDongId.equals(that.hoatDongId) : that.hoatDongId != null) return false;
        if (mucDichXncId != null ? !mucDichXncId.equals(that.mucDichXncId) : that.mucDichXncId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (giayPhepId != null ? !giayPhepId.equals(that.giayPhepId) : that.giayPhepId != null) return false;
        if (giayToId != null ? !giayToId.equals(that.giayToId) : that.giayToId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (noiDen != null ? noiDen.hashCode() : 0);
        result = 31 * result + (ngayDkQuayVe != null ? ngayDkQuayVe.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (hoatDongId != null ? hoatDongId.hashCode() : 0);
        result = 31 * result + (mucDichXncId != null ? mucDichXncId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (giayPhepId != null ? giayPhepId.hashCode() : 0);
        result = 31 * result + (giayToId != null ? giayToId.hashCode() : 0);
        return result;
    }
}
