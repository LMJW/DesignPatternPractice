package withOutPattern;

/// What is the drawback for this design?
///
/// This design is not extensible. For example, if I want to add another
/// ingredient, I will need to modify the base class and change the logic in the
/// cost function.

/// One of the design principle is that : code should be close to change, yet
/// open to extension.

/// In this case, whenever I need to extend the functionalities of the code, I
/// will need to change the old code. This is a good sign of using a good
/// design. 
public abstract class Beverage {
  private String description;
  private Boolean milk = false;
  private Boolean soy = false;
  private Boolean mocha = false;
  private Boolean whip =false;

  public void getDescription() {
    System.out.println(description);
  }

  public void setDescription(String des) {
    description = des;
  }

  public boolean hasMilk() {
    return milk;
  }

  public boolean hasSoy() {
    return soy;
  }

  public boolean hasMocha() {
    return mocha;
  }

  public boolean hasWhip() {
    return whip;
  }

  public void setMilk(boolean x) {
    milk = x;
  }

  public void setSoy(boolean x) {
    soy = x;
  }

  public void setMocha(boolean x) {
    mocha = x;
  }

  public void setWhip(boolean x) {
    whip = x;
  }

  public double cost() {
    var ret = 0.0;
    if (milk) {
      ret += 2;
    }
    if (soy) {
      ret += 1;
    }
    if (mocha) {
      ret += 0.5;
    }
    if (whip) {
      ret += 0.3;
    }
    return ret;
  }
}
