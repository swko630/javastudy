package practice03_Club;

import java.util.Set;

public class Club {


  private Set<Person> pool;
  
  public void enterClub(Person person) {
    pool.add(person);
    
  }

  public void leaveClub(Person person) {
    pool.remove(person);
    
  }
  
  public void pooList() {
    for(Person person : pool) {
      System.out.println(person);
    }
  }
  
  
}
