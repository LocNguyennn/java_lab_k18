package thiHocKy;

import java.util.ArrayList;

public interface NhanVienServiceInterface {
    NhanVien themNV(ArrayList<NhanVien> nv);
    void xoaNV(ArrayList<NhanVien> nv);
    void chinhSua(ArrayList<NhanVien> nv);
    void inDanhSach(ArrayList<NhanVien> nv);
    ArrayList<NhanVien> sapXep(ArrayList<NhanVien> nv);
}
