package pkg03_unchecked;

public class MainClass {

  public static void main(String[] args) {

    // unchecked exception : try - catch 문이 없어도 동작하는 예외 클래스로 RuntimeException을 의미한다. -> 실행하기전까진 발생 여부 모름
    
    int mok = 5 / 0;
    System.out.println(mok);
    
  }

}
