package simpleFactoryPattern;

public class NYStyleCheesePizza extends CheesePizza {
  public NYStyleCheesePizza() {
    name = "NY style cheese pizza";
    ingredientFactory = new NYStyleIngredientFactory();
  }
}
