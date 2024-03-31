The Chain of Responsibility design pattern is a behavioral design pattern that allows an object to pass a request along a chain of handlers. Each handler in the chain decides either to process the request or to pass it along the chain to the next handler

This design pattern states that when sender send a request it could be full filled by any recevier

Sender => R1 (x) -> R2 (x) -> R3 (Y)

R3 has fullfilled the request and send backs the response

Ex ATM :

Sender(Rs 2000) => R1 (2000 note handler) (x) -> R2 (500 note handler)(3)(1500) -> R3 (100 note handler)(5)(500) 

In the case of ATM we can see that different handler fullfilled different part of the request and generated the final reponse

## Application
   1) ATM
   2) Wending machine
   3) Logger (asked in Amazon)