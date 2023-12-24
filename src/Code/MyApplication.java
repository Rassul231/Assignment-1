package Code;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

                        public class MyApplication {
                            public static void main(String[] args) throws FileNotFoundException {
                                File file = new File("C:\\Users\\satpe\\IdeaProjects\\Project1\\src\\Code\\source.txt");

                                Scanner sc = new Scanner(file);

                                ArrayList<Point> points = new ArrayList<Point>();
                                //Creating array list

                                while (sc.hasNext()) {
                                    double x = sc.nextDouble();
                                    double y = sc.nextDouble();

                                    Point point = new Point(x, y);
                                    points.add(point);
                                }
                                sc.close();

                                Shape shape = new Shape(points);
                                System.out.println("Perimeter: " + shape.perimeter());
                                System.out.println("longestSide: " + shape.longestSide());
                                System.out.println("averageSide: " + shape.avgSide());
                            }
                        }