package Code;
public class Point {
    private double x;
    private double y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }


    // I used this formul:AB = √(xb - xa)^2 + (yb - ya)^2

    public double distanceTo(Point destination){
        double distX = this.x - destination.x;
        double distY = this.y - destination.y;

        return Math.sqrt(distX*distX + distY*distY);
    }

    @Override
    public String toString() {
        return "X = " + x + " Y = " + y;
    }


}