package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {

    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).call();
    
    Computer computer = new SmartPhone();
    computer.powerOn();
    ((SmartPhone) computer).powerOn();
    computer.game();
    ((SmartPhone) computer).game();
    
    System.out.println();
    Phone phone = new SmartPhone();
    phone.call();
    
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.call();
    smartPhone.game();
    smartPhone.powerOn();
        
    
        
    
    
  }

}
