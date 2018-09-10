public class ComplexNumber
{
  public int real;
  public int imaginary;
  public ComplexNumber(int x, int y)
  {
    real = x;
    imaginary= y;
  }
  public void increaseValue()
  {
    real+=2;
    imaginary+=2;
  }
  public String toString()
  {
    return real+"+"+imaginary+"i";
  }
  public double polarRadius()
  {
    double radius= (real*real)+(imaginary*imaginary);
    radius = Math.pow(radius,0.5);;
    return radius;
  }
}