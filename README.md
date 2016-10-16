Berlin Clock assignment
=========================

To build this project use

    ``mvn install`` or ``mvn package``


To run the application and get an output do:

If you've packaged to the ``target`` folder:

``java -jar target/berlin-clock.jar -h <<hour>> -m <<minutes>> -s <<s>>``

Otherwise run the jar with the accepted parameters

``java -jar berlin-clock.jar -h <<hour>> -m <<minutes>> -s <<s>>``

Input params

```
-h hour in integer format between 0 and 23 inclusive
-m minutes in integer format between 0 and 59 inclusive
-s seconds in integer format between 0 and 59 inclusive
```
