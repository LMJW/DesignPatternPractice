package GumballMachine;

public class GumballMachine implements State {
  final State noquater = new NoQuaterState(this);
  final State hasquater = new HasQuaterState(this);
  final State sold = new SoldState(this);
  final State soldout = new SoldOutState(this);

  State state;
  int gumbals;

  public GumballMachine(int gumbals) {
    state = noquater;
    this.gumbals = gumbals;
  }

  public boolean hasGumbals() {
    return gumbals > 0;
  }

  public void releaseGumbal() {
    gumbals -= 1;
  }

  public void setNoquaterState() {
    System.out.println("Set to no quater state\n");
    this.state = noquater;
  }

  public void setHasquaterState() {
    System.out.println("Set to has quater state\n");
    this.state = hasquater;
  }

  public void setSoldState() {
    System.out.println("Set to sold state\n");
    this.state = sold;
  }

  public void setSoldOutState() {
    System.out.println("Set to soldout state\n");
    this.state = soldout;
  }

  @Override
  public void insertQuarter() {
    state.insertQuarter();
  }

  @Override
  public void ejectQuater() {
    state.ejectQuater();
  }

  @Override
  public void turnCrank() {
    state.turnCrank();
  }

  @Override
  public void dispense() {
    state.dispense();
  }
}
