public class ComplexNumber extends RealNumber
{
  public double in;
  public ComplexNumber()
  {
    super.setRealValue(1.0);
    in=1.0;
  }
  public ComplexNumber (double x, double y)
  {
    super.setRealValue(x);
    in=y;
  }
  public String toString()
  {
    System.out.println(super.toString());
    return "Imaginary Part : "+in; 
  }
  public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
  public void check()
  {
    this.ping();
    super.ping();
    System.out.println("Checking ended");
  }
}