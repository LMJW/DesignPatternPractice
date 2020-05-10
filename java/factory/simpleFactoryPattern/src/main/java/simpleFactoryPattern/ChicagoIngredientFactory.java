package simpleFactoryPattern;

public class ChicagoIngredientFactory implements IngredientFactory {
  public String createDough() {
    return "Chicago style dough";
  }

  public String createSauce() {
    return "Chicago style sauce";
  }

  public String createCheese() {
    return "Chicago style cheese";
  }
}
