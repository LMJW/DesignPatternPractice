package simpleFactoryPattern;

public abstract class PizzaStore {

  /**
   * In this class, we get rid of the SimplePizzaFactory as we may have many different factories for
   * different region of pizza. For example, we may have New York factory or Chicago factory.
   *
   * <p>We want the PizzaStore class will be able to handle the different factories.
   *
   * <p>We can also have concrete PizzaStore extends the abstract class and choose to have different
   * pizza factories.
   */
  public Pizza orderPizza(String pizzaType) {

    var pizza = createPizza(pizzaType);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  /**
   * Sub class will need to implement how they want to createPizza while maintain the function
   * signatures.
   */
  protected abstract Pizza createPizza(String PizzaType);
}
