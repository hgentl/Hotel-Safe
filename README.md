# Project Outline
This project was submitted as part of the M250 Object-Oriented Java Programming module at The Open University. It introduces fundamental object-oriented concepts by modelling the behaviour of a hotel room safe, including its internal state, user interactions, and stored contents.

---
## Key Concepts
* Object-oriented modelling
* Encapsulation
* Abstraction
* Delegation
* Collections and iteration
---
## Features
The assingment scenario was to develop software for a hotel safe which allows hotel guests and staff to enter a code in order to open, close, or lock the safe.
### Safe
* Stores the hotel gest's items 
* Contains methods to modify the safe's content
* Displays contents
* Delegates state operations
### SafeState
* Validates PIN codes
* Handles safe operations such as locking and unlocking the safe
* Tracks the Safe's display messages
* Supports a master override code
---
## OOP Concepts Demonstrated
This project explored the fundamental  priciples of OOP and Java including:
### Encapsulation
Objects manage their own internal state through public methods, which are definefd in each class. This allows other objects to interact with them without direct access to their private state.
### Abstraction & mMdulaisation
The safe's application logic is separated from the user-facing functionality, creating modular components that interact through well-defined interfaces. This improves readability, maintainability, and reusability.
### Composition
Every Safe object contains a SafeState object, demonstrating composition. Separating responsibilities in this way improves flexibility and promotes loose coupling between the classes.
### Delegation
The Safe class delegates locking operations to the SafeState object, keeping responsibilities separated and improving the code's readability and maintainability.

---
## Project Structure
```
src/
├── Safe.java
├── SafeState.java
└── Main.java (portfolio demonstration)
```
---
## Note
This project was originally developed using BlueJ as part of a university module focused on object-oriented design rather than building complete Java applications.

To make the project easier to explore outside the university environment, I have added a small Main.java class that demonstrates the core functionality. The demonstration is intended to showcase the design of the classes rather than every aspect of the original assignment.

---
## Reflection
This project was my first experience of designing interacting classes rather than writing procedural code. It helped me understand how responsibilities can be divided between objects, with the Safe class representing the public interface and the SafeState class encapsulating the internal behaviour and validation logic.

One thing I found particularly interesting about this project was seeing how behaviour can be modelled through interacting objects. It helped me appreciate how well-defined responsibilities can make systems easier to understand, extend, and maintain.
