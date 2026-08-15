# System-Design-LLD


---

# Design Pattern Summary

| Category | Design Patterns |
|---|---|
| Creational | Singleton, Factory, Abstract Factory, Builder, Prototype |
| Structural | Adapter, Decorator, Facade, Proxy, Composite, Bridge, Flyweight |
| Behavioral | Chain of Responsibility, Strategy, Observer, State, Command, Template Method, Iterator, Mediator, Memento, Visitor |

---

# Quick Memory Guide

## Creational

**How should objects be created?**

```text
Singleton
Factory
Abstract Factory
Builder
Prototype
```

## Structural

**How should objects/classes be connected?**

```text
Adapter
Decorator
Facade
Proxy
Composite
Bridge
Flyweight
``` 

## Behavioral


**How should objects communicate and behave?**
```text
Chain of Responsibility
Strategy
Observer
State
Command
Template Method
Iterator
Mediator
Memento
Visitor

```

## Important Design Pattern Differences
### Adapter vs Proxy
Adapter → Converts interface
Proxy   → Controls access
### Adapter vs Decorator
Adapter   → Changes interface
Decorator → Adds behavior
### Facade vs Adapter
Facade  → Simplifies a complex system
Adapter → Makes incompatible interfaces compatible
### Strategy vs State
Strategy → Client chooses the algorithm
State    → Object's state determines behavior
### Observer vs Mediator
Observer → One-to-many notification
Mediator → Centralizes communication between objects
### Factory vs Builder
Factory → Creates an object
Builder → Builds a complex object step by step

## Goal

**The goal of studying design patterns is not to use patterns everywhere.**

The goal is to understand:

* When a pattern is useful
* What problem it solves
* Its advantages and disadvantages
* How it affects coupling and flexibility
* How it can be applied in real-world LLD problems

**Good design is not about using more patterns. It is about using the right pattern when it solves a real problem.**


# Design Patterns

This repository contains implementations and notes for commonly used **Design Patterns in Java**.

Design patterns are reusable solutions to commonly occurring software design problems. They help us write code that is **clean, flexible, maintainable, and extensible**.

---

## Types of Design Patterns

Design patterns are mainly divided into three categories:

1. Creational Patterns
2. Structural Patterns
3. Behavioral Patterns

---

# 1. Creational Design Patterns

Creational patterns deal with **object creation**.

They help make object creation flexible and reduce tight coupling between classes.

### Patterns

- Singleton
- Factory
- Abstract Factory
- Builder
- Prototype

---

## Singleton

Ensures that a class has **only one instance** and provides a global access point to that instance.

### Common Use Cases

- Logger
- Configuration Manager
- Database Connection Manager
- Cache Manager

---

## Factory

Provides a way to create objects without exposing the object creation logic to the client.

### Common Use Cases

- Payment systems
- Notification systems
- Shape creation
- Database connections

---

## Abstract Factory

Provides an interface for creating **families of related objects** without specifying their concrete classes.

### Common Use Cases

- UI components
- Cross-platform applications
- Different database families

---

## Builder

Used to construct complex objects step by step.

### Common Use Cases

- Objects with many optional parameters
- Configuration objects
- Request objects

---

## Prototype

Creates new objects by **copying an existing object** instead of creating them from scratch.

### Common Use Cases

- Expensive object creation
- Object cloning
- Template-based objects

---

# 2. Structural Design Patterns

Structural patterns deal with **how classes and objects are combined** to form larger structures.

### Patterns

- Adapter
- Decorator
- Facade
- Proxy
- Composite
- Bridge
- Flyweight

---

## Adapter

Allows two incompatible interfaces to work together.

### Main Idea

> Convert one interface into another interface that the client expects.

### Common Use Cases

- Third-party API integration
- Legacy code integration
- External payment services
- External notification services

---

## Decorator

Adds new behavior to an existing object without modifying its original class.

### Main Idea

> Add responsibilities dynamically.

### Common Use Cases

