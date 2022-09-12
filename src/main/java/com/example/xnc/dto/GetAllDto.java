package com.example.xnc.dto;

import java.util.Date;

public class GetAllDto {
    private String hoVaTen;
    private Integer gioiTinh;
    private Date ngaySinh;
    private String quocTich;
    private Date nnc;
    private String mucDich;

    private String tenLoaiHC;
    private String soGiayToHC;
    private String noiCapHC;
    private Date ngayCapHC;

    private String tenLoaiTT;
    private String soGiayToTT;
    private String noiCapTT;
    private Date ngayCapTT;

    public GetAllDto(String hoVaTen, Integer gioiTinh, Date ngaySinh, String quocTich, Date nnc, String mucDich, String tenLoaiHC, String soGiayToHC, String noiCapHC, Date ngayCapHC, String tenLoaiTT, String soGiayToTT, String noiCapTT, Date ngayCapTT) {
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.quocTich = quocTich;
        this.nnc = nnc;
        this.mucDich = mucDich;
        this.tenLoaiHC = tenLoaiHC;
        this.soGiayToHC = soGiayToHC;
        this.noiCapHC = noiCapHC;
        this.ngayCapHC = ngayCapHC;
        this.tenLoaiTT = tenLoaiTT;
        this.soGiayToTT = soGiayToTT;
        this.noiCapTT = noiCapTT;
        this.ngayCapTT = ngayCapTT;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public Date getNnc() {
        return nnc;
    }

    public void setNnc(Date nnc) {
        this.nnc = nnc;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getTenLoaiHC() {
        return tenLoaiHC;
    }

    public void setTenLoaiHC(String tenLoaiHC) {
        this.tenLoaiHC = tenLoaiHC;
    }

    public String getSoGiayToHC() {
        return soGiayToHC;
    }

    public void setSoGiayToHC(String soGiayToHC) {
        this.soGiayToHC = soGiayToHC;
    }

    public String getNoiCapHC() {
        return noiCapHC;
    }

    public void setNoiCapHC(String noiCapHC) {
        this.noiCapHC = noiCapHC;
    }

    public Date getNgayCapHC() {
        return ngayCapHC;
    }

    public void setNgayCapHC(Date ngayCapHC) {
        this.ngayCapHC = ngayCapHC;
    }

    public String getTenLoaiTT() {
        return tenLoaiTT;
    }

    public void setTenLoaiTT(String tenLoaiTT) {
        this.tenLoaiTT = tenLoaiTT;
    }

    public String getSoGiayToTT() {
        return soGiayToTT;
    }

    public void setSoGiayToTT(String soGiayToTT) {
        this.soGiayToTT = soGiayToTT;
    }

    public String getNoiCapTT() {
        return noiCapTT;
    }

    public void setNoiCapTT(String noiCapTT) {
        this.noiCapTT = noiCapTT;
    }

    public Date getNgayCapTT() {
        return ngayCapTT;
    }

    public void setNgayCapTT(Date ngayCapTT) {
        this.ngayCapTT = ngayCapTT;
    }
}
