// package java.strategy.withOutPattern.src.test.java.withOutPattern;
package withOutPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuckTest {
  @Test
  public void testDuckCanQuark() {
    Duck testDuck = new Duck();
    assertNotNull("duck should quark", testDuck.quack());
  }

  @Test
  public void testDuckCanSwim() {
    Duck testDuck = new Duck();
    assertNotNull("duck should quark", testDuck.swim());
  }

  @Test
  public void testDuckCanDisplay() {
    Duck testDuck = new Duck();
    assertNotNull("duck should quark", testDuck.display());
  }

  @Test
  public void testMallardDuckDisplay() {
    Duck testDuck = new MallardDuck();
    assertEquals("I am a mallard duck", testDuck.display());
  }

  @Test
  public void testRedHeadDuckDisplay() {
    Duck testDuck = new RedHeadDuck();
    assertEquals("I am a red head duck", testDuck.display());
  }
}
