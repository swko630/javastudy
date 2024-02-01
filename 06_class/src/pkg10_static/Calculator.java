package pkg10_static;
/*
 *메모리 공간 할당 과정
 * 클래스 영역(메소드 영역) - > 스택 영역 -> 힙 영역
 * 클래스 로드                   변수         배열, 인스턴스
 * 
 * 클래스 멤버
 * 1. 클래스 영역에 저장되는 멤버이다.
 * 2. 인스턴스의 생성 없어도 접근이 가능하다.
 * 3. 클래스 메소드에서는 클래스 멤버만 호출할 수 있다. (인스턴스 멤버는 호출할 수 없다.) => 없으니까
 * 4. 호출 방법
 *    1) 클래스.멤버 -> 추천
 *    2) 인스턴스.멤버 - 가능하지만 비추천 (인스턴스에서 클래스 호출이므로 가능)
 *      static -> class member
 *      static은 클래스.멤버로 호출
 *      ex)   class.field
 *        class.method()
 *        
 * 
 * instance = 메모리를 할당받은 object(객체)
 * 
 *  class member      1
 *  
 *  instance(object)  m
 *  
 *  
 *  
 */
public class Calculator {
  
  // 상수
  public final static String maker = "samsung";
  
  // 클래스 메소드
  public static void add(int a, int b) {
    System.out.println(a + "+" + b + "=" + (a+b));
  }
  
}
