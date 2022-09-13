package com.example.xnc.dto;


import java.util.Date;

public class SelectTheoLoaiGiayTo {

    private long count;

    private long id;

    private String customerName;

    private String noiDen;

    private Date ngayDkQuayVe;

    private String ghiChu;

    private Date createdAt;

    private String tenHD;

    private String tenMD;

    private String tenGiayPhep;

    private String tenGiayTo;

    public SelectTheoLoaiGiayTo(long count ,long id, String customerName,
                                 String noiDen,
                                 Date ngayDkQuayVe,
                                 String ghiChu,
                                 Date createdAt,
                                 String tenHD,
                                 String tenMD,
                                 String tenGiayPhep,
                                 String tenGiayTo) {
        this.count = count;
        this.id = id;
        this.customerName = customerName;
        this.noiDen = noiDen;
        this.ngayDkQuayVe = ngayDkQuayVe;
        this.ghiChu = ghiChu;
        this.createdAt = createdAt;
        this.tenHD = tenHD;
        this.tenMD = tenMD;
        this.tenGiayPhep = tenGiayPhep;
        this.tenGiayTo = tenGiayTo;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getTenGiayPhep() {
        return tenGiayPhep;
    }

    public void setTenGiayPhep(String tenGiayPhep) {
        this.tenGiayPhep = tenGiayPhep;
    }

    public String getTenGiayTo() {
        return tenGiayTo;
    }

    public void setTenGiayTo(String tenGiayTo) {
        this.tenGiayTo = tenGiayTo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getTenMD() {
        return tenMD;
    }

    public void setTenMD(String tenMD) {
        this.tenMD = tenMD;
    }
}
