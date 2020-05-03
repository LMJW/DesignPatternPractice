package withOutPattern;

public class ForecastDisplay {
  public void Update(double temperature, double humidity, double pressure) {
    System.out.println(
        String.format(
            "forcase temperature : %f\nforcase humidity : %f\nforcast pressure : %f",
            temperature, humidity, pressure));
  }
}
