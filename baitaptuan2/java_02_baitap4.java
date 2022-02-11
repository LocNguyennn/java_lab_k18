package baitaptuan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_02_baitap4 {
    public static void main(String[] args){
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("abc.txt"));
            System.out.println("File " + (fileIn.hasNextLine() == Boolean.TRUE ? "có" : "không có") + " dữ liệu");
            System.out.println("Nội dung file: ");
            while(fileIn.hasNext()){
                System.out.println(fileIn.nextLine());
            }
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
