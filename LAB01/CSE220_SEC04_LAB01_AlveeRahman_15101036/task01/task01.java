public class task01
{
  public static void main (String[] args)
  {
    int array[]= {1,2,6};
    boolean b= firstLast6(array);
    System.out.println(b);
  }
  public static boolean firstLast6(int a[]) 
  {
    if(a[0]==6 || a[a.length-1]==6)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}