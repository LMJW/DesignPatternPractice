package withPattern02;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class ConditionDisplay implements Subscriber<Double> {
  public void onComplete() {}

  public void onError(Throwable throwable) {}

  public void onNext(Double item) {
    System.out.println(item);
  }

  public void onSubscribe(Subscription subscription) {
    System.out.println("condition display on subscribe");
  }
}
