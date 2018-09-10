import java.util.Scanner;
public class square
{
  public double height;
  public double width;
  public double getHeight()
  {
    return height;
  }
public void setHeight(double h)
{
  height= h;
}
public double getWidth ()
{
  return width;
}
public void setWidth (double w)
{
  width= w;
}
public double getArea ()
{
  double a= height*width;
  return a;
}

}