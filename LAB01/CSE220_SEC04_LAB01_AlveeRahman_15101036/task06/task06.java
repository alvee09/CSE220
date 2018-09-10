import java.util.Scanner;
public class task06
{
  public static void main(String[] args)
  {
    boolean palindrome= false; 
    Scanner input= new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<a.length; i++)
    {
      System.out.println("Please enter a number");
      a[i]= input.nextInt();
    }
    if(a[0]==a[a.length-1])
    {
      if(a[1]==a[a.length-2])
      {
        palindrome= true;
      }
    }
    if(palindrome ==true)
    {
      System.out.println("Array is a palindrome");
    }
    else
    {
      System.out.println("Array is not a palindrome");
    }
    
  }
}