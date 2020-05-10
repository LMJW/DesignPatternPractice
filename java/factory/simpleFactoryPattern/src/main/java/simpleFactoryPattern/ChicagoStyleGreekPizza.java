package simpleFactoryPattern;

public class ChicagoStyleGreekPizza extends GreekPizza {
  public ChicagoStyleGreekPizza() {
    name = "Chicago style greek pizza";
    ingredientFactory = new ChicagoIngredientFactory();
  }
}
