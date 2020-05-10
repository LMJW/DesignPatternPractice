package simpleFactoryPattern;

import java.util.ArrayList;

/** Make the pizza class to be abstract so all the concrete pizza types can be derived from it. */
public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings...");
    for (String topping : toppings) {
      System.out.println(String.format("    %s", topping));
    }
  }

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
