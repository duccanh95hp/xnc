package com.example.xnc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class CamXnc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "hoTen")
    private String hoTen;
    @Basic
    @Column(name = "gioiTinh")
    private Integer gioiTinh;
    @Basic
    @Column(name = "quocTich")
    private String quocTich;
    @Basic
    @Column(name = "noiSinh")
    private String noiSinh;
    @Basic
    @Column(name = "soGiayTo")
    private String soGiayTo;
    @Basic
    @Column(name = "loaiGiayTo")
    private String loaiGiayTo;
    @Basic
    @Column(name = "ngayBd")
    private Date ngayBd;
    @Basic
    @Column(name = "ngayKt")
    private Date ngayKt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getSoGiayTo() {
        return soGiayTo;
    }

    public void setSoGiayTo(String soGiayTo) {
        this.soGiayTo = soGiayTo;
    }

    public String getLoaiGiayTo() {
        return loaiGiayTo;
    }

    public void setLoaiGiayTo(String loaiGiayTo) {
        this.loaiGiayTo = loaiGiayTo;
    }

    public Date getNgayBd() {
        return ngayBd;
    }

    public void setNgayBd(Date ngayBd) {
        this.ngayBd = ngayBd;
    }

    public Date getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(Date ngayKt) {
        this.ngayKt = ngayKt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CamXnc camXnc = (CamXnc) o;

        if (id != camXnc.id) return false;
        if (hoTen != null ? !hoTen.equals(camXnc.hoTen) : camXnc.hoTen != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(camXnc.gioiTinh) : camXnc.gioiTinh != null) return false;
        if (quocTich != null ? !quocTich.equals(camXnc.quocTich) : camXnc.quocTich != null) return false;
        if (noiSinh != null ? !noiSinh.equals(camXnc.noiSinh) : camXnc.noiSinh != null) return false;
        if (soGiayTo != null ? !soGiayTo.equals(camXnc.soGiayTo) : camXnc.soGiayTo != null) return false;
        if (loaiGiayTo != null ? !loaiGiayTo.equals(camXnc.loaiGiayTo) : camXnc.loaiGiayTo != null) return false;
        if (ngayBd != null ? !ngayBd.equals(camXnc.ngayBd) : camXnc.ngayBd != null) return false;
        if (ngayKt != null ? !ngayKt.equals(camXnc.ngayKt) : camXnc.ngayKt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (quocTich != null ? quocTich.hashCode() : 0);
        result = 31 * result + (noiSinh != null ? noiSinh.hashCode() : 0);
        result = 31 * result + (soGiayTo != null ? soGiayTo.hashCode() : 0);
        result = 31 * result + (loaiGiayTo != null ? loaiGiayTo.hashCode() : 0);
        result = 31 * result + (ngayBd != null ? ngayBd.hashCode() : 0);
        result = 31 * result + (ngayKt != null ? ngayKt.hashCode() : 0);
        return result;
    }
}
