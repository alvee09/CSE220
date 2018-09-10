import java.util.Scanner;
public class task04
{
  public static void main(String [] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter the dimension of the matrix");
    int n = input.nextInt();
    int [] a1= new int[n];
    int [] a2= new int[n];
    System.out.println("Please enter a number into the first array");
    for(int i= 0; i<a1.length; i++)
    {
      System.out.println("Please enter a number");
      a1[i]= input.nextInt();
    }
    System.out.println("Please enter a number into the second array");
    for(int i= 0; i<a2.length; i++)
    {
      System.out.println("Please enter a number");
      a2[i]= input.nextInt();
    }
    int [] a3= new int[n];
    for(int i= 0; i<a3.length; i++)
    {
      a3[i]= (5*a1[i])-a2[i];
    }
    for(int i= 0; i<a3.length; i++)
    {
      System.out.print(a3[i]+" ");
    }
  }
}