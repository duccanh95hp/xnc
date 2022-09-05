package com.example.xnc.model;

import javax.persistence.*;

@Entity
public class MucDichXnc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "tenMD")
    private String tenMd;
    @Basic
    @Column(name = "moTa")
    private String moTa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenMd() {
        return tenMd;
    }

    public void setTenMd(String tenMd) {
        this.tenMd = tenMd;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MucDichXnc that = (MucDichXnc) o;

        if (id != that.id) return false;
        if (tenMd != null ? !tenMd.equals(that.tenMd) : that.tenMd != null) return false;
        if (moTa != null ? !moTa.equals(that.moTa) : that.moTa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tenMd != null ? tenMd.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        return result;
    }
}
