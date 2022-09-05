package com.example.xnc.model;

import javax.persistence.*;

@Entity
public class HoatDong {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "tenHD")
    private String tenHd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenHd() {
        return tenHd;
    }

    public void setTenHd(String tenHd) {
        this.tenHd = tenHd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoatDong hoatDong = (HoatDong) o;

        if (id != hoatDong.id) return false;
        if (tenHd != null ? !tenHd.equals(hoatDong.tenHd) : hoatDong.tenHd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tenHd != null ? tenHd.hashCode() : 0);
        return result;
    }
}
