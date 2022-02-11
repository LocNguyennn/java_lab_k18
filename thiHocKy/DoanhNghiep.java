package thiHocKy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DoanhNghiep extends NhanVienService{
    ArrayList<NhanVien> nv = new ArrayList<>();

    public void themNV(){
        System.out.print("So luong nv muon them: ");
        int n = Integer.parseInt(scanner.nextLine());
        while(n>0 && nv.size() < 500){
            NhanVien nhanVien = themNV(nv);
            if(nhanVien != null)
                nv.add(nhanVien);
            else
                continue;
            n--;
        }
        if(nv.size() > 500) System.out.println("Vuot qua 500 nhan vien");
    }

}
