package TH_tuan_2.bai_tap_2;

public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1);
        System.out.println("Area of square 1: " + s1.getArea());
        System.out.println("Perimeter of square 1: " + s1.getPerimeter());

        Square s2 = new Square(5);
        System.out.println(s2);
        System.out.println("Area of square 2: " + s2.getArea());
        System.out.println("Perimeter of square 2: " + s2.getPerimeter());
        s2.setLength(4);
        System.out.println("Area of square 2(after set side = 4): " + s2.getArea());
        System.out.println("Perimeter of square 2(after set side = 4): " + s2.getPerimeter());

        Square s3 = new Square(6,"purple",false);
        System.out.println(s3);
        System.out.println("Area of square 3: " + s3.getArea());
        System.out.println("Perimeter of square 3: " + s3.getPerimeter());
    }
}
