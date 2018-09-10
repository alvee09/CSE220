public class QuadEqn
{
  int a= 0;
  int b= 0; 
  int c= 0;
  public QuadEqn(int x, int y, int z)
  {
     a= x;
     b= y; 
     c= z;
  }
  public void findRoot()
  {
    double root= Math.pow(b,2)-(4*a*c);
    root= -b+Math.pow(root, 0.5);
    root= root/(2*a);
    System.out.println(root);
  }
  public String toString()
  {
    return a+"x2+"+b+"y+"+c;
  }
}