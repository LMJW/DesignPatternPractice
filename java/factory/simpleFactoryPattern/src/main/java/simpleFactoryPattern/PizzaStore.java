package simpleFactoryPattern;

public abstract class PizzaStore {

  public Pizza orderPizza(String pizzaType) {

    var pizza = createPizza(pizzaType);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  abstract Pizza createPizza(String PizzaType);
}
