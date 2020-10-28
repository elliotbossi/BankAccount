public class Tester{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount(100,"password");
    BankAccount b2 = new BankAccount(100,"password");
    System.out.println(b1.toString());
    System.out.println(b1.getAccountID());
    System.out.println(b1.getBalance());
    System.out.println(b1.deposit(10));
    System.out.println(b2.deposit(10));
    System.out.println(b1.getBalance());
    System.out.println(b1.withdraw(4));
    System.out.println(b1.getBalance());
    System.out.println(b1.transferTo(b2, 3, "password"));
    System.out.println(b1.getBalance());
    System.out.println(b2.getBalance());

  }

}
