## Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

## This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

## We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class

# NEED TO DECORATOR PATTERN ?
## To overcome class - explosion : Let' say we have a base class "BASE_CAR" with a single functionality drive now a child class "CHILD1" inherites this "BASE_CAR" and add a functionality 'power wheels' another child class comes "CHILD2" and add 'power brakes' and "CHILD3" now need both 'power wheels' and 'power brakes' but it would have to implement it on it's own coz we can't change "BASE_CAR" coz of open/close principal


in short decorator is also of the base Class