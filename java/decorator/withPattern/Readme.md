# Decorator pattern

## Why decorator pattern

If we do not use decorator pattern, we may ends up using inheritance. Say we
have base class `Beverage` and we want to implment the base class method so we
can calculate the end price. But, it is usually difficult to know all the
possible cases that we might use in the future. If we take this apporoach, we
will need to change the base class whenever we add some new recipt or change
some price. This can be hard to maintain in the long run. 