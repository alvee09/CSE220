public class CheckingAccount extends Account
{
  public static int numberOfAccount=0;
  public CheckingAccount ()
  {
    super(0);
    numberOfAccount++;
  }
  public CheckingAccount(double x)
  {
    super(x);
      numberOfAccount++;
  }
  public int numberOfAccount()
  {
    return numberOfAccount;
  }
}