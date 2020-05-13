package MenuPrint;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void printMenu() {
    Iterator pancakeIter = pancakeHouseMenu.createIterator();
    Iterator dinerIter = dinerMenu.createIterator();
    printMenu(pancakeIter);
    printMenu(dinerIter);
  }

  private void printMenu(Iterator iter) {
    while (iter.hasNext()) {
      var item = (MenuItem) iter.next();
      System.out.println(item.getName() + " | " + item.getDescription() + " ; " + item.getPrice());
    }
  }
}
