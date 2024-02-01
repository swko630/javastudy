package pkg01_object;

public class MainClass {

  public static void main(String[] args) {

    // 객체 선언
    Calculator calculator; // 객체 이름 = 클래스 이름 첫 소문자
    // 객체 생성
    calculator = new Calculator();
    
    // 클래스 멤버(필드와 메소드)를 사용하기 위해서 기본적으로는 객체가 필요하다.
    // 객체.멤버
    
    calculator.number = 100;
    System.out.println(calculator.number);
    calculator.method();
  }

}
