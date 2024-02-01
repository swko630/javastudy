package practice01_BankAccount;

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
    public void deposit(long money) {
      if(money <= 0) {
        System.out.println(money + "원 입금불가");
        return;
        }
      
     balance += money;
     
    }
    
    public long withdrawal(long money) {
      
      if(money <= 0) {
        System.out.println(money + "원 출금불가");
       return 0L;
      }
      if(money > balance) {
        System.out.println("잔액부족");
        return 0L;
      }
      
      balance -= money;
      return money;
      
    }
   public void transfer(BankAccount account, long money) {
     
     // 내 통장에서 출금 -> 출금된 금액이 반환 -> 네 통장에 입금
    // long a = withdrawal(money);
     //long b = this.withdrawal(money);
     
     // 네 통장에 입금
     //account.deposit(a);
     account.deposit(withdrawal(money));
   
   
  }
  
  
}
