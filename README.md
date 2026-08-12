# Java_For_Learning ☕

This repository documents a Java learning journey focused on **Java 25 LTS**, **core programming fundamentals**, and **object-oriented programming principles**.

## Purpose

- **Skill-building:** Practicing Java syntax, logic, and object modeling step by step.
- **OOP foundation:** Understanding classes, objects, inheritance, abstraction, interfaces, and polymorphism.
- **Practice-oriented learning:** Working through small projects and exercises rather than only theory.
- **Academic foundation:** Building a strong base for moving into more advanced software and game-development concepts.

## Tech Stack & Environment

- **Language:** Java SE 25 (LTS)
- **IDE:** Visual Studio Code
- **Source approach:** Practice exercises and mini-projects written directly in the repository
- **Author:** Ahmet Akpinar

## Educational Use Only

This repository is intended for **learning and personal study**.

- Use it as a reference to understand Java concepts.
- Do not submit these implementations as your own coursework without understanding them first.
- Best results come from trying the exercises yourself before reviewing the code.

---

## Repository Overview

The project contains two major learning tracks:

1. **core Java lessons** in the `src/lessons` package
2. **OOP-focused exercises** in packages such as `OOP1`, `OOP2`, `OOP3`, `OOP4`, and `OOP5`

### Core Lessons (Lessons 1–15)

The lesson files focus on Java basics, control flow, arrays, exception handling, and practical examples.

#### Fundamentals and Logic

- **Lesson 1:** variables, primitive types, literals, arithmetic, and basic output
- **Lesson 2:** more Java basics and simple console programs
- **Lesson 3:** input/output and data handling fundamentals
- **Lesson 4:** selection statements (`if`, `else`, ternary operator, switch-style logic)
- **Lesson 5:** loops (`for`, `while`, `do-while`), branching control, nested iterations
- **Lesson 6:** class and method structure, encapsulation, access modifiers, `this`

#### Advanced Java and Collections

- **Lesson 7:** char and number mapping, ASCII/Unicode-related logic
- **Lesson 8:** Java API usage, `Math` class, basic utility functions, numeric operations
- **Lesson 9:** arrays, multidimensional arrays, varargs, `Arrays` utilities, random data generation
- **Lesson 10:** exception handling with `try`, `catch`, `finally`
- **Lesson 11–15:** continued Java concepts and practice topics as they are implemented in the repository

### Object-Oriented Programming Track

#### OOP1

- `Account.java` and `Account1.java`
- Encapsulation
- Constructors and constructor overloading
- Getter/setter pattern
- Basic account and object modeling examples

#### OOP2

- `Card.java`, `DeckOfCard.java`, `TestCards.java`
- Card representation and deck creation
- Randomization and dealing logic
- Object composition and data abstraction

#### OOP3

- `Time.java`, `TimeTest.java`
- Time-related data class
- Encapsulation and validation concepts
- Custom class behavior and testing

#### OOP4

- `Shape.java`, `Shape2D.java`, `Shape3D.java`, `Circle.java`, `Sphere.java`, `ShapeTest.java`
- Inheritance hierarchies
- Shape modeling with geometric classes
- Abstract class and polymorphism basics

#### OOP5

- `IControllable.java`, `SmartDevice.java`, `SmartCamera.java`, `SmartLight.java`, `SmartHomeHub.java`, `SmartHomeTest.java`
- Interface-based design
- Polymorphism
- Singleton pattern through `SmartHomeHub`
- Smart home simulation with device abstraction

---

## Project Structure

```text
Java_For_Learning/
├── .vscode/
│   └── settings.json
├── src/
│   ├── lessons/
│   │   ├── Lesson1.java
│   │   ├── Lesson2.java
│   │   ├── Lesson3.java
│   │   ├── Lesson4.java
│   │   ├── Lesson5.java
│   │   ├── Lesson6.java
│   │   ├── Lesson7.java
│   │   ├── Lesson8.java
│   │   ├── Lesson9.java
│   │   ├── Lesson10.java
│   │   ├── Lesson11.java
│   │   ├── Lesson12.java
│   │   ├── Lesson13.java
│   │   ├── Lesson14.java
│   │   └── Lesson15.java
│   ├── OOP1/
│   │   ├── Account.java
│   │   ├── Account1.java
│   │   └── AccountTest.java
│   ├── OOP2/
│   │   ├── Card.java
│   │   ├── DeckOfCard.java
│   │   └── TestCards.java
│   ├── OOP3/
│   │   ├── Time.java
│   │   └── TimeTest.java
│   ├── OOP4/
│   │   ├── Circle.java
│   │   ├── Shape.java
│   │   ├── Shape2D.java
│   │   ├── Shape3D.java
│   │   ├── ShapeTest.java
│   │   └── Sphere.java
│   └── OOP5/
│       ├── IControllable.java
│       ├── SmartCamera.java
│       ├── SmartDevice.java
│       ├── SmartHomeHub.java
│       ├── SmartHomeTest.java
│       └── SmartLight.java
├── bin/
└── .gitignore
```

---

## How to Run

### Option 1: Visual Studio Code

1. Open the `Java_For_Learning` folder in Visual Studio Code.
2. Make sure the project is using **Java 25 (LTS)**.
3. Open the lesson or OOP class you want to test.
4. Run the class containing the `main` method using the **Run** button in Visual Studio Code.

Each lesson and OOP exercise is organized in its own Java package.

### Option 2: Command Line

From the project root, compile all Java files.

#### Windows PowerShell

```powershell
Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName } | javac -d bin
```

Then run the desired class:

```powershell
java -cp bin lessons.Lesson1
java -cp bin OOP1.AccountTest
java -cp bin OOP2.TestCards
java -cp bin OOP3.TimeTest
java -cp bin OOP4.ShapeTest
java -cp bin OOP5.SmartHomeTest
```

> The package name must be included when running classes from the command line because these files are organized in packages.

---

## Learning Focus

This repository is primarily a Java learning archive and demonstration space. It emphasizes:

- syntax and problem solving
- object modeling
- control flow and logic
- reusable class design
- OOP concepts in concrete examples

---

## Author

- **Ahmet Akpinar**
- GitHub: [@one-byte-man](https://github.com/one-byte-man)
- Instagram: [@one_byte_man](https://www.instagram.com/one_byte_man)

_Last Updated: August 2026_
