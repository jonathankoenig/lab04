# lab04

All of these questions deal with the ticket machine example bundled in this repo. You should fork this repo and clone the fork to work on the code locally. 

## How can we tell from just its header that `setPrice` is a method and not a constructor?
```
public void setPrice(int cost)
```

The name of the method, setPrice, does not use the same name as the class, TicketMachine.

## Complete the body of the setPrice method so that it assigns the value of its parameter to the price field. Write your new method in the `lab04-ticket-machine`.

## Complete the body of the following method, whose purpose is to add the value of its parameter to a field named `score`.
```
/**
 * Increase score by the given number of points.
 */
public void increase(int points)
{
  score = score + points;
}
```
## Is the `increase` method in the previous question a mutator? If so, how could you demonstrate this?

The increase method is a mutator. Let's say I have an object named "example" where the score is 10. Now I call the increase method for that object and input 5. If I check the state of the object "example", I will see "private int score = 15"

## Complete the following method, whose purpose is to subtract the value of its parameter from a field named `price`. Add your new method to the `lab04-ticket-machine`.
```
/**
 * Reduce price by the given amount.
 */
public void discount(int amount)
{
  price = price - amount;
}
```

## Write down exactly what will be printed by the following statement:
```
System.out.println("My cat has green eyes.");
```

My cat has green eyes.

## Add a method called `prompt` to the `TicketMachine` class in the `lab04-ticket-machine`. This should have a `void` return type and take no parameters. The body of the method should print the following single line of output: 
```
Please insert the correct amount of money.
```

## What do you think would be printed if you altered the fourth statement of `printTicket` so that `price` also has quotes around it, as follows?
```
System.out.println("# " + "price" + " cents.");
```

# price cents.

Without the quotes, it would print out the value of the price field. ex. "# 5 cents"

## What would be printed here?
```
System.out.println("# price cents.");
```

# price cents.

## Could either of the previous two versions be used to show the price of tickets in different ticket machines? Explain your answer.

Neither of them could be used to show the price of the ticket since they both print out the word "price" instead of the field price.

## Add a `showPrice` method to the `TicketMachine` class in the `lab04-ticket-machine`. This should have a void return type and take no parameters. The body of the method should print (here `xyz` should be replaced by the value held in the `price` field when the method is called):
```
The price of a ticket is xyz cents.
```


## Create two ticket machines with differently priced tickets. Do calls to their showPrice methods show the same output, or different? How do you explain this effect?

They have different outputs since the two ticket machines are objects that can hold different values for the price field in their states. When showPrice is called, it checks for the price field of that specific object.

## Modify the constructor of `TicketMachine` in the `lab04-ticket-machine` so that it no longer has a parameter. Instead, the price of tickets should be fixed at 1,000 cents. What effect does this have when you construct ticket-machine objects within BlueJ?

BlueJ no longer asks for an input for the price of a ticket, it only asks you to make a nmae for the ticket machine. When the ticket machine is created, it will always start out with the price being 1000 cents.

## Give the class two constructors. One should take a single parameter that specifies the price, and the other should take no parameter and set the price to be a default value of your choosing. Test your implementation by creating machines via the two different constructors.

## Implement a method, `empty`, that simulates the effect of removing all money from the machine. This method should have a `void` return type, and its body should simply set the `total` field to zero. Does this method need to take any parameters? Test your method by creating a machine, inserting some money, printing some tickets, checking the total, and then emptying the machine. Is the `empty` method a mutator or an accessor?

It doesn't need a parameter since the method will always set the total field to 0. The empty method is a mutator since it changes the value of the price field of an object.