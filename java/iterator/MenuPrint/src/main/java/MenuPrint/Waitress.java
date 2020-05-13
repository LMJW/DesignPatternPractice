package MenuPrint;

import java.util.Iterator;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeIter = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerIter = dinerMenu.createIterator();
    printMenu(pancakeIter);
    printMenu(dinerIter);
  }

  private void printMenu(Iterator<MenuItem> iter) {
    while (iter.hasNext()) {
      var item = iter.next();
      System.out.println(item.getName() + " | " + item.getDescription() + " ; " + item.getPrice());
    }
  }
}
