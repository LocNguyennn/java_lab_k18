package TH_tuan_2;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle mC1 = new MyCircle(3,4,4);
        System.out.println(mC1); // method toString
        int[] xy = mC1.getCenterXY();
        System.out.println("method getCenterXY() return: x="+ xy[0] + ",y= " + xy[1]);
        System.out.println("Area of circle 1: " + mC1.getArea());
        System.out.println("Circumference of circle 1: " + mC1.getCircumference());
        System.out.println();

        MyCircle c2 = new MyCircle(12,7,5);
        System.out.println(c2); // toString
        System.out.println("Area of circle 2: " + c2.getArea());
        System.out.println("Circumference of circle 2: " +c2.getCircumference());
        System.out.println("Distance between circle 1 and circle 2: " + mC1.distance(c2));
        System.out.println();

        MyCircle c3 = new MyCircle();
        System.out.println(c3); // toString
        System.out.println("Area of circle 3: " + c3.getArea());
        System.out.println("Circumference of circle 3: " +c3.getCircumference());
        c3.setCenterXY(3,5);
        c3.setRadius(6);
        System.out.println("After change center = " + c3.getCenter() + " and radius = " + c3.getRadius() + ": ");
        System.out.println("Area of circle 3: " + c3.getArea());
        System.out.println("Circumference of circle 3: " +c3.getCircumference());
        System.out.println();

        MyPoint mp = new MyPoint(2,7);
        MyCircle c4 = new MyCircle(mp,3);
        System.out.println(c4); // toString
        System.out.println("Area of circle 4: " + c4.getArea());
        System.out.println("Circumference of circle 4: " +c4.getCircumference());
        System.out.println("Distance between circle 3 and circle 4: " + c3.distance(c4));
    }


}
