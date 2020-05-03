package withPattern01;

public interface Subject {
  boolean registerObserver(Observer ob);

  boolean removeObserver(Observer ob);

  boolean notifyObserver(Observer ob);
}
