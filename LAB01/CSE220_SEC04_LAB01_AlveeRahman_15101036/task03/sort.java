public class sort
{
  public static void hightoLow(int[] a)
  {
    for(int i=0; i<a.length; i++)
    {
      for(int n=i+1; n<a.length; n++)
      {
        if(a[n]>a[i])
        {
          int temp= a[n];
          a[n]=a[i];
          a[i]= temp;
        }
      }
      
    }
    display(a);
  }
  
  public static void display(int[] b)
  {
    for(int n= 0; n<b.length; n++)
    {
      System.out.println(b[n]);
    }
  }
}