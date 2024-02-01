package practice02_BankAccount;

public class BankAccount {

  //field
  private String accNO;
  private long balance;
  
  
  // constructor
  
  public BankAccount() {
    
  }
  
  public BankAccount(String accNO, long balance) {
    this.accNO = accNO;
    this.balance = balance;
    
  }
  
  //method
  public String getAccNO() {
    return accNO;
  }
  public void setAccNO(String accNO) {
    this.accNO = accNO;
  }
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  
  
  
    public void deposit(long money) throws RuntimeException {
      if(money <= 0) {
        throw new RuntimeException (money + "원 입금불가");
       
        }
      
     balance += money;
     
    }
    
    public long withdrawal(long money) throws RuntimeException {
      
      if(money <= 0) {
       throw new RuntimeException(money + "원 출금불가");
       
      }
      if(money > balance) {
        throw new RuntimeException("잔액부족");
      }
      
      balance -= money;
      return money;
      
    }
   public void transfer(BankAccount account, long money) throws RuntimeException {
     
     // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    // long a = withdrawal(money);
     //long b = this.withdrawal(money);
     
     // 네 통장에 입금
     //account.deposit(a);
     account.deposit(withdrawal(money));
   
   
  }
  
  
}
