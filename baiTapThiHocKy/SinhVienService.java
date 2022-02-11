package baiTapThiHocKy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public abstract class SinhVienService implements SinhVienServiceInterface{
    static Scanner scanner = new Scanner(System.in);

    public int inputInt() throws Exception,NumberFormatException{
        String s = scanner.nextLine();
        if(s.equals("")) throw new Exception("Khong duoc de trong");
        int res = Integer.parseInt(s);
        return res;
    }
    public String inputString() throws Exception{
        String s = scanner.nextLine();
        if(s.equals("")) throw new Exception("Khong duoc de trong");
        return s;
    }

    public void thongTinSV(String[] s,int[] n) throws Exception,NumberFormatException{
        System.out.print("Ten: ");
        s[0] = inputString();
        System.out.print("Tuoi: ");
        n[0] = inputInt();
        System.out.print("Ma chuyen nganh( 1-Hoa hoc, 2-Sinh hoc, 3- Toan hoc, 4- Vat ly, 5- Dien tu vien thong): ");
        int num = inputInt();
        if(num <= 0 || num > 5) throw new Exception("Ma chuyen nganh khong hop le");
        if(num == 1)
            s[1] = "Hoa hoc";
        else if(num == 2)
            s[1] = "Sinh hoc";
        else if (num ==3)
            s[1] = "Toan hoc";
        else if(num == 4)
            s[1] = "Vat ly";
        else
            s[1] = "Dien tu vien thong";
        System.out.print("Nien khoa: ");
        n[1] = inputInt();
    }

    @Override
    public SinhVien themSV(ArrayList<SinhVien> sv){
        SinhVien sinhVien;
        try{
            if(sv.size() == 0){
                System.out.print("Set MSSV cho sv dau tien: ");
                int mssv = inputInt();
                SinhVien.setCount(mssv);
            }
            String[] s = new String[2];
            int[] n = new int[2];
            thongTinSV(s,n);
            sinhVien = new SinhVien(s[0],s[1],n[0],n[1]);
            return sinhVien;
        }catch (NumberFormatException nfe){
            System.out.println("Khong dung dinh dang so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public void xoaSV(ArrayList<SinhVien> sv) {
        System.out.print("MSSV muon xoa: ");
        try{
            int mssv = inputInt();
            for(SinhVien s : sv){
                if(s.getMssv() == mssv){
                    sv.remove(s);
                    return;
                }
            }
        }catch (NumberFormatException nfe){
            System.out.println("khong dung dinh dang kieu so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Khong tim thay sinh vien co mssv tuong ung");
    }

    @Override
    public ArrayList<SinhVien> sapXep(ArrayList<SinhVien> sv) {
        System.out.println("1. Sap xep theo mssv tang dan");
        System.out.println("2. Sap xep theo chuyen nganh");
        System.out.print("Chon: ");
        try{
            int choice = inputInt();
            if(choice == 1){
                sv.sort(Comparator.comparing(SinhVien::getMssv));
            }
            else if(choice == 2){
                ArrayList<SinhVien> sv2 = new ArrayList<>();
                String[] s = {"Hoa hoc", "Sinh hoc", "Toan hoc", "Vat ly", "Dien tu vien thong"};
                for(SinhVien sinhVien : sv){
                    if(sinhVien.getChuyenNganh().equals(s)){
                        sv2.add(sinhVien);
                    }
                }
                sv = sv2;
            }
        }catch (NumberFormatException nfe){
            System.out.println("Khong dung dinh dangg kieu so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sv;
    }

    @Override
    public void chinhSuaSV(ArrayList<SinhVien> sv) {
        System.out.print("MSSV cua sinh vien muon sua: ");
        try{
            int mssv = inputInt();
            for (SinhVien sinhVien: sv){
                if(sinhVien.getMssv() == mssv){
                    System.out.println(sinhVien);
                    String[] s = new String[2];
                    int[] n = new int[2];
                    thongTinSV(s,n);
                    sinhVien.setName(s[0]);
                    sinhVien.setChuyenNganh(s[1]);
                    sinhVien.setAge(n[0]);
                    sinhVien.setNienKhoa(n[1]);
                    System.out.println("Thay doi thanh cong");
                    return;
                }
            }
        }catch (NumberFormatException nfe){
            System.out.println("Khong dungg dinh dang so nguyen");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Khong tim thay sv co mssv tuong ung");
    }

    @Override
    public void inDanhSach(ArrayList<SinhVien> sv) {
        for(SinhVien s: sv){
            System.out.println(s);
        }
    }
}
