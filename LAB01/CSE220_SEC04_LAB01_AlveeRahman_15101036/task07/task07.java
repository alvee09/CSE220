import java.util.Scanner;
public class task07
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++)
    {
      System.out.println("Please enter a number");
      a[i]= input.nextInt();
    }
    for(;;)
    {
    System.out.println("Enter a number between o and 9");
    int temp= input.nextInt();
    if(temp>=0 && temp<10)
    {
      printStar(a[temp]);
      break;
    }
    else
    {
      System.out.println("Invalid input try again");
    }
  }
  }
  public static void printStar(int n)
  {
    for(int s= n; n>0; n--)
    {
      System.out.print("*");
    }
  }
}