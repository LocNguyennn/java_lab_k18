package TH_tuan_1;

import java.math.BigInteger;

public class bai4 {
    public static BigInteger multiply(BigInteger a, BigInteger b){
        return a.multiply(b);
    }
    public static void main(String[] args) {
        int n = 20;         // To compute factorial of n
        BigInteger factorial = new BigInteger("1"); // Init the product to 1
        int i = 1;
        while (i <= n) {
            BigInteger Big_I = BigInteger.valueOf(i);
            factorial = multiply(factorial,Big_I);
            i++;
        }
            System.out.println("The Factorial of " +n + " is " + factorial);
    }
    public int t(){
        System.out.println("base class");
        return 0;
    }
}


