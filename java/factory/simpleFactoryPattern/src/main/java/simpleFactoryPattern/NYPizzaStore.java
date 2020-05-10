package simpleFactoryPattern;

public class NYPizzaStore extends PizzaStore {
  /** Implement the abstract method */
  public Pizza createPizza(String pizzaType) {
    Pizza pizza;
    if (pizzaType.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else if (pizzaType.equals("greek")) {
      pizza = new NYStyleGreekPizza();
    } else {
      pizza = new NYStylePepperoni();
    }
    return pizza;
  }
}
