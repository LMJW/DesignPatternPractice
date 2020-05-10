package simpleFactoryPattern;

public class ChicagoStyleCheesePizza extends CheesePizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago style cheese pizza";
    ingredientFactory = new ChicagoIngredientFactory();
  }
}
