# template pattern

An example of template pattern is when we use the sorting in golang/rust, we can
define the compare functions so we can sort objects. This is basically template
pattern. The steps of sorting is implemented, but we will need the subclass to
implement some method to make the whole algorithm work.

This is the main idea of the template pattern.

In the template pattern, we can also have `hook` method that we can ask the
subclass to implement to make the whole thing work.

```java
abstract class AbstractClass{
  final void templateMethod(){
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
    hook();
  }

  abstract void primitiveOperation1();
  abstract void primitiveOperation2();

  final void concreteOperation(){}

  void hook(){}
}
```