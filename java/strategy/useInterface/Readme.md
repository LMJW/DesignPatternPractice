# use interface in java

A different approach is using the `interface` in java.

This is just a implementation for this approach.

## Why this approach is not a very good one

As we can see, in the `interface`, we cannot have any implementations, which
means we will have to reimplement the methods for all the classes that
implements that interface. In this use cases, a lot of the implementation are
same, which means we will need to have duplicated implementation.

This means every time we changes the interface, we will need to change all the
subclasses that implements the interface. Future more, it means we will need to
copy paste code, which in general is not good.