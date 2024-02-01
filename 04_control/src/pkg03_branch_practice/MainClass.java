package pkg03_branch_practice;

public class MainClass {
  
  public static void method1() {
    
    
   // 월에 따른 계절 출력하기
    int month = 1;
    if (month <= 2) {
      System.out.println("겨울");
    } else if (month <= 5) {
      System.out.println("봄");
    } else if (month <= 9) {
      System.out.println("여름");
    } else if (month <= 12) {
      System.out.println("가을");
    } else System.out.println("잘못된 숫자");
      
  }
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60; // 점수
    int grade = 1;  // 학년
    if (grade < 4) {
    String result = score >= 70 ? "합격" : "불합격";
  } else if (grade >= 4) {
     String result = score >= 60 ? "합격" : "불합격";
  } else 
    System.out.println("잘못된 입력");    
  }
  
  
  
  
public static void method3() {
    
    // 4일은 목요일, n일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    int weekName = nDay % 7 ;  // 요일 (월~일)
    if (weekName == 0) {
      System.out.println("목요일");
    } else if (weekName == 1) {
      System.out.println("금요일");
    } else if (weekName == 2) {
      System.out.println("토요일");
    } else if (weekName == 3) {
      System.out.println("일요일");
   } else if (weekName == 4) {
      System.out.println("월요일");
   } else if (weekName == 5) {
      System.out.println("화요일");
   } else if (weekName == 6) {
      System.out.println("수요일");
 } 
       
  }
  
public static void method4() {
  int score = 99;
  int grade = 4;
  int pass = 0;
  if(grade >= 1 && grade <= 3) {
    pass = 60;
  } else if(grade >= 4 && grade <= 6) {
    pass = 70;
  }
  //합격/불합격
  String result = null; // 자바에서 null값은 참조값의 기본값으로 초기화
  if(score >= pass) {
    result = "합격";
  } else {
    result = "불합격" ;
  }
  System.out.println(result);
  
  
}
  
public static void method5() {
  
  // 메뉴에 따른 가격
  // 아메리카노 : 1000
  // 카페라떼   : 2000
  // 밀크티     : 3000
  // 기타       : 5000
   String order = "밀크티";
   int price = 0;
   switch(order) {
   case "아메리카노":
     System.out.println("1000");
     break ;
   case "카페라떼":
     System.out.println("2000");
     break ;
   case "밀크티":
     System.out.println("3000");
     break ;
   case "기타":
     System.out.println("5000");
     break ;
   default :
   System.out.println("잘못된 요청");
   }
  
  
  
  
}

 public static void main(String[] args) {
    // TODO Auto-generated method stub
 method5();

   
  }

}
