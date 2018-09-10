public class finder
{
  public static void swap(int a[])
  {
    int max= a[0];
    int maxIndex=0;
    int min= a[0];
    int minIndex=0;
    for(int i= 0; i<a.length; i++)
    {
      if(a[i]>max)
      {
        max= a[i];
        maxIndex= i;
      }
    }
    for(int i= 0; i<a.length; i++)
    {
      if(a[i]<min)
      {
        min= a[i];
        minIndex= i;
      }
    }
    int temp= max;
    a[maxIndex]= a[minIndex];
    a[minIndex]= temp;
  
    
    display(a);
  }
  public static void display(int b[])
  {
    for(int i= 0; i<b.length; i++)
    {
      System.out.println(b[i]);
    }
  }
}