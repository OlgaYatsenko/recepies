# recepies
Abstract Factory Design Pattern example

## Project Overview
The class provides an instruction to a customer for coffee preparation. 
Execution of the programm:
1) the programm displays the available coffee types; 
2) a cutomer chooses a coffee type and enters the amounts (number of cups);
3) an instruction for coffee preparation is displayed;

##  Technical details and Project Diagram 
There are  two classes (Esspresso aand Latte) and two classes (factories) for their instantiation (EsspressoFactory and LatteFactory). 
CoffeeMachine class interacts with a user (see description above) and instantiates the chosen coffee class with the factory class. 

![alt text](https://github.com/OlgaYatsenko/recepies/blob/master/project_diagram.png)
