package simpleFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
  protected Pizza createPizza(String pizzaType) {
    Pizza pizza;
    if (pizzaType.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else {
      pizza = new ChicagoStyleGreekPizza();
    }
    return pizza;
  }
}
