package practice04_Car;

public class MainClass {

  public static void main(String[] args) {

    Driver driver = new Driver("elsa", 10); // 잘못된 데이터를 전달할 수 있다.

    Driver driver2 = new Driver();
    driver2.setName("elsa");
    driver2.setCareer(20);
    driver2.isBestDriver();
    
    Car car = new Car(driver2, 100, 0);
    car.engineStart();
    car.accelerator(5);
    car.brake(5);
    

    
  }
 
}
