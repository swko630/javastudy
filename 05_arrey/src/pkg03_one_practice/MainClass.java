package pkg03_one_practice;

public class MainClass {
  
  
  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 12;
    String[] seasons = new String[] {"겨울","봄","여름","가을"};
    
    // 코드 한 줄만 추가할 것
    System.out.println(seasons[month % 12 /3]);

        /* month        month % 12     month % 12 / 3
         * 12 ~ 2        0 ~ 2           0
         * 3 ~5          3 ~ 5           1 
         * 6~ 8          6 ~ 8           2
         * 9~ 12         9 ~ 11          3
         */
    
  }
  
  public static void method2() {
    // 4일은 목요일, nDay일 후는 무슨 요일?
    
    int day = 4;
    int nDay = 4;
    String[] weekName = new String[] {"목","금","토","일","월","화","수"};
    
    // day의 nDay일 후 
    day += nDay;
    
    //코드 한줄만 추가할 것
    System.out.println(weekName[nDay % 7]);
    
    
  }

  public static void method3() {
    char[] letters = new char[26]; // 아스키코드 - 스페이스바는 32번, 아라비아 숫자는 48번부터, 영어 대문자는 65부터 소문자 영어는 97번 부터
    
    char ch = 'a';
    for(int i = 0; i < letters.length; i++) {
      letters[i] = ch++;
    }
      for(int i = 0; i < letters.length; i++) {
        System.out.println(letters[i]);
      }
    }
  
  public static void method4() {
    
    
    //배열 a의 마지막 3개 요소를 배열 b의 값으로 수정하시오.
    int[] a = new int[] {10, 20, 30, 0, 0, 0};
    int[] b = new int[] {40, 50, 60};
    
   for(int i = 0; i < b.length; i++) {
     a[i+3] = b[i];
   }
   /*
    * 배열 복사를 위한 자바 표준 API
    * System.arraycopy(b, 0, a, 3, b.length)
    * 1) 복사시작요소     : b[0] 요소를 a[3] 요소로 복사라는 뜻
    * 2) 복사할 요소 개수 : b.length개 만큼 복사
    */
   
   
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
   }
  
  public static void method5() {
    // 10진수를 2진수로 변환하기
    
    // 10진수
    int number = 35;
    
    // 2진수                      
    int[] binary = new int[10];
    
    int i = 0;
    while(number > 0) {
     binary[i++] = number % 2 ;
     number /= 2; //number = number / 2;
    }
    for(int j = i - 1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
    
  }
  
  public static void main(String[] args) {
method5();

  }

}
