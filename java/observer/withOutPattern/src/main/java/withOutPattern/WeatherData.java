package withOutPattern;

public class WeatherData {
  public double getTemperature() {
    return Math.random() * 50;
  }

  public double getHumidity() {
    return Math.random() * 50;
  }

  public double getPressure() {
    return Math.random() * 50;
  }

  public void measurementChanged() {
    // implement your code here
    ConditionDisplay condition = new ConditionDisplay();
    StatsDisplay stats = new StatsDisplay();
    ForecastDisplay forecast = new ForecastDisplay();

    double temp = getTemperature();
    double humi = getHumidity();
    double pres = getPressure();
    condition.Update(temp, humi, pres);
    stats.Update(temp, humi, pres);
    forecast.Update(temp, humi, pres);
  }
}
