import java.util.Scanner;
public class task04{
  public static void main(String[] args)
  {
    repetation(10);
  }
  public static void repetation(int n)
  {
    Scanner input= new Scanner(System.in);
    int a[]= new int[n];
    int x= 0;
    while(x<a.length)
    {
      boolean same= false;
      System.out.println("enter number");
      int temp= input.nextInt();
      for(int y=0; y<x; y++)
      {
        if(temp==a[y])
        {
          same= true;
        }
      }
      if(same==true)
      {
        System.out.println("error");
      }
      else
      {
        a[x]=temp;
        x++;
      }
    }
  }
}