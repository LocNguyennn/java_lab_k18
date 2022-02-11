package TH_tuan_2.bai_tap_1;

import TH_tuan_2.Circle;
import TH_tuan_2.bai_tap_1.Cylinder;

public class TestCylinder {
    public static void main (String[] args) {
        Cylinder c1 = new Cylinder(2.0,10.0);
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " surface area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        System.out.println("Base area = " + c2.getArea());



    }
}
