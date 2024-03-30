## Factory Method Design 
Pattern define an interface for creating an object, but let subclass decide which class to instantiate. Factory Method lets a class defer instantiation to subclass.

## Abstract Factory Method Design 

It is Factory of Factories 
Ex :  we have interface for Vehicle which can be 2-weehler or 4-weehler
      now we will have a Abstract factory which will have return the Object for weather the input is for 2/4 weehlers
      and than this obj we will call or normal factory with some other input which would return obj for specified type of 2/4 weehlers