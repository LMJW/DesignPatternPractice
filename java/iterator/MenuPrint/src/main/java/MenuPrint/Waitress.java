package MenuPrint;

// import java.util.Iterator;

public class Waitress {
  MenuComponent menuComponent;

  public Waitress(MenuComponent menuComponent) {
    this.menuComponent = menuComponent;
  }

  public void printMenu() {
    menuComponent.print();
  }
}
