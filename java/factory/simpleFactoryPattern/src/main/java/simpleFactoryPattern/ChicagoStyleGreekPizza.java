package simpleFactoryPattern;

public class ChicagoStyleGreekPizza extends Pizza {
  public ChicagoStyleGreekPizza() {
    name = "Chicago style greek pizza";
    dough = "Thick crust dough";
    sauce = "BBQ Sause";

    toppings.add("Greek Goat Cheese");
  }
}
