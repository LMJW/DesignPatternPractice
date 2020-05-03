# The strategy pattern

## Official definition
`The Strategy Pattern` defines a family of algorithms, encapsulates each one,
and makes them interchangeable. Strategy lets the algorithm vary independently
from clients that use it.


## Why this pattern?
- Make code easy to adapt the changing requirement
- composition is over inheritance (`HAS-A` is better than `IS-A`)
    - `has-A` means object has a behavior (this is composition)
    - `is-A` means object is a object (this is inheritance)

## Useful example 
- for logging. Normally we want to only log minimum things. But when something
  happens, we want to dynamically change the log level and get more details of
  logging. This pattern can be useful for dynamically change the pattern
