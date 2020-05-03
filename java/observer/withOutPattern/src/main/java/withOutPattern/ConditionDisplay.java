package withOutPattern;

public class ConditionDisplay {
  public void Update(double temperature, double humidity, double pressure) {
    System.out.println(
        String.format(
            "current temperature : %f\ncurrent humidity : %f\ncurrent pressure : %f",
            temperature, humidity, pressure));
  }
}
