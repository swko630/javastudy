package pkg07_polymorphism;

public class Person {

  public void powerOn(Elec elec) { // Elec elec = new Tv() 또는 Elec elec = new Radio()
    /*
     * 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자제품이 추가될때 마다 코드의 추가가 필요하므로 추천X
     * 
     * if(elec instanceof Tv) {
     * ((Tv) elec).powerOn();
     * }
     * else if(elec instanceof Radio) {
     * ((Radio) elec).powerOn();
     * }
     */
    
    
    /*
     * 2. Elec 에 powerOn() 메소드를 추가하고 Tv 나 Radio 가 오버라이드 하기
     * 
     */
    
    elec.powerOn(); // 다형성 : 하나의 코드로 여러가지를 실행한다.
                    // 구현 : 업캐스팅 후 오버라이딩   
    
    
    
    
  }
  
}
