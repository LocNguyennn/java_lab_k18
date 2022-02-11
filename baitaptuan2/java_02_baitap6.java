package baitaptuan2;

import java.util.Scanner;

public class java_02_baitap6 {

    public static void main(String[] args) {
        String s = "";
        char c = ' ';
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.println("Enter 'A' for option A " +
                    "or 'B' for option B.");
            s = keyboard.next();
            s = s.toLowerCase();
            c = s.charAt(0);
        }
        while ((c != 'a') && (c != 'b'));
    }
}