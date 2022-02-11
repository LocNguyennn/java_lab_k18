package TH_tuan_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("The area of circle 1: " + c1.getArea());
        System.out.println();

        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        System.out.println("The area of circle 2: " + c2.getArea());
        c2.setColor("black");
        System.out.println("After being set color: " + c2);
        System.out.println();

        Circle c3 = new Circle(5.0,"blue");
        System.out.println(c3);
        System.out.println("The area of circle 3: " + c3.getArea());
    }
}
