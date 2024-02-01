package practice03_BankAccount;

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
   
  
  
  public void deposit(long money) throws RuntimeException{
    try {
      
      // catch 블록으로 던진다.
      if(money <= 0) {
          
        throw new DepositException(1001);
    }
      balance += money;
        } catch (DepositException e) { // DepositException e : 예외 원인 객체(cause)
          // deposit 메소드 호출한 곳으로 던진다.
          throw new RuntimeException(money + "원 입금불가", e);
        }
      
     
    }
    
    public long withdrawal(long money) throws RuntimeException{
      
      try {
        
        if(money <= 0) {
          throw new WithdrawalException(2001);
        }
        if(money > balance) {
          throw new WithdrawalException(2002);
      } 
        balance -= money;
        
        
      }catch (WithdrawalException e) { // 예외 원인 객체
          
        String message = null;
        switch(e.getErrorCode()) {
        case 2001:
          message = money + "원 출금 불가";
        break;
        case 2002:
          message = "잔액 부족";
          break;
        
      }
        throw new RuntimeException(message, e);
      }
      
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
