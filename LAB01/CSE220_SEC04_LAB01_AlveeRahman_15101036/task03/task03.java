import java.util.Scanner;
public class task03
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    int array[]= new int[5];
    
    for(int i= 0; i<array.length; i++)
    {
      System.out.println("Please enter a number");
      array[i]= input.nextInt();
    }
    sort ob1= new sort();
    ob1.hightoLow(array);
    
  }
}