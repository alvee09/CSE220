import java.util.Scanner;
public class task11
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    boolean odd= false;
    System.out.println("Please enter a number");
    int n = input.nextInt();
    odd= allDigitsOdd(n);
    System.out.println(odd);
  }
  public static boolean allDigitsOdd(int a)
  {
    boolean test= false;
    for(;;)
    {
      int rem=a%10;
      a=a/10;
      if(a==0)
      {
        return test;
      }
      else if(rem%2==0)
      {
        test= false;
        return test;
      }
      else
      {
        test= true;
      }
    }
  }
}