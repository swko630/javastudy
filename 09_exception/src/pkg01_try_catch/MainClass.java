package pkg01_try_catch;

public class MainClass {
  
  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    
    String userInput = "12.3";
    int number = Integer.parseInt(userInput);
    System.out.println(number);
  }
  
  
 public static void method2() {
   
   // 예외 처리 : try - catch
   
   try {
     
     String userInput = "12.3";
     
     int number = Integer.parseInt(userInput);
     System.out.println(number);
   } catch(NumberFormatException e) {
     
     System.out.println("정수만 입력하세오");
     
     
   }
     
   
 }

 public static void method3() {
   
   String[] userInputs = {"10", "20","1.5","2.5", "30"};
   
     for(int i = 0; i < userInputs.length; i++) {
       
       try {
         
         int number = Integer.parseInt(userInputs[i]);
         System.out.println(number);
         
       } catch(NumberFormatException e) {
         System.out.println(userInputs[i] + "정수가 아닙니다.");
         
       }
     }
   }
   
 public static void method4() {
   
   // 다중 catch 블록 : 상속 관계를 이해하고 쓸 것
    // 캐치 블록의 순서는 상속 관계에 따라 자식 캐치블록을 먼저 쓴다.
   
   String[] userInputs = {"10", "20", "15","25", "30"};
   
   try {
     
     for(int i = 0; i < 6; i++) {
       
       int number = Integer.parseInt(userInputs[i]);
       System.out.println(number);
       
     }
       
   } catch(ArrayIndexOutOfBoundsException e) {
     System.out.println("사용할 수 없는 인덱스가 사용되었습니다.");
   }
   catch(RuntimeException e) {
     System.out.println("정수만 처리할 수 있습니다.");
   }
   
   
   
 }
 
 
 
  public static void main(String[] args) {

    method4();
    
  }

}
