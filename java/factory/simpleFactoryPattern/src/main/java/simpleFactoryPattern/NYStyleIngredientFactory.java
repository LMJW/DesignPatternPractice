package simpleFactoryPattern;

public class NYStyleIngredientFactory implements IngredientFactory {
  public String createDough() {
    return "NY thin crust dough";
  }

  public String createSauce() {
    return "NY special sauce";
  }

  public String createCheese() {
    return "NY cheese";
  }
}
