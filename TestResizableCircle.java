package lab4;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5);
        System.out.println(c);
        System.out.println("getPerimeter() = " + c.getPerimeter());
        System.out.println("getArea() = " + c.getArea());
        System.out.println();

        ResizeableCircle rc1 = new ResizeableCircle(5);
        System.out.println(rc1);
        System.out.println("getPerimeter() = " + rc1.getPerimeter());
        System.out.println("getArea() = " + rc1.getArea());
        System.out.println();

        rc1.resize(105);
        System.out.println(rc1);
        System.out.println("getPerimeter() = " + rc1.getPerimeter());
        System.out.println("getArea() = " + rc1.getArea());

    }
}
