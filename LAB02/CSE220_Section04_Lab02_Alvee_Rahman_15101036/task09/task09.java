import java.util.Scanner;
public class task09
{
  public static void main(String [] args)
  {
    Scanner input= new Scanner(System.in);
    int [] a= new int [10];
    for(int i =0; i<a.length; i++)
    {
      System.out.println("Please enter a number");
      a[i]= input.nextInt();
    }
    System.out.println("Please enter the position to rotate");
    int x= input.nextInt();
    leftRotate(a , x);
    rightRotate(a, x);
  }
  public static void leftRotate(int [] a, int x)
  {
    int [] b= new int[10];
    int [] temp= new int[x];
    
    for(int i=0; i<x; i++)
    {
      temp[i]= a[i];
    }
    for(int i=x, j=0; i<a.length; i++,j++)
    {
      b[j]= a[i];
    }
    for(int i =b.length-x, j=0; i<b.length; i++, j++)
    {
      b[i]= temp[j];
    }
    for(int i=0; i<b.length; i++)
    {
      if(i==b.length-1)
      {
        System.out.println(b[i]+" ");
      }
      else
      {
       System.out.print(b[i]+" ");
      }
    }
  }
  public static void rightRotate(int[] a , int x)
  {
    int [] b= new int[10];
    int [] temp= new int[a.length-x];
    for(int i=0, j=0  ; j<temp.length; j++, i++)
    {
      temp[j]= a[i];
    }
    for(int i=a.length-x, j=0; i<a.length; i++, j++)
    {
      b[j]= a[i];
    }
    for(int i=x, j=0; j<temp.length; j++, i++)
    {
      b[i]=temp[j];
    }
    for(int i=0; i<b.length; i++)
    {
      System.out.print(b[i]+" ");
    }
  }
}