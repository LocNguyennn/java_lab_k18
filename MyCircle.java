package TH_tuan_2;

public class MyCircle{
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint();
        this.radius = 1;
    }

    public MyCircle(int x,int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center,int radius){
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int[] result = new int[2];
        result[0] = this.center.getX();
        result[1] = this.center.getY();
        return result;
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);

        /*
        cách 2
        MyPoint mp = new MyPoint(x,y);
        this.setCenter(mp);
         */
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center.toString() +
                ", radius=" + this.getRadius() +
                ']';

    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.getCenter());
        // return center.distance(another.getCenter().getX(),another.getCenter().getY());
    }
}
