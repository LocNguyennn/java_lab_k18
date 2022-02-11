package TH_tuan_1;

import java.util.Scanner;

public class bai2 {

    public boolean valid_binary(String binary){
        for(int i = 0; i < binary.length();i++){
            if(!(binary.charAt(i) == '0' || binary.charAt(i) == '1'))
                return false;
        }
        return true;
    }
    public void Binary2Decimal(String binary){
        int decimal = 0;
        for(int i = 0; i < binary.length();i++){
            decimal = decimal * 2 + Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        System.out.println("kết quả thập phân: " + decimal);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bai2 B2D = new bai2();
        String binary = "";
        while(true) {
            System.out.print("Nhập giá trị nhị phân: ");
            binary = s.next();
            if(B2D.valid_binary(binary) == false){
                System.out.println("invalid binary string "+ binary);
            }
            else
                break;
        }
        B2D.Binary2Decimal(binary);
    }
}
