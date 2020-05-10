package simpleFactoryPattern;

public class CheesePizza extends Pizza {
  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println(ingredientFactory.createDough());
    System.out.println(ingredientFactory.createSauce());
    System.out.println(ingredientFactory.createCheese());
  }
}
