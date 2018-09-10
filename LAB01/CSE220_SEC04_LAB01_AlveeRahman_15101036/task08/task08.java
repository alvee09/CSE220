import java.util.Scanner;
public class task08
{
  public static void main(String [] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter the dimension");
    int d= input.nextInt();
    int x[]= new int[d];
    int y[]= new int[d];
    for (int i =0; i<x.length; i++)
    {
      System.out.println("Enter number for the first array");
      x[i]= input.nextInt();  
    }
    for (int i =0; i<y.length; i++)
    {
      System.out.println("Enter number for the second array");
      y[i]= input.nextInt(); 
    }
    calculate ob1= new calculate();
    ob1.generateMatrix(x,y);
    

  }
}