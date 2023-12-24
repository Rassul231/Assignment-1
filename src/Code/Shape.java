package Code;
import java.util.ArrayList;
public class Shape {
    ArrayList<Point> points;

    public Shape(ArrayList<Point> points){
        this.points = points;
    }
public double perimeter(){
    double sum = 0;
    for(int i = 0; i < points.size(); i++)
    {
        Point currentPoint = points.get(i);
        Point nextPoint =  points.get((i+1) % points.size());
        //To get the distance between points 10 and 1, find the remainder of 11 and the size (10)
        // 11 % 10 = 1
        sum = sum + currentPoint.distanceTo(nextPoint);
    }
    return sum;
}
public double longestSide(){
    double maxSide = 0;
    double temp = 0;
    for(int i = 0; i < points.size(); i++){
        Point currentPoint = points.get(i);
        Point nextPoint =  points.get((i+1) % points.size());
        temp = currentPoint.distanceTo(nextPoint);
        // To find maxSide compare all the borders
        if (maxSide < temp)
            maxSide = temp;
    }

    return maxSide;
}


public double avgSide()
{
    double average = 0;
    if (points.size() > 0)
        average = perimeter() / points.size();

    return average;
}

}