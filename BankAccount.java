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

}
