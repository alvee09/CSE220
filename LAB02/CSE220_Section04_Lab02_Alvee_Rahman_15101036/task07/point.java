import java.util.Scanner;
public class point 
{
  public static void main(String [] rags)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the x coordinate of the point");
    double x= input.nextInt();
    System.out.println("Please enter the y coordinate of the point");
    double y= input.nextInt();
    double distance=distanceFromOrigin(x, y);
    System.out.println(distance);
  }
  public static double distanceFromOrigin(double a, double b)
  {
    double i= a;
    double j= b;
    
    double distance= (i*i)+(j*j);
    distance= Math.pow(distance, 0.5);
    return distance;
  }
}