package thiHocKy;

public class main {
    public static void main(String[] args) {
        DoanhNghiep dn = new DoanhNghiep();
        dn.themNV();
        dn.inDanhSach(dn.nv);
        dn.xoaNV(dn.nv);
        dn.inDanhSach(dn.nv);
        dn.chinhSua(dn.nv);
        dn.inDanhSach(dn.nv);
        dn.sapXep(dn.nv);
        dn.inDanhSach(dn.nv);
    }
}
