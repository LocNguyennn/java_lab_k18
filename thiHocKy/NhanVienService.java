package thiHocKy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public abstract class NhanVienService implements NhanVienServiceInterface {
    public static Scanner scanner = new Scanner(System.in);

    public int inputInt() throws Exception,NumberFormatException{
        String s = scanner.nextLine();
        if(s.equals("")) throw new Exception("Khong duoc bo trong");
        int res = Integer.parseInt(s);
        return res;
    }
    public String inputString() throws Exception{
        String s = scanner.nextLine();
        if(s.equals("")) throw new Exception("Khong duoc bo trong");
        return s;
    }
    public void thongTinNV(String[] s, int[] n) throws Exception,NumberFormatException{
        System.out.print("Ten: ");
        s[0] = inputString();
        System.out.print("Tuoi: ");
        n[0] = inputInt();
        System.out.print("Ma so phong ban(1- Ky thuat, 2- Ke toan, 3- Quan ly, 4- Ban hang): ");
        int num = inputInt();
        if(num <= 0 || num > 4) throw new Exception("Ma so phong ban khongg hop le.");
        if(num == 1)
            s[1] = "Ky thuat";
        else if (num == 2)
            s[1] = "Ke toan";
        else if(num == 3)
            s[1] = "Quan ly";
        else
            s[1] = "Ban hang";

    }

    @Override
    public NhanVien themNV(ArrayList<NhanVien> nv) {
        NhanVien nhanVien;
        try{
            if(nv.size() == 0){
                System.out.print("Nhap MSNV ban dau: ");
                int msnv = inputInt();
                NhanVien.setCount(msnv);
            }
            String[] s = new String[2];
            int[] n = new int[1];
            thongTinNV(s,n);
            nhanVien = new NhanVien(s[0],s[1],n[0]);
            return nhanVien;
        }catch (NumberFormatException nfe){
            System.out.println("Khong dungg dinh dang kieu so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void xoaNV(ArrayList<NhanVien> nv) {
        System.out.print("MSNV muon xoa: ");
        try{
            int msnv = inputInt();
            for(NhanVien nhanVien: nv){
                if(nhanVien.getMsnv() == msnv){
                    nv.remove(nhanVien);
                    System.out.println("Xoa thanh cong");
                    return;
                }
            }
        }catch (NumberFormatException nfe){
            System.out.println("Khongg dung dinh dang kieu so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Khong tim thay nv co msnv tuong ung");
    }

    @Override
    public ArrayList<NhanVien> sapXep(ArrayList<NhanVien> nv) {
        System.out.println("1. Sap xep theo msnv giam dan");
        System.out.println("2. Sap xep theo phong ban");
        System.out.print("Chon: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if(choice == 1){
            nv.sort(Comparator.comparing(NhanVien::getMsnv).reversed());
        }else if(choice == 2)
        {
            ArrayList<NhanVien> nv2 = new ArrayList<>();
            String[] s = {"Ky thuat","Ke toan","Quan ly","Ban hang"};
            for(String string: s){
                for(NhanVien nhanVien: nv){
                    if(nhanVien.getPhongBan().equals(string)){
                        nv2.add(nhanVien);
                    }
                }
            }
            nv = nv2;
        }
        return nv;
    }

    @Override
    public void chinhSua(ArrayList<NhanVien> nv) {
        System.out.println("MSNV muon chnih sua: ");
        try{
            int msnv = inputInt();
            for(NhanVien nhanVien : nv){
                if(nhanVien.getMsnv() == msnv){
                    System.out.println(nhanVien);
                    String[] s = new String[2];
                    int[] n = new int[1];
                    thongTinNV(s,n);
                    nhanVien.setName(s[0]);
                    nhanVien.setPhongBan(s[1]);
                    nhanVien.setAge(n[0]);
                }
            }
        }catch (NumberFormatException nfe){
            System.out.println("Khongg dungg dinh dangg kieu so");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Khong tim thay nv co msnv tuong ung");
    }

    @Override
    public void inDanhSach(ArrayList<NhanVien> nv) {
        for(NhanVien nhanVien : nv){
            System.out.println(nhanVien);
        }
    }
}
