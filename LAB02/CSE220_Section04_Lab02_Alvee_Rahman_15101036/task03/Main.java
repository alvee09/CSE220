public class Main
{
  public static void main(String[] args)
  {
    BankAccount acc1= new BankAccount();
    BankAccount acc2= new BankAccount();
    BankAccount acc3= new BankAccount();
    
    acc1.setName("Alvee");
    acc1.setAccountID("12");
    acc1.setAddress("Dhanmondi");
    acc1.setBalance(1000);
    
    acc1.addInterest();
    System.out.println(acc1.getName());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getBalance());
    
  }
}