package com.sample.assignmentchitieu.model;

public class KhoanChi {
    private String maKhoanChi;
    private String tenKhoanChi;
    private double soTien;
    private String ngayChi;
    private String maLoaiChi;

    public KhoanChi(String maKhoanChi, String tenKhoanChi, double soTien, String ngayChi, String maLoaiChi) {
        this.maKhoanChi = maKhoanChi;
        this.tenKhoanChi = tenKhoanChi;
        this.soTien = soTien;
        this.ngayChi = ngayChi;
        this.maLoaiChi = maLoaiChi;
    }
}
