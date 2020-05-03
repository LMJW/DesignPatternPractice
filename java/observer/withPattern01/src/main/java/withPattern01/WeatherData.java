package withPattern01;

import java.util.ArrayList;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  public double getTemperature() {
    return Math.random() * 50;
  }

  public double getHumidity() {
    return Math.random() * 50;
  }

  public double getPressure() {
    return Math.random() * 50;
  }

  // implement the Subject interface
  public boolean registerObserver(Observer ob) {
    return observers.add(ob);
  }

  public boolean removeObserver(Observer ob) {
    return observers.remove(ob);
  }

  public boolean notifyObserver(Observer ob) {
    ob.Update(getTemperature(), getHumidity(), getPressure());
    return true;
  }

  public void measurementChanged() {
    // implement your code here
    if (observers.isEmpty()){
      System.out.println("No observer");
    }
    for (Observer o : observers) {
      notifyObserver(o);
    }

    System.out.println("====\n");
  }
}
