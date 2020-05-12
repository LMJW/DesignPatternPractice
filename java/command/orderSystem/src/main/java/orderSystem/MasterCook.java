package orderSystem;

// MasterCook only knows how to cook hamburger
public class MasterCook implements Cook {
  private void cookHamburger() {
    System.out.println("cook master hamburger");
  }

  public void cook() {
    cookHamburger();
  }
}
