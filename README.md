# Design Patterns in Java

This repository contains examples of Design Pattern implementations in Java. The patterns are divided into three main packages: 
- **Structural**
- **Creational**
- **Behavioral**

## Structural Patterns

Structural patterns are concerned with the composition of classes and objects to form larger, more complex structures. The patterns included in this package are:

- [ ] **Adapter**: Allows objects with incompatible interfaces to work together.
- [ ] **Bridge**: Separates an abstraction from its implementation, allowing both to vary independently.
- [ ] **Composite**: Allows objects to be composed into tree structures to represent whole-part hierarchies.
- [X] **Decorator**: Adds additional behavior to an object dynamically.
- [ ] **Facade**: Provides a unified interface to a set of interfaces in a subsystem.
- [ ] **Flyweight**: Allows efficient sharing of fine-grained objects.
- [ ] **Proxy**: Provides a substitute or placeholder for another object to control access to it.

## Creational Patterns

Creational patterns focus on flexible object creation, ensuring that the creation process is decoupled from the object's usage. The patterns included in this package are:

- [ ] **Abstract Factory**: Provides an interface for creating families of related objects without specifying their concrete classes.
- [ ] **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- [ ] **Factory Method**: Defines an interface for creating an object but allows subclasses to decide which class to instantiate.
- [ ] **Prototype**: Enables the creation of new objects by copying an existing prototype.
- [ ] **Singleton**: Ensures that a class has only one instance and provides a global access point to it.

## Behavioral Patterns

Behavioral patterns focus on algorithms and the assignment of responsibilities among objects. The patterns included in this package are:

- [ ] **Chain of Responsibility**: Allows a request to be passed along a chain of objects until one of them handles it.
- [ ] **Command**: Encapsulates a request as an object, allowing you to parameterize clients with different requests, queue or log them, and support undoable operations.
- [ ] **Interpreter**: Defines a grammatical representation for a language and an interpreter to evaluate expressions in that language.
- [ ] **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- [ ] **Mediator**: Allows objects to communicate with each other without direct coupling, avoiding explicit references.
- [ ] **Memento**: Enables capturing and restoring the internal state of an object without violating encapsulation.
- [ ] **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- [ ] **State**: Allows an object to alter its behavior when its internal state changes.
- [X] **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- [ ] **Template Method**: Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
- [ ] **Visitor**: Allows adding new operations to existing objects without modifying their structure.
