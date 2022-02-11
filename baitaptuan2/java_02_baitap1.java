package baitaptuan2;

import java.util.Scanner;

public class java_02_baitap1 {
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt(); // chieu cao h cua hinh
        for(int i = 0;i<(n/2) +1;i++){
            for(int j = 0;j<=n+1;j++){
                if(j < (n+1)-i*2)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(int j = (n+1);j >= 0;j--) {
                if (j < (n+1) - i * 2)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i = (n/2) +1 ;i < n;i++){
            for(int j = 0;j <=(n+1);j++){
                if(j < ((i*2)+4) - (n+1))
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(int j = (n+1);j>=0;j--){
                if(j < ((i*2)+4) - (n+1))
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
