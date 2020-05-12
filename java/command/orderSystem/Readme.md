# command pattern

This is a simple implementation of the command pattern using the example of
customer making order in a resturant.

In this example, `Waiter` is receiver and `Customer` is the one which creates
the command(`order`). Customer knows what he wants, such as burger or pizza and
he will create order based on what he wants. `Waiter` will then take the order,
and call `orderUp`. The `Cook` will cook order base on the order type.

> I feel like this example is not a good example to explain the command pattern.
> In general, the customer will not need to know which cook he is asking for.
> But the command pattern will require the command object to have information
> about who's doing the job. In reality, waiter will pass order to the cook and
> cook will do the cooking. In this example, waiter just invoke the cook method
> on the order object and order object contains the information of which cook is
> going to cook the food.
>
> To me, this example is not really good example for command pattern.