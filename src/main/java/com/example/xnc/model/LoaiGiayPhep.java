package com.example.xnc.model;

import javax.persistence.*;

@Entity
public class LoaiGiayPhep {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "tenLoaiGP")
    private String tenLoaiGp;
    @Basic
    @Column(name = "moto")
    private String moto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenLoaiGp() {
        return tenLoaiGp;
    }

    public void setTenLoaiGp(String tenLoaiGp) {
        this.tenLoaiGp = tenLoaiGp;
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

        LoaiGiayPhep that = (LoaiGiayPhep) o;

        if (id != that.id) return false;
        if (tenLoaiGp != null ? !tenLoaiGp.equals(that.tenLoaiGp) : that.tenLoaiGp != null) return false;
        if (moto != null ? !moto.equals(that.moto) : that.moto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tenLoaiGp != null ? tenLoaiGp.hashCode() : 0);
        result = 31 * result + (moto != null ? moto.hashCode() : 0);
        return result;
    }
}
