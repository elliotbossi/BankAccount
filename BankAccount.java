public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
  }

  public double getAccountID() {
    return accountID;
  }

  public double getBalance() {
    return balance;
  }

  public boolean deposit(double amount){
    if (amount >= 0) {
      balance = balance + amount;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean withdraw(double amount){
    if ((amount > balance) || (amount < 0)){
      return false;
    }
    else {
      balance = balance - amount;
      return true;
    }
  }

  public String toString(){
    return "#"+accountID+"\t$"+balance;
  }

  private boolean authenticate(String password){
    return (this.password.equals(password));
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if ((authenticate(password)) && (withdraw(amount))){
      if (other.deposit(amount)){
        return true;
      }
      else {
        System.out.println("CRITICAL ERROR! $"+amount + " withdrawn from Account #" + getAccountID() + "Failed to add to Account #" + other.getAccountID());
      }
    }
    return false;
    }

}
