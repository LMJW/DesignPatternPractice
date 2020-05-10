package simpleFactoryPattern;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago style cheese pizza";
    dough = "Thick crust dough";
    sauce = "BBQ Sause";

    toppings.add("Normal Cheese");
  }
}
