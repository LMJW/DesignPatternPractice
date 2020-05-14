package GumballMachine;

public class SoldOutState implements State {
  GumballMachine machine;

  public SoldOutState(GumballMachine gumballMachine) {
    machine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You cannot insert quater\n");
  }

  @Override
  public void ejectQuater() {
    System.out.println("You try to eject a quater, but nothing there\n");
  }

  @Override
  public void turnCrank() {
    System.out.println("You can not turn the crank\n");
    dispense();
  }

  @Override
  public void dispense() {
    System.out.println("Gumbal is running out\n");
  }
}
