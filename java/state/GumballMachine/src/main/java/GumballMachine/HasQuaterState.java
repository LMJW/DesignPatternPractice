package GumballMachine;

public class HasQuaterState implements State {
  GumballMachine machine;

  public HasQuaterState(GumballMachine gumballMachine) {
    machine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You cannot insert another quater\n");
  }

  @Override
  public void ejectQuater() {
    System.out.println("You ejected a quater\n");
    machine.setNoquaterState();
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned the crank\n");
    if (machine.hasGumbals()) {
      machine.setSoldState();
    } else {
      System.out.println("Gumball is sold out. You ejected the quater\n");
      machine.setSoldOutState();
    }
  }

  @Override
  public void dispense() {
    System.out.println("Can not dispense. You need to turn crank to lock in the deal\n");
  }
}
