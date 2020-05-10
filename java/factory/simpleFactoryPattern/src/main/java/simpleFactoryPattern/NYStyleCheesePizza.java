package simpleFactoryPattern;

public class NYStyleCheesePizza extends CheesePizza {
  public NYStyleCheesePizza() {
    name = "NY style cheese pizza";
    dough = "Thin crust dough";
    sauce = "Marinara Sause";

    toppings.add("Grated Reggiano Cheese");
  }
}
