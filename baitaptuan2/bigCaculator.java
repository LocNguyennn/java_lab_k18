package baitaptuan2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class bigCaculator {
    Scanner s = new Scanner(System.in);

    public boolean validInt(String s){
        try{
            int num = Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public BigDecimal add(BigDecimal number1, BigDecimal number2){
        BigDecimal result = number1.add(number2,MathContext.DECIMAL128);
        return result;
    }
    public BigDecimal subtract(BigDecimal number1, BigDecimal number2){
        BigDecimal result = number1.subtract(number2,MathContext.DECIMAL128);
        return result;
    }
    public BigDecimal divide(BigDecimal number1, BigDecimal number2){
        BigDecimal result = number1.divide(number2, MathContext.DECIMAL128);
        return result;
    }
    public BigDecimal multiply(BigDecimal number1, BigDecimal number2){
        BigDecimal result = number1.multiply(number2,MathContext.DECIMAL128);
        return result;
    }

    void caculate(String num1, String num2){
        int choice =-1;
        do{
            System.out.println("1. Phép toán cộng");
            System.out.println("2. Phép toán trừ.");
            System.out.println("3. Phép toán nhân");
            System.out.println("4. Phép toán chia");
            System.out.println("0. Thoát");
            do {
                System.out.print("Nhập lựa chọn: ");
                String str = s.next();
                if(validInt(str) == true)
                    choice = Integer.parseInt(str);
            }while(choice < 0 || choice >4); // Nhập lựa chọn tương ứng từ 0 tới 4
            if(choice == 0) break;
            System.out.print("Nhập số thứ 1: ");
            num1 = s.next();
            System.out.print("Nhập số thứ 2: ");
            num2 = s.next();
            BigDecimal number1 = new BigDecimal(num1);
            BigDecimal number2 = new BigDecimal(num2);
            System.out.print("Đáp số ");
            BigDecimal result;
            switch (choice){
                case 1: {
                    result = add(number1,number2);
                    System.out.println("cộng: " + result);
                    break;
                }
                case 2:
                {
                    result = subtract(number1,number2);
                    System.out.println("trừ: " +result);
                    break;
                }
                case 3:{
                    result = multiply(number1,number2);
                    System.out.println("nhân: " +result);
                    break;
                }
                case 4:{
                    result = divide(number1,number2);
                    System.out.println("chia: " +result);
                    break;
                }
                default: break;
            }

        }while(choice!=0);
    }
    public static void main(String[] args) {
        String num1 = "", num2= "";
        bigCaculator BC = new bigCaculator();
        BC.caculate(num1,num2);
    }
}
