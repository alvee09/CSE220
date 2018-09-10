public class Vehicle
{
  int x= 0;
  int y=0;
  
  public void moveUp()
  {
    y++;
  }
   public void moveDown()
  {
    y--;
  }
    public void moveRight()
  {
    x++;
  }
     public void moveLeft()
  {
    x--;
  }
     public String toString()
     {
       return "("+x+","+y+")";
     }
}