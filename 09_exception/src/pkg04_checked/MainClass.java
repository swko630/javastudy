package pkg04_checked;


import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

  public static void main(String[] args) {

    // checked exception : try - catch 와 같은 예외 처리 코드가 없으면 동작하지 않는 예외이다.
    
    // 클래스 적을 때 패키지 이름을 안적을 수 있는 경우
    // 1. 패키지 안의 클래스일때
    // 2. 패키지가 java.lang일 경우
    try {
    URL url = new URL("https://www.google.com/");
    } catch(MalformedURLException e) {
      System.out.println("잘못된 URL입니다.");
    }
    
  }

}
