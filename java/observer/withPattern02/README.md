# observer pattern

~~Observer pattern can be implemented using the default Java library.~~

Observer pattern has been deprecated in java 9. Thus I will not implement this
pattern using the deprecated library.

## why this library is deprecated?
According to [this](https://bugs.openjdk.java.net/browse/JDK-8154801), it can be
summarized into three points:
- they didn't provide a rich enough event model for applications
    - could support notation that something has changed, but did not convey any
      infomation about what has changed
- `Observable` cannot be serialized because it did not implement `Serializable`
- thread-safty cannot be fixed compatibly

## alternative for Observer Pattern
According to `stackoverflow`, there are two most popular alternatives to the
Observer pattern
- ~~the `PropertyChangeEvent` and `PropertyChangeListener` from `java.beans`~~
  this approach seems more useful for Bean editor, which is a GUI development
  library
- Reactive Streams from Flow API
- for concurrent data structures, we can use the `java.util.concurrent`

## this implementation
In this project, I ~~will use the `java.beans` to implement the Observer
pattern~~ will use the `Flow` API to implement the observer pattern.
