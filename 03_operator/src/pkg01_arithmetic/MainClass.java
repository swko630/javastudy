package pkg01_arithmetic;

public class MainClass {

  public static void main(String[] args) {

    
    
 // 산술 연산
    int a = 5;
    int b = 2;
    System.out.println(a + b); // 덧셈
    System.out.println(a - b); // 뺄셈
    System.out.println(a * b); // 곱셈
    System.out.println(a / b); // 나눈 몫
    System.out.println(a % b); // 나누고 나온 나머지
    
    // 5 나누기 2의 연산결과는 2.5가 아닌가?
    // casting을 이용하면 원하는 결과를 얻을 수 있다.
    System.out.println((double)a / b); // 실수의 경우 /연산자는 나누기 결과 자체를 반환한다.
    
    // 증감(증가, 감소) 연산
    int x = 10;
    System.out.println(x++); // x를 사용한다. x를 1증가시킨다. 후위 연산
    System.out.println(x);   
    
    int y = 10;
    System.out.println(++y); // y를 1증가 시킨다. y를 사용한다. 전위 연산
    System.out.println(y);
    
    int z = 10;
    System.out.println(z--); // z를 사용한다. z를 1 감소시킨다. 후위 연산
    System.out.println(z);
    
    int j = 10;
    System.out.println(--j); // j를 1 감소시킨다 j를 사용한다. 전위 연산
    System.out.println(j);
    
    
    
    
    
    
    
  }

}
