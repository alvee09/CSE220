import java.util.Scanner;
public class Main
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the real part");
    int x= input.nextInt();
    System.out.println("Please enter the imaginaly part");
    int y= input.nextInt();
    ComplexNumber cn= new ComplexNumber(x, y);
    
    System.out.println(cn);
    System.out.println(cn.polarRadius());
  }
}