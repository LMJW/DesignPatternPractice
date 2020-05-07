package withOutPattern;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    setDescription("very good Dark roast beans");
  }

  /// The cost computation will be depend on different coffee with different
  /// ingredient. So, if I have many different types of coffee, I will need to
  /// implement each differently because I am using an interface for cost().
  ///
  /// Imaging I have 100 types of coffee. I will need to implement 100 methods
  /// for computing the cost for each coffee.
  public double cost() {
    return 4;
  }
}
