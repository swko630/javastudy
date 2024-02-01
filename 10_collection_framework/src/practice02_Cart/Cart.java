package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
  // field
  private List<Product> products;          // 카드에 담은 물건들
  
  // constructor
  public Cart(int cartSize) {
    products = new ArrayList<Product>(cartSize);
  }

  // method
 
  
  
  // 물건 담기
  public void addProduct(Product product) throws RuntimeException {
    
    
  }
  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {
    
    // 카트가 비어 있는 경우
    if(products.size() == 0) {
      throw new RuntimeException("카트가 비었습니다.");
    }
    
    // 바꿀 물건이 없는 경우
    if(product == null) {
      throw new RuntimeException("바꿀 물건이 없습니다.");
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.size()) {
      throw new RuntimeException("물건번호가 잘못되었습니다.");
    
    }
    
    products.set(idx, product);
    
    
    
  }
  int size = products.size();
  
  // 물건 빼기
  public void removeProduct(int idx) {
    // 카트가 비어있는 경우
    if(size == 0) {
     throw new RuntimeException("뺄 물건이 없습니다.");     
    
    }
    
    if(idx < 0 || idx >= size) {
     throw new RuntimeException("물건번호가 잘못되었습니다.");
    }
  
    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx 복사할 요소의 개수 (count - idx - 1)
     * 0           4
     * 1           3
     * 2           2
     * 3           1
     * 4           0
     */
    System.arraycopy(products, idx + 1, products, idx, size - idx - 1);
    size-- ;        // 원래 칸수    /  앞으로 한칸 복사/ 복사할 개수   
  
  }

}
