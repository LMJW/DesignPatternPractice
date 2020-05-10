package simpleFactoryPattern;

public class GreekPizza extends Pizza {
  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println(ingredientFactory.createDough());
    System.out.println(ingredientFactory.createSauce());
    System.out.println(ingredientFactory.createCheese());
  }
}
