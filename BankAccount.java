public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    this.accountID = accountID;
    this.password = password;
  }

  public String toString(){
    return "#"+accountID+"\t$"+balance;
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
}
