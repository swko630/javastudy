package pkg09_access_modifier;

public class MainClass {

  public static void main(String[] args) {

    // computer 객체 선언 및 생성
    Computer computer = new Computer("galaxybook", 400, new Calculator());
    
   //System.out.println(computer.model); // 직접 접근은 불가능
                                         // 간접 접근은 가능
    
    // 필드로 값을 전달하는 메소드
    computer.setModel("gram");
    computer.setPrice(200);
    computer.setCalculator(new Calculator());
    
    
    // 필드값을 가져오는 메소드
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
   computer.getCalculator().add();
  }

}
