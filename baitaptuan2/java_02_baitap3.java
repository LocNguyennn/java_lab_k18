package baitaptuan2;

import java.util.Scanner;

public class java_02_baitap3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = keyboard.nextInt();
        /*
        kết quả hiển thị ra màn hình vẫn nhập được số tuổi nhưng không nhập được tên do
        sau khi đọc giá trị integer thì chúng ta vẫn còn kí tự enter ( "\n") mà nextInt()
        thì không đọc được kí tự này nên nếu để có thể đọc được chuỗi tiếp sau đó thì chúng
        ta sử dụng cách sau, đó là thêm vào:
        keyboard.nextLine();

        lúc này sau khi nhập tuổi ta có thể nhập được tên.
         */
        System.out.println("Enter your name.");
        String name = keyboard.nextLine();
        System.out.println(name + ",you are " + age + " years old.");
    }
}
