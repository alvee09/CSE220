import java.util.Scanner;
public class task05
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    int a[]= new int[10];
    int i=0;
    while( i<15)
    {
      System.out.println("Enter a number");
      int x=input.nextInt();
      if(x>=0 && x<10)
      {
        a[x]++;
        i++;
      }
      else
      {
        System.out.println("Invalid input, try again");
      }
    }
    for(int n=0; n<a.length; n++)
    {
      System.out.println(n+" found "+a[n]+" times.");
    }
  }
}