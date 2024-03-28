Strategy Design Pattern :

It is used to solve the problem where child class don't want to use the implementation of a method inside parent class but want to implement it themselves. And the implementation of some of the siblings class could be same which would in turn voilate DRY principal.

## To solve this problem we create a "strategy interface" and few "concrete classes" that will implement this interface and implement the methods of the interface accordingly.

## Now the parent class could have a obj of this strategy interface and the child classes according to there need to assign this obj to the type of "concrete class" they want to be which would inturn allow them to have there own implementation of certain methods
