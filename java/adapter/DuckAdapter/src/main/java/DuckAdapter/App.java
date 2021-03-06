/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DuckAdapter;

public class App {
  public String getGreeting() {
    return "Hello.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    var turkey = new TurkeyAdapter(new RedHeadDuck());

    turkey.gobble();
    turkey.fly();
  }
}
