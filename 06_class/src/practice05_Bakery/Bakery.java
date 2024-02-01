package practice05_Bakery;

public class Bakery {

  public final static int Price = 500; // 빵가격
  private int count;                   // 빵의 갯수
  private int money;                   // 돈
  
  // constructor
  public Bakery() {

  }

  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }
   
  // method
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  // 판매 
  // 전달 받는 인자 : 돈, 구매할 빵개수
  // 되돌려 줄 반환 : 잔돈, 구매한 빵개수 -> BreadChange 객체로 반환
  public BreadChange sell(int money, int count) {
    
    // 판매할 빵이 없다.
    if(this.count < count) {
      System.out.println("재고소진");
      return null;
    } 
    
    // 잔돈이 없다.
    if(this.money < money - count * Price) {
      System.out.println("잔돈이 부족합니다");
      return null;
    }
    
    // 고객이 낸 돈이 부족하다.
    if(money < count * Price) {
      System.out.println("금액이 부족합니다");
      return null;
    }
    
    // 판매 처리하기
    this.money += count * Price ;
    this.count -= count;
    
    // 반환 
    return new BreadChange(count, money - count * Price);
    
    
    
  }
  
  
  
  
  
}
