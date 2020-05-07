package withOutPattern;

public abstract class Beverage {
  private String description;

  public void getDescription() {
    System.out.println(description);
  }

  public void setDescription(String des) {
    description = des;
  }

  public abstract double cost();
}
