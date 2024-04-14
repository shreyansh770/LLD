When we have to hide system complexity from the client we use **FACADE**


CLIENT ----> FACADE LAYER ---- > COMPLEX SYSTEM

*We should never force client to work with Facade layer they should be independent to work directly with system layer also*

## FDP vs Proxy design pattern

1) Once Facade class can handle *mutiple classes* but one proxy class handles only *1 class* because it also implements the same interface

## FDP vs Adapter design pattern

1) In FDP there is no restriction that weather the client can interact with main class or not but in case of Adapter design pattrn the client is incompatiable of communicating with the main class so an Adapter class acts as an mediator