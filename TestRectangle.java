package TH_tuan_2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area of rectangle 1: " + r1.getArea());
        System.out.println("Perimeter of rectangle 1: " + r1.getPerimeter());
        r1.setLength(5.15f);
        r1.setWidth(2.3f);
        System.out.println("After change length to " + r1.getLength() + " and width to " + r1.getWidth() + ": ");
        System.out.println("Area of rectangle 1: " + r1.getArea());
        System.out.println("Perimeter of rectangle 1: " + r1.getPerimeter());
        System.out.println();

        Rectangle r2 = new Rectangle(12.5f,5.75f);
        System.out.println(r2);
        System.out.println("Area of rectangle 2: " + r2.getArea());
        System.out.println("Perimeter of rectangle 2: " + r2.getPerimeter());
    }
}
