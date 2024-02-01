package pkg05_marker_interface;

public class MainClass {

  public static void main(String[] args) {

    Person person = new Person();
    person.eat(new AppleMango());
    person.eat(new Durian());
    person.eat(new PineApple());

  DurianHatePerson durianHatePerson = new DurianHatePerson();
  durianHatePerson.eat(new AppleMango());
  durianHatePerson.eat(new PineApple());
  // durianHatePerson.eat(new Durian());
 
  
  
  
  }
  

}
