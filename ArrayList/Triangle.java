import java.util.*;

public class Triangle{

  //create an arraylist of Point data objects
  private ArrayList<Point> vertices = new ArrayList<Point>();

  //constructor method to add the three point vertices
  public Triangle(Point P1, Point P2, Point P3){
    vertices.add(P1);
    vertices.add(P2);
    vertices.add(P3);
  }

  public double findPerimeter(){
    //calculate the three side lengths
    double sideA = vertices.get(1).distanceTo(vertices.get(2));
    double sideB = vertices.get(0).distanceTo(vertices.get(2));
    double sideC = vertices.get(0).distanceTo(vertices.get(1));
    //add the side lenghts to calculate perimeter
    return(sideA + sideB + sideC);
  }

  //driver (main method)
  public static void main(String[] args){

    Point P1 = new Point(0,0);
    Point P2 = new Point(0,2);
    Point P3 = new Point(2,0);
    //forms a right triangle with (0,0),(0,2),(2,0)
    Triangle T1 = new Triangle(P1,P2,P3);
    System.out.println(T1.findPerimeter());

  }
}
