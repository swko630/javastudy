package pkg06_practice;

public class MainClass {

  public static void method1()
  {
    int second = 90 ;
    int m = second / 60; // 1  분
    int s = second % 60;  // 30 초
    System.out.println(m);
    System.out.println(s);
  }
//x와 y의 값을 교환하기
  public static void method2() { 
  int x = 10;
  int y = 20;
  int temp = y - x ;
  x = temp + x;
  y = temp ;
  
    System.out.println(x); // 20
    System.out.println(y); // 10
  }
  
  public static void method3() { 
    // 점수가 90점대이면 true 아니면 false
    
   int score = 90;
   String result = score >= 90 ? "true" : "false";
    System.out.println(result);
    
    
  }
  public static void method4() {
    
    // 짝수/홀수 판단
    // 짝수 : 2로 나눈 나머지가 0인 수
    // 홀수 : 2로 나눈 나머지가 1인 수
    
    int n = 0;
    int result = n % 2 ;  
    String z = result == 1 ? "홀수" :"짝수"; 
    System.out.println(z);
    
  }

  
  public static void main(String[] args) {
  
    
    method1();
    method2();
    method3();
    method4();
    
    
  }

}
