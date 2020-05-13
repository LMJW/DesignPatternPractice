package MenuPrint;

import java.util.Iterator;

public class Waitress {
  Menu pancakeHouseMenu;
  Menu dinerMenu;
  Menu cafeMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeIter = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerIter = dinerMenu.createIterator();
    Iterator<MenuItem> cafeIter = cafeMenu.createIterator();
    printMenu(pancakeIter);
    printMenu(dinerIter);
    printMenu(cafeIter);
  }

  private void printMenu(Iterator<MenuItem> iter) {
    while (iter.hasNext()) {
      var item = iter.next();
      System.out.println(item.getName() + " | " + item.getDescription() + " ; " + item.getPrice());
    }
  }
}
