/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MenuPrint;

public class App {
  public String getGreeting() {
    return "Hello menu print.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    var pancakeHouseMenu = new PancakeHouseMenu();
    var dinerMenu = new DinerMenu();
    var cafeMenu = new CafeMenu();
    var allMenu = new AllMenus("All Menus", "all the menus are here");
    allMenu.add(pancakeHouseMenu);
    allMenu.add(cafeMenu);
    cafeMenu.add(dinerMenu);
    var waitress = new Waitress(allMenu);

    waitress.printMenu();
  }
}
