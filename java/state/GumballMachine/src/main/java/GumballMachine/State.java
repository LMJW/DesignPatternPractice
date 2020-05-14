package GumballMachine;

public interface State {
  public void insertQuarter();

  public void ejectQuater();

  public void turnCrank();

  public void dispense();
}
