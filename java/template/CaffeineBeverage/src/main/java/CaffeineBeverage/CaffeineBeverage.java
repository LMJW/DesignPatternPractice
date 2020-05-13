package CaffeineBeverage;

public abstract class CaffeineBeverage {
  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiment();
  }

  public void boilWater() {
    System.out.println("Boiling water...");
  }

  public void pourInCup() {
    System.out.println("Pouring the beverage in the cup...");
  }

  public abstract void brew();

  public abstract void addCondiment();
}
