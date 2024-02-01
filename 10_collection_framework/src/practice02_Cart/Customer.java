package practice02_Cart;

public class Customer {
  
  // field
  private int money;
  private Cart cart;
  
  // constructor
  
  public Customer() {

  }

  public Customer(int money) {
    super();
    this.money = money;
    
  }
  
  // method

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  // 물건 넣기
  public void addToCart(Product product) throws RuntimeException {
    cart.addProduct(product);
    
  }
  // 물건 바꾸기
  public void changeCart(int idx, Product product) throws RuntimeException {
    cart.changeProduct(idx, product);
    
  }
  // 물건 뺴기
  public void removeCart(int idx) throws RuntimeException {
    cart.removeProduct(idx);
  }
  // 구매  
  // 반환 : 영수증 
  
  public String buy() throws RuntimeException {
    String receipt = "영수증\n";
    int total = 0;
    
    for(int i = 0, count = cart.getProducts().size(); i < count ; i++) { // 초기화문에 count를 따로 선언한 이유 : cart.getCount()는 호출되는 값은 상수이기 때문에 반복되지 않는 초기화문에 상술한다. 
      
      // cart 에서 뺀 물건 1개
      Product product = cart.getProducts().get(i);
      
      // 총 구매액 계산
      total += product.getPrice();
      
      // 구매 가능 여부 체크
      if(money < total) {
     
      throw new RuntimeException("금액이 부족하여 구매할 수 없습니다.");
      } 
          
      // 영수증 만들기
      receipt += product.getName();
      receipt += "......";
      receipt += product.getPrice();
      receipt += "\n";
      
     
          
    }
    
    // 구매
    money -= total ;
    
    // 영수증 만들기 추가
    receipt += "총 구매액....."+ total + "입니다.\n";
    
    
    return receipt;
  }

}
