package TH_tuan_2.bai_tap_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area of circle 1: " + c1.getArea());
        System.out.println("Perimeter of circle 1: " + c1.getPerimeter());
        Circle c2 = new Circle(5.0,"brown",false);
        System.out.println(c2);
        System.out.println("Area of circle 2: " + c2.getArea());
        System.out.println("Perimeter of circle 2: " + c2.getPerimeter());
        Circle c3 = new Circle(5.0);
        System.out.println(c3);
        System.out.println("Area of circle 3: " + c3.getArea());
        System.out.println("Perimeter of circle 3: " + c3.getPerimeter());
    }
}
