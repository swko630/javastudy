package practice04_Car;

public class Car {
  
  // field
  private Driver driver;
  private int currspeed;
  private int fuel;
  public final static int Max_speed = 100; // static은 클래스로 호출
                                           // Car.Max_speed로 호출
  
  // constructor
  public Car() {
    
  }

  public Car(Driver driver, int fuel, int currspeed ) {
    super();
    this.driver = driver;
    this.currspeed = currspeed;
    this.fuel = fuel;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrspeed() {
    return currspeed;
  }

  public void setCurrspeed(int currspeed) {
    this.currspeed = currspeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  
 public void engineStart() {
   if(driver == null || fuel == 0) {
     System.out.println("시동 실패");
     } else {
       System.out.println("시동 성공");
     }
   
 }
 // 1초당 n씩 속도가 증가하는 accelerator(bestDriver는 10, 아니면 5)
 // 1초당  1씩 연료가 줄어드는 accelerator
 public void accelerator(int pushTime) {
   
   if(currspeed == Max_speed) {
     System.out.println("이미 최고 속도입니다.");
     return;
   } 
   if(fuel == 0){
     System.out.println("연료가 없습니다");
     return;
   }
   if(pushTime <= 0) {
   System.out.println("가속하고 있지 않습니다");     
   return;
   }
   
   int n = driver.isBestDriver() ? 10 : 5 ;
   currspeed += (n * pushTime);
  /* if(currspeed > Max_speed) {
     currspeed = Max_speed; */
   
    fuel -= pushTime;
    fuel = Math.min(fuel, 0);
    
    System.out.println("현재 연료량 : " + fuel + "현재 속도 : " + currspeed);
 }
 
 // 1초당 10씩 속도가 줄어드는 brake
 public void brake(int pushTime) {
   if(currspeed == 0) {
     System.out.println("이미 정지상태입니다");
     return;
   }
   if(pushTime <= 0) {
     System.out.println("brake를 잘 밟으세요");
     return;
   }
   currspeed -= pushTime * 10;
   currspeed = Math.max(currspeed, 0);
       
   System.out.println("현재 연료량 : " + fuel + "현재 속도 : " + currspeed);
 }
  

}
