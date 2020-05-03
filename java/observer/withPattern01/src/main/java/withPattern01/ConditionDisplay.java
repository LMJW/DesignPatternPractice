package withPattern01;

public class ConditionDisplay implements Observer, DisplayElement {
  private double temp;
  private double humi;
  private double pres;

  public void Update(double temperature, double humidity, double pressure) {
    temp = temperature;
    humi = humidity;
    pres = pressure;
    display();
  }

  public void display() {
    System.out.println(
        String.format(
            "current temperature : %f\ncurrent humidity : %f\ncurrent pressure : %f",
            temp, humi, pres));
  }
}
