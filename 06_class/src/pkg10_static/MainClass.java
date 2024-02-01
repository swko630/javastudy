package pkg10_static;

public class MainClass {

  public static void main(String[] args) {

    // 클래스 멤버 호출 : 클래스.멤버
    
    System.out.println(Calculator.maker);
    
    int num = Integer.parseInt("100");
    System.out.println(num);
    
    Calculator.add(23, 23);
  }

}
