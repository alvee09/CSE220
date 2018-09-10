import java.util.Scanner;
public class task08
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter the a coefficient of the equation");
    int a= input.nextInt();
    System.out.println("Please enter the another coefficient of the equation");
    int b= input.nextInt();
    System.out.println("Please enter the last coefficient of the equation");
    int c= input.nextInt();
    
    QuadEqn eq= new QuadEqn(a,b,c);
    eq.findRoot();
    System.out.println(eq);
  }
}