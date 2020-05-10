package simpleFactoryPattern;

public class SimplePizzaFactory {
  public static Pizza createPizza(String pizzaType) {
    Pizza pizza;
    if (pizzaType.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (pizzaType.equals("greek")) {
      pizza = new GreekPizza();
    } else {
      pizza = new Pepperoni();
    }
    return pizza;
  }
}
