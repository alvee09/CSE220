public class calculate
{
  public static void generateMatrix(int a[], int b[])
  {
    int newarray[] = new int[a.length];
    for(int i=0; i<newarray.length; i++)
    {
      newarray[i]= (5*a[i])-b[i];
    }
    System.out.print("[ ");
    for(int i=0; i<newarray.length; i++)
    {
        System.out.print(newarray[i]+" ");
    }
    System.out.print("]");
  }
}