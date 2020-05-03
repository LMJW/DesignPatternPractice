package withPattern01;

public class StatsDisplay implements Observer {
  private double temp = 0;
  private double humi = 0;
  private double pres = 0;
  private int count = 0;

  public void Update(double temperature, double humidity, double pressure) {
    count += 1;
    temp += temperature;
    humi += humidity;
    pres += pressure;
    display();
  }

  public void display() {
    System.out.println(
        String.format(
            "average temperature : %f\naverage humidity : %f\naverage pressure : %f",
            temp / count, humi / count, pres / count));
  }
}
