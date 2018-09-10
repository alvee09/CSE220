import java.util.Scanner;
public class task10
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    int [] date= new int[2];
    System.out.println("Please enter a date");
    for(int i=0; i<date.length; i++)
    {
      if(i==0)
      {
        System.out.println("Month");
        date[i]= input.nextInt();
      }
      else
      {
        System.out.println("Day");
        date[i]= input.nextInt();
      }
    }
    System.out.println(seasons(date));
  }
  public static String seasons(int [] a)
  {
    String season= null;
    if(a[0]>=1  && a[0]<3)
    {
      season= "Winter";
    }
    else if(a[0]==3)
    {
      if(a[1]<16)
      {
        season= "Winter";
      }
      else 
      {
        season= "Spring";
      }
    }
    if(a[0]>=4  && a[0]<6)
    {
      season= "Spring";
    }
    else if(a[0]==6)
    {
      if(a[1]<16)
      {
        season= "Spring";
      }
      else
      {
        season= "Summer";
      }
    }
    if(a[0]>=7  && a[0]<9)
    {
      season= "Summer";
    }
    else if(a[0]==9)
    {
      if(a[1]<16){
        season= "Summer";
      }
      else 
      {
        season= "Fall";
      }
    }
    if(a[0]>=10  && a[0]<12)
    {
      season= "Fall";
    }
    else if(a[0]==12)
    {
      if(a[1]<16)
      {
        season= "Fall";
      }
      else 
      {
        season= "Winter";
      }
    }
    return season;
  }
}