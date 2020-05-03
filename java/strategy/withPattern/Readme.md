# With strategy pattern

This directory implments the duck app using the strategy pattern.

## Summary of implementation

The behavior of `duck` is taken out as an interface. In the `abstract` class
`duck`, contains two object instance that implements the interface behaviors.
The `duck` class has two methods that calls into the instance's method. The
object instance of behavior is initialized in the class constructor.

The strategy pattern also allows us to dynamically changes the behavior of the
class by changing the behavior instance.