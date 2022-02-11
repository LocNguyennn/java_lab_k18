package lab3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class School {
    private ArrayList<GiangVienCoHuu> gv1 = new ArrayList<>();
    private ArrayList<GiangVienThinhGiang> gv2 = new ArrayList<>();
    static Scanner s = new Scanner(System.in);
    Locale localeVN = new Locale("vi", "VN");
    public void example(){
        gv1.add(new GiangVienCoHuu("Nhan vien A","email1@gmail.com", "Duong so 1",42, 5600000,40));
        gv1.add(new GiangVienCoHuu("Nhan vien B","email2@gmail.com", "Duong so 2",46, 5550000,40));
        gv1.add(new GiangVienCoHuu("Nhan vien C","email3@gmail.com", "Duong so 3",41, 5600000,40));
        gv1.add(new GiangVienCoHuu("Nhan vien D","email4@ggmail.com", "Duong so 4",58, 5700000,40));

        gv2.add(new GiangVienThinhGiang("Nhan vien E","email5@gmail.com", "Duong so 5",39, 123456789,"Toa nha so 1"));
        gv2.add(new GiangVienThinhGiang("Nhan vien F","email6@gmail.com", "Duong so 6",41, 123451234,"Toa nha B"));
        gv2.add(new GiangVienThinhGiang("Nhan vien G","email7@gmail.com", "Duong so 7",35, 123516123,"Toa nha D"));
        gv2.add(new GiangVienThinhGiang("Nhan vien H","email8@gmail.com", "Duong so 8",42, 125151251,"Toa nha E"));

    }
    public void input(Object obj){
        String name,email,address;
        int hoursInMonth;
        System.out.print("Ten giao vien: ");
        name = s.nextLine();
        System.out.print("Email giao vien: ");
        email = s.nextLine();
        System.out.print("Dia chi giao vien: ");
        address = s.nextLine();
        System.out.print("So gio giang day trong thang: ");
        hoursInMonth = s.nextInt();

        if((obj instanceof GiangVienCoHuu)){
            int basicSalary, requiredHours;
            System.out.print("Luong co ban: ");
            basicSalary = s.nextInt();
            System.out.print("So gio quy dinh chung: ");
            requiredHours = s.nextInt();
            obj = new GiangVienCoHuu(name,email,address,hoursInMonth,basicSalary,requiredHours);
            gv1.add((GiangVienCoHuu) obj);
        }
        else if((obj instanceof GiangVienThinhGiang)){
            int phoneNum;
            String workPlace;
            System.out.print("So dien thoai: ");
            phoneNum = s.nextInt();
            s.nextLine();
            System.out.print("Noi lam viec: ");
            workPlace = s.nextLine();
            obj = new GiangVienThinhGiang(name,email,address,hoursInMonth,phoneNum,workPlace);
            gv2.add((GiangVienThinhGiang) obj);
        }
    }

    public void printList(){
        System.out.println("--------GIANG VIEN CO HUU--------");
        for(GiangVienCoHuu gv : gv1)
            System.out.println(gv);
        System.out.println("\n");
        System.out.println("--------GIANG VIEN THINH GIANG-----");
        for(GiangVienThinhGiang gv : gv2)
            System.out.println(gv);
    }

    public void totalSalary(){

        float total1 = 0,total2 = 0;
        for(GiangVienCoHuu gv : gv1) {
            System.out.println("Ten: " + gv.getName() + ", luong phai tra: " + NumberFormat.getCurrencyInstance(localeVN).format(gv.totalSalary()));
            total1 += gv.totalSalary();
        }
        System.out.println("Tong tien luong phai tra cho giao vien co huu: " + NumberFormat.getCurrencyInstance(localeVN).format(total1));

        for(GiangVienThinhGiang gv : gv2) {
            System.out.println("Ten: " + gv.getName() + ", luong phai tra: " + NumberFormat.getCurrencyInstance(localeVN).format(gv.totalSalary()));
            total2 += gv.totalSalary();
        }
        System.out.println("Tong tien luong phai tra cho giao vien thinh giang: " + NumberFormat.getCurrencyInstance(localeVN).format(total2));
        System.out.println("Tong so tien phai tra cho giao vien: " + NumberFormat.getCurrencyInstance(localeVN).format(total1 + total2));
    }

    public void HighestSalary(){
        Object obj = new Object();
        float total = 0;
        for(GiangVienCoHuu gv : gv1) {
            if (gv.totalSalary() > total) {
                obj = gv;
                total = gv.totalSalary();
            }
        }
        for(GiangVienThinhGiang gv : gv2) {
            if (gv.totalSalary() > total) {
                obj = gv;
                total = gv.totalSalary();
            }
        }
        System.out.println("Giang vien co tong luong cao nhat la: \n" + obj.toString() + "\nTien luong: " + String.format("%.2f",total));
    }
    public static void main(String[] args) {
        School sc = new School();
        sc.example();
        int choice = 0;
        do{
            System.out.println("\n\n\n");
            System.out.println("1. Nhap thong tin giao vien");
            System.out.println("2. xuat danh sach toan bo giao vien");
            System.out.println("3. Tinh tong so tien luong");
            System.out.println("4. Tim giang vien co tong luong cao nhat");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = s.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1. Giao vien co huu");
                    System.out.println("2. Giao vien thinh giang");
                    System.out.print("Chon: ");
                    int choice_2;
                    choice_2 = s.nextInt();
                    s.nextLine();
                    if (choice_2 == 1) {
                        GiangVienCoHuu gv = new GiangVienCoHuu();
                        sc.input(gv);
                    } else if (choice_2 == 2) {
                        GiangVienThinhGiang gv = new GiangVienThinhGiang();
                        sc.input(gv);
                    }
                    break;
                }
                case 2: {
                    sc.printList();
                    break;
                }
                case 3: {
                    sc.totalSalary();
                    break;
                }
                case 4:
                {
                    sc.HighestSalary();
                    break;
                }
                default:
                    break;
            }
        }while(choice != 0);
    }
}
