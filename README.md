## Context
- Design Patterns
- S.O.L.D Princples
- OOP Four Principles

# Design Patterns

## Creational Patterns

Creational patterns handle how objects are created.
The purpose of creational patterns is to isolate a system from having any knowledge of how objects are created.
This goes back to Object-Oriented-Programming principles, in particularly encapsulation and abstraction.

There are currently five creational patterns.
- Builder
- Factory Method
- Abstract Factory
- Singleton
- Prototype

## Behavorial Patterns

Behavioral patterns handle how objects interact. That interaction involves communication with one another,
 dependencies on one another, isolation from each other to be flexible, maintainable and testable.
 
 There are currently eleven behavioral patterns
 
 - Template Method
 - Chain of Responsibility
 - Command
 - Strategy
 - Iterator
 - Visitor
 - Mediator
 - Memento
 - Observer
 - Interpreter
 - State
 
## Structural Patterns

Structural Design Patterns are Design Patterns that ease the design by identifying a simple way to realize relationships between entities.

There are currently seven structural patterns.
- Flyweight
- Composite
- Adapter
- Bridge
- Facade
- Decorator
- Proxy

# S.O.L.I.D Principles
S.O.L.I.D is an acronym used in software engineering that describes a set of principles of object-oriented design.
 When a system is implementing by using these principles, the codebase is understandable, reusable, testable, maintainable and flexible.
 The concept originated from Robert C. Martin. It has been adopted and used amongst software engineers ever since.
 
 S.O.L.I.D stands for
 - Single-responsibility principle (SRP)
 - Open-closed principle (OCP)
 - Liskov substitution principle (LSP)
 - Interface segregation principle (ISP)
 - Dependency inversion Principle (DIP)
 
 ## Single-responsibility principle (SRP)
 This principle states that a class should only have a single responsibility. This simply means only changes to one part of the software’s specification should be able to affect the specification of the class.
 
 ## Open-closed principle (OCP)
 This principle states that a class should be extendable, but closed to modification. That simply means any desired additional behavior should be added to another class that extends your original class instead of modifying it.
 
 ## Liskov substitution principle (LSP)
 This principle states that a derived class must be substitutable for its base class.
 
 ## Interface segregation principle (ISP)
 This principle states that client-specific interfaces are better than one general-purpose interface.
 
 ## Dependency inversion Principle (DIP)
 This principle states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
 
 # OOP Four Principles
 - Encapsulation
 - Abstraction
 - Polymorphism
 - Inheritance
 
 ## Encapsulation
 Encapsulation simply means to only allow changes to a class private members, which includes properties and methods, via public methods. No direct access to a class property fields should be allowed.
 
 ## Abstraction
 Abstraction means exposing only the necessary stuff to the end-user, which is whoever is going to be using your class. For instance, you don’t need to know how an engine works to drive a car. All you need to know is how to start the car, accelerate, brake, and stop (a good sense of direction is also needed 😃). However, underneath the hood, a car has an engine, water pump, radiator, etc… furthermore each one of these parts is made up of other parts which are also made of other parts. An engine has cylinders, spark plugs, etc… So, abstraction is when our Car class only exposes four methods (start, accelerate, brake, stop) and keep the other intricate details hidden away from the driver.
 
 ## Polymorphism
 The word Polymorphism means having many forms. But in our context, it refers to the ability of an interface or an abstract class to take many forms via its implemented derived classes. That simply means, for a Cat interface or abstract class, you can have multiples derived classes such as Lion, Cheetah, Tiger, Jaguar, etc… The Cat interface would have a method called scream and that method would print a cat-specific scream for each one of these cats. Even though it’s just one interface, we can get the countless class with distinct behavior as long as they implement the interface.
 
 ## Inheritance
 Supposed you’re working on a vehicle-related application. It will have four types of vehicles: Truck, Bus, SUV, and Motorcycle. All vehicles will have a make, model, trim and year. Then there’ll be additional properties for each type of vehicle. You could declare each class with these same properties, but that would be practicing bad coding standards. Anytime you have common properties in multiple classes, you need to create a base(parent) class and have the other classes(children) extend that base class. In other words, inheritance is similar to babies getting all of their parents’ traits but still have their personalities.