package withOutPattern;

public class StatsDisplay {
  public void Update(double temperature, double humidity, double pressure) {
    System.out.println(
        String.format(
            "average temperature : %f\naverage humidity : %f\naverage pressure : %f",
            temperature / 5, humidity / 5, pressure / 5));
  }
}
