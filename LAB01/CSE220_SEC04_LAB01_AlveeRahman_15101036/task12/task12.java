import java.util.Scanner;
public class task12
{
  public static void main(String[] arg)
  {
    Scanner input= new Scanner (System.in);
    int date1[]= new int[2];
    int date2[]= new int[2];
    boolean firstComesBefore= true;
    System.out.println("Pleas enter the first date");
    for(int i=0; i<date1.length; i++)
    {
      date1[i]= input.nextInt();
    }
    System.out.println("Pleas enter the second date");
    for(int i=0; i<date2.length; i++)
    {
      date2[i]= input.nextInt();
    }
    firstComesBefore=compare(date1, date2);
    System.out.println(firstComesBefore);
  }
  public static boolean compare(int[] a, int[]b)
  {
    boolean checking= false;
    if(a[0]<b[0])
    {
      checking= true;
    }
    else if(a[0]==b[0])
    {
      if(a[1]<b[1])
      {
        checking= true;
      }
      else
      {
        checking= false;
      }
    }
    return checking;
  }
}