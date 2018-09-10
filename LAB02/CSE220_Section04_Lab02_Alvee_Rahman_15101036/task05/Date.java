public class Date
{
  public int date;
  public int month;
  public int year;
  public Date(int d, int m, int y)
  {
    date= d;
    month = m;
    year=y;
  }
  public void displayDate()
  {
    System.out.println(date+"/"+month+"/"+year);
  }
}