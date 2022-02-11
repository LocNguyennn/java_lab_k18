package TH_tuan_2.bai_tap_2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area of rectangle 1: " + r1.getArea());
        System.out.println("Perimeter of rectangle 1: " + r1.getPerimeter());
        Rectangle r2 = new Rectangle(5.0,7.0);
        System.out.println(r2);
        System.out.println("Area of rectangle 2: " + r2.getArea());
        System.out.println("Perimeter of rectangle 2: " + r2.getPerimeter());
        Rectangle r3 = new Rectangle(12.0,6.3,"gray",false);
        System.out.println(r3);
        System.out.println("Area of rectangle 3: " + r3.getArea());
        System.out.println("Perimeter of rectangle 3: " + r3.getPerimeter());
    }
}
