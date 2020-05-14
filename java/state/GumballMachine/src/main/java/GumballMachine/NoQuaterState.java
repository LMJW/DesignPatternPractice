package GumballMachine;

public class NoQuaterState implements State {
  GumballMachine machine;

  public NoQuaterState(GumballMachine gumballMachine) {
    machine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You've inserted a quater\n");
    machine.setHasquaterState();
  }

  @Override
  public void ejectQuater() {
    System.out.println("You try to eject a quater, but nothing there\n");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned the crank, nothing came out\n");
  }

  @Override
  public void dispense() {
    System.out.println("Nothing happened\n");
  }
}
