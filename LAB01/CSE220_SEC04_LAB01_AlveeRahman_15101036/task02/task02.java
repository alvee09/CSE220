import java.util.Scanner;
public class task02
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    int[] array= new int[5];
    for(int i=0; i<array.length; i++)
    {
      System.out.println("Please enter a number");
      array[i]= input.nextInt();
    }
    finder locater= new finder();
    locater.swap(array);
    
  }
  
}