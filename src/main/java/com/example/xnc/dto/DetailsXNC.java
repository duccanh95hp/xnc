package com.example.xnc.dto;


import java.util.Date;

public class DetailsXNC {
    private long idTT;

    private String hoTenC;

    private String noiDen;

    private Date ngayDkQuayVe;

    private String ghiChu;

    private Date createdAt;

    private String nameHd;

    private String soGp;

    private String soGt;

    public DetailsXNC(long idTT, String hoTenC, String noiDen, Date ngayDkQuayVe, String ghiChu, Date createdAt, String nameHd, String soGp, String soGt) {
        this.idTT = idTT;
        this.hoTenC = hoTenC;
        this.noiDen = noiDen;
        this.ngayDkQuayVe = ngayDkQuayVe;
        this.ghiChu = ghiChu;
        this.createdAt = createdAt;
        this.nameHd = nameHd;
        this.soGp = soGp;
        this.soGt = soGt;
    }

    public long getIdTT() {
        return idTT;
    }

    public void setIdTT(int idTT) {
        this.idTT = idTT;
    }

    public String getHoTenC() {
        return hoTenC;
    }

    public void setHoTenC(String hoTenC) {
        this.hoTenC = hoTenC;
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

    public String getNameHd() {
        return nameHd;
    }

    public void setNameHd(String nameHd) {
        this.nameHd = nameHd;
    }

    public String getSoGp() {
        return soGp;
    }

    public void setSoGp(String soGp) {
        this.soGp = soGp;
    }

    public String getSoGt() {
        return soGt;
    }

    public void setSoGt(String soGt) {
        this.soGt = soGt;
    }
}
