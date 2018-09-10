import java.util.Scanner;
public class task09
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int array[] = new int[10];
    for(int i=0; i<array.length; i++)
    {
     System.out.println("Please enter a number");
     array[i]= input.nextInt();
    }
    squareNumber(array, array.length);
  }
  public static void squareNumber(int a[], int b)
  {
    int array2[] = new int[b];
    for(int i=0; i<array2.length; i++)
    {
      array2[i]= a[i]*a[i];
    }
    display(array2);
  }
  public static void display(int[] x)
  {
    for(int i=0; i<x.length; i++)
    {
      System.out.println(x[i]);
    }
  }
}