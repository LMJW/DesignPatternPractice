package simpleFactoryPattern;

public interface IngredientFactory {
  public String createDough();

  public String createSauce();

  public String createCheese();
}
