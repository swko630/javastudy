package practice03_Club;

public class MainClass {

  public static void main(String[] args) {

    Club club = new Club();
    
    Person p1 = new Person("1");
    Person p2 = new Person("2");
    Person p3 = new Person("3");
    Person p4 = new Person("4");
    Person p5 = new Person("5");
    
    club.enterClub(new Person("1"));
    club.enterClub(new Person("2"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("3"));
    club.enterClub(new Person("4"));
    club.enterClub(new Person("5"));
    
    club.leaveClub(p1);
    club.leaveClub(p2);
    club.leaveClub(p3);
    club.leaveClub(p3);
    club.leaveClub(p3);
    club.leaveClub(p4);
    club.leaveClub(p5);
    club.leaveClub(new Person("6"));
    club.leaveClub(new Person("6"));
    
    
    club.leaveClub(p1);
    
  }

}
