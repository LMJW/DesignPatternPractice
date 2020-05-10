package simpleFactoryPattern;

/** Make the pizza class to be abstract so all the concrete pizza types can be derived from it. */
public abstract class Pizza {
  String name;
  IngredientFactory ingredientFactory;

  public abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 mins at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza");
  }

  public void box() {
    System.out.println("Place pizza into a box");
  }

  public String getName() {
    return name;
  }
}
