package TH_tuan_2.bai_tap_1;

import TH_tuan_2.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*this.height + 2*super.getArea();
    }
}
