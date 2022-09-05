package com.example.xnc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Customers {
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
    @Column(name = "ngaySinh")
    private Date ngaySinh;
    @Basic
    @Column(name = "noiSinh")
    private String noiSinh;

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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        if (id != customers.id) return false;
        if (hoTen != null ? !hoTen.equals(customers.hoTen) : customers.hoTen != null) return false;
        if (gioiTinh != null ? !gioiTinh.equals(customers.gioiTinh) : customers.gioiTinh != null) return false;
        if (quocTich != null ? !quocTich.equals(customers.quocTich) : customers.quocTich != null) return false;
        if (ngaySinh != null ? !ngaySinh.equals(customers.ngaySinh) : customers.ngaySinh != null) return false;
        if (noiSinh != null ? !noiSinh.equals(customers.noiSinh) : customers.noiSinh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hoTen != null ? hoTen.hashCode() : 0);
        result = 31 * result + (gioiTinh != null ? gioiTinh.hashCode() : 0);
        result = 31 * result + (quocTich != null ? quocTich.hashCode() : 0);
        result = 31 * result + (ngaySinh != null ? ngaySinh.hashCode() : 0);
        result = 31 * result + (noiSinh != null ? noiSinh.hashCode() : 0);
        return result;
    }
}
