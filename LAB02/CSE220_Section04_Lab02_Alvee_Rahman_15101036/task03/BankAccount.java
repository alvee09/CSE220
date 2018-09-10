public class BankAccount 
{
  public String Name;
  public String ID;
  public String Address;
  public double Balance;
  public String getName()
  {
    return Name;
  }
    public void setName(String n)
    {
      Name=n;
    }
    public String getAccountID()
    {
      return ID;
    }
    public void setAccountID(String i)
    {
      ID=i;
    }
    public String getAddress()
    {
      return Address;
    }
    public void setAddress(String a)
    {
      Address= a;
    }
    public double getBalance()
    {
      return Balance;
    }
    public void setBalance(double c)
    {
      Balance= c;
    }
    public void addInterest() //adds 7% of the balance
    {
      Double interest= Balance*0.07;
      Balance = Balance + interest;
    }
}