public class Point{
  private int x;
  private int y;

  public Point(){ /* no argument constructor */
    x = 0;
    y = 0;
  }

  public Point(int xPoint, int yPoint){ /* parametrized constructor */
    x = xPoint;
    y = yPoint;
  }

  public int getX(){
    return(x);
  }

  public int getY(){
    return(y);
  }

  public String toString(){ //(x,y) is the format of the string
    return("(" + x + "," + y + ")");
  }

  public double distanceTo(Point other){
    double dx = this.x - other.x; // int -> double cast
    double dy = this.y - other.y;
    return(Math.sqrt(dx * dx + dy * dy));
  }


}
