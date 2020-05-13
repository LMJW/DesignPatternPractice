# Adapter pattern

Just similar to wrapper. This could be a simple pattern.

Adapter pattern can be implemented using two ways. One way is the object
adapter, the other is class adapter.

Object adapter is based on the composition whereas the class adapter is based on
multiple inheritance. In JAVA, the class adapter is not possible simply because
JAVA does not support multiple inheritance.

The object adapter implements the target interface and it composes an original
object in it to adapt. (basically a wrapper)


The example here we have is to create an adapter that can convert a duck to
turkey.

```java
public interface Duck{
  public void quark();
  public void fly();
}

public interface Turkey{
  public void gobble();
  public void fly();
}
```