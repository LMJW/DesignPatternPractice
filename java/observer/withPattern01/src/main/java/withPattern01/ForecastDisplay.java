package withPattern01;

public class ForecastDisplay implements Observer, DisplayElement {
  private double temp;
  private double humi;
  private double pres;

  public void Update(double temperature, double humidity, double pressure) {
    temp = temperature - 3;
    humi = humidity + 5;
    pres = pressure - 10;
    display();
  }

  public void display() {
    System.out.println(
        String.format(
            "forcase temperature : %f\nforcase humidity : %f\nforcast pressure : %f",
            temp, humi, pres));
  }
}
