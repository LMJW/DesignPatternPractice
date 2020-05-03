package withOutPattern;

public class Duck {
  String quack() {
    return "duck can quack";
  }

  String swim() {
    return "duck can swim";
  }

  String display() {
    return "a pretty duck";
  }

  /// the problem with modifying the base class is that all the subclasses will
  /// get additional property which might change the behavior of the children
  /// classes. Therefore, this is not a good pattern for some use cases.

  /// Maybe only use this pattern if we actually want to change all the
  /// behaviors of the subclasses.
  String fly() {
    return "i can fly";
  }
}
