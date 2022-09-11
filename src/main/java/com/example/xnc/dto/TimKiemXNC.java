package com.example.xnc.dto;


import java.util.Date;

public class TimKiemXNC {
    private long idC;
    private String hoTenC;
    private Integer gioiTinhC;

    private String quocTichC;

    private Date ngaySinhC;

    private String noiSinhC;

    private String soGiayTo;


    public TimKiemXNC(long idC, String hoTenC, Integer gioiTinhC, String quocTichC, Date ngaySinhC, String noiSinhC, String soGiayTo) {
        this.idC = idC;
        this.hoTenC = hoTenC;
        this.gioiTinhC = gioiTinhC;
        this.quocTichC = quocTichC;
        this.ngaySinhC = ngaySinhC;
        this.noiSinhC = noiSinhC;
        this.soGiayTo = soGiayTo;
    }

    public long getIdC() {
        return idC;
    }

    public void setIdC(long idC) {
        this.idC = idC;
    }

    public String getHoTenC() {
        return hoTenC;
    }

    public void setHoTenC(String hoTenC) {
        this.hoTenC = hoTenC;
    }

    public Integer getGioiTinhC() {
        return gioiTinhC;
    }

    public void setGioiTinhC(Integer gioiTinhC) {
        this.gioiTinhC = gioiTinhC;
    }

    public String getQuocTichC() {
        return quocTichC;
    }

    public void setQuocTichC(String quocTichC) {
        this.quocTichC = quocTichC;
    }

    public Date getNgaySinhC() {
        return ngaySinhC;
    }

    public void setNgaySinhC(Date ngaySinhC) {
        this.ngaySinhC = ngaySinhC;
    }

    public String getNoiSinhC() {
        return noiSinhC;
    }

    public void setNoiSinhC(String noiSinhC) {
        this.noiSinhC = noiSinhC;
    }

    public String getSoGiayTo() {
        return soGiayTo;
    }

    public void setSoGiayTo(String soGiayTo) {
        this.soGiayTo = soGiayTo;
    }
}
