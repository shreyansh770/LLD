Builder Design Pattern is a creational design pattern

# Problem statement 

  When we a lot of **optional fields** for a particular class. Ex  Student class has various properties like Name , Age , Father Name , Mother Name and some of these can be optional so we would have to create *contructor* for different cases.

Builder design pattern states that we need to break down the process of building a object into various steps. For example When building a house we can break it down into various steps :
1) Build Wall
2) Build roof
3) Build windows
4) Build Door...

## Builder Design Pattern vs Decorator Design Pattern

  1) BDP is creation design pattern and DDP is structural design pattern

  2) BDP cannot handle dyanamic classes out of no where for example if we create a pizza + cheeze and now we need pizza+mushroom we would need to create a builder for it but in DDP this dynamic classes could be handled easily