- Logging
- Caching
- Compression
- Encryption
- Java I/O streams

---

## Facade

Provides a **simple interface** to a complex subsystem.

### Main Idea

> Hide complexity behind a simple interface.

### Common Use Cases

- Order processing
- Payment systems
- Complex APIs
- Service orchestration

---

## Proxy

Provides a substitute or representative for another object.

### Main Idea

> Control access to another object.

### Common Use Cases

- Authentication
- Authorization
- Lazy loading
- Caching
- Remote objects
- Logging

---

## Composite

Allows individual objects and groups of objects to be treated in the same way.

### Main Idea

> Treat a single object and a collection of objects uniformly.

### Common Use Cases

- File systems
- Organization hierarchies
- UI component trees
- Menu structures

---

## Bridge

Separates an abstraction from its implementation so that both can evolve independently.

### Main Idea

> Separate what something does from how it does it.

### Common Use Cases

- Cross-platform applications
- Multiple implementations of the same abstraction
- Device and remote-control systems

---

## Flyweight

Reduces memory usage by sharing common objects instead of creating many identical objects.

### Main Idea

> Share objects that contain common data.

### Common Use Cases

- Text editors
- Game objects
- Large object collections
- Character rendering

---

# 3. Behavioral Design Patterns

Behavioral patterns deal with **communication and responsibility between objects**.

### Patterns

- Chain of Responsibility
- Strategy
- Observer
- State
- Command
- Template Method
- Iterator
- Mediator
- Memento
- Visitor

---

## Chain of Responsibility

Passes a request through a chain of handlers until one of them handles it.

### Main Idea

> Give multiple objects a chance to handle a request.

### Common Use Cases

- Authentication pipelines
- Authorization
- Logging
- HTTP filters
- Leave approval
- Support ticket escalation

---

## Strategy

Allows different algorithms to be selected at runtime.

### Main Idea

> Encapsulate different algorithms and choose one when needed.

### Common Use Cases

- Payment methods
- Sorting strategies
- Pricing strategies
- Navigation
- Compression algorithms

---

## Observer

Creates a one-to-many relationship where multiple objects are notified when one object's state changes.

### Main Idea

> When one object changes, notify all interested objects.

### Common Use Cases

- Event systems
- Notifications
- Stock price updates
- Chat applications
- GUI events

---

## State

Allows an object to change its behavior when its internal state changes.

### Main Idea

> Object behavior depends on its current state.

### Common Use Cases

- Order status
- Vending machines
- Traffic lights
- Media players
- ATM states

---

## Command

Encapsulates a request as an object.

### Main Idea

> Turn an operation into an object.

### Common Use Cases

- Undo/Redo
- Remote controls
- Task queues
- Transaction systems
- Menu actions

---

## Template Method

Defines the skeleton of an algorithm while allowing subclasses to customize specific steps.

### Main Idea

> Keep the overall algorithm fixed but allow certain steps to change.

### Common Use Cases

- Data processing
- Report generation
- File processing
- Authentication workflows

---

## Iterator

Provides a way to access elements of a collection sequentially without exposing its internal structure.

### Main Idea

> Traverse a collection without knowing how it is implemented.

### Common Use Cases

- Collections
- Trees
- Graphs
- Custom data structures

---

## Mediator

Reduces direct communication between multiple objects by introducing a mediator.

### Main Idea

> Objects communicate through a central mediator.

### Common Use Cases

- Chat rooms
- Air traffic control
- UI components
- Workflow systems

---

## Memento

Captures and stores an object's state so it can be restored later.

### Main Idea

> Save and restore an object's previous state.

### Common Use Cases

- Undo/Redo
- Game checkpoints
- Editor history
- Transaction rollback

---

## Visitor

Allows new operations to be added to existing object structures without modifying those objects.

### Main Idea

> Separate operations from the objects on which they operate.

### Common Use Cases

- Compiler processing
- File system operations
- Document processing
- AST processing

