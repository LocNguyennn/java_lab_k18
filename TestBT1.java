package lab3;

public class TestBT1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // up-casting
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        // class Shape không có method getRadius()

        Circle c1 = (Circle)s1; // down-casting
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();
        // Shape là lớp abstract nên không thể khởi tạo được

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        // class Shape không có method getLength()

        Rectangle r1 = (Rectangle)s3; // down-casting
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // up-casting
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());
        // class Shape không có method getSide()

        Rectangle r2 = (Rectangle)s4; // down-casting to Rectangle, which is a superclass of Square
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        // class Rectangle không có method getSide()
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // down-casting
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
