package baiTapThiHocKy;

import java.util.ArrayList;

public interface SinhVienServiceInterface {
    SinhVien themSV(ArrayList<SinhVien> sv);
    void xoaSV(ArrayList<SinhVien> sv);
    void chinhSuaSV(ArrayList<SinhVien> sv);
    ArrayList<SinhVien> sapXep(ArrayList<SinhVien> sv);
    void inDanhSach(ArrayList<SinhVien> sv);
}
