package withPattern02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.ForkJoinPool;

public class WeatherData implements Publisher<Double> {
  private final ExecutorService executor = ForkJoinPool.commonPool();
  private boolean subscribed;

  public void subscribe(Subscriber<? super Double> subscriber) {
    // if (subscribed){
    //     subscriber.onError(new IllegalStateException());
    // }else{
    //     subscribed = true;
    //     subscriber.onSubscribe(new WeatherDataSubscription(subscriber, executor));
    // }
  }

  /*
  static class WeatherDataSubscription implements Subscription{
      private final Subscriber<? super Double> subscriber;
      private final ExecutorService executor;
      private Future<?> future;
      private boolean completed;

      WeatherDataSubscription(Subscriber<?super Double> subscriber, ExecutorService executor){
          this.subscriber = subscriber;
          this.executor = executor;
      }

      public synchronized void cancel(){
          completed = true;
          if (future != null){
              future.cancel(false);
          }
      }
      public synchronized void request(long n){
          if (n != 0 && !completed){
              completed = true;
              if (n<0){
                  IllegalArgumentException ex = new IllegalArgumentException();
                  executor.execute(()->{subscriber.onError(ex);});
              }else{
                  future = executor.submit(()->{
                      subscriber.onNext(1.0);
                      subscriber.onComplete();
                  });
              };
          }
      }
  } */
}
