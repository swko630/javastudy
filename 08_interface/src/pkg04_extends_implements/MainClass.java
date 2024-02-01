package pkg04_extends_implements;

public class MainClass {

  public static void main(String[] args) {

    Domestic domestic = new SeoulTravel();
    domestic.vehicle();
    
    Travel travel = new SeoulTravel();
    travel.sightseeing();
    
    SeoulTravel seoulTravel = new SeoulTravel();
    seoulTravel.vehicle();
    seoulTravel.sightseeing();
    
    
  }

}
