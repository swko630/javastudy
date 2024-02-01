package practice07_Fighter;

public class Fighter {
  
  private String name;
  private int hp;

  // punch() 메소드 만들기
  public Fighter() {

  }

  public Fighter(String name, int hp) {
    super();
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
  
  public boolean isAlive() {
    return hp> 0;
  }
  
  public void punch(Fighter other, int power) {
    System.out.println(name + "의 펀치");
    if(power >= other.getHp()) {
       other.setHp(0);
    } else {
      other.setHp(other.getHp() - power) ;
      
    }
    System.out.println(name + "의 HP"+ ","+ other.getName()+ "의 HP" + other.getHp());
    
    
  }
  
  
  
  
  
  
  
  
}
