package baiTapThiHocKy;

import java.util.ArrayList;
import java.util.Scanner;

public class School extends SinhVienService{
    ArrayList<SinhVien> sv = new ArrayList<>();

    public void themSV(){
        System.out.print("So luong sv muon them: ");
        int n = Integer.parseInt(scanner.nextLine());
        while(n>0 && sv.size() < 500){
            SinhVien sinhVien = themSV(sv);
            if(sinhVien != null)
                sv.add(sinhVien);
            else
                continue;
            n--;
        }
        if(sv.size() > 500) System.out.println("Vuot qua gioi han quan ly ( 500 sinh vien)");
    }
    public void xoaSV(){
        xoaSV(sv);
    }
    public void sapXep(){
        sapXep(sv);
    }
    public void chinhSua(){
        chinhSuaSV(sv);
    }
    public void inDanhSach(){
        inDanhSach(sv);
    }
    public static void main(String[] args) {
        School school = new School();
        school.themSV();
        school.inDanhSach();
        school.xoaSV();
        school.inDanhSach();
        school.chinhSua();
        school.inDanhSach();
        school.sapXep();
        school.inDanhSach();
    }
}
