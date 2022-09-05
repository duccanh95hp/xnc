package com.example.xnc.model;

import javax.persistence.*;

@Entity
public class LoaiGiayTo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "tenLoaiGT")
    private String tenLoaiGt;
    @Basic
    @Column(name = "moto")
    private String moto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenLoaiGt() {
        return tenLoaiGt;
    }

    public void setTenLoaiGt(String tenLoaiGt) {
        this.tenLoaiGt = tenLoaiGt;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoaiGiayTo that = (LoaiGiayTo) o;

        if (id != that.id) return false;
        if (tenLoaiGt != null ? !tenLoaiGt.equals(that.tenLoaiGt) : that.tenLoaiGt != null) return false;
        if (moto != null ? !moto.equals(that.moto) : that.moto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tenLoaiGt != null ? tenLoaiGt.hashCode() : 0);
        result = 31 * result + (moto != null ? moto.hashCode() : 0);
        return result;
    }
}
