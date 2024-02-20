# Dependency Injection Example

This repository contains an example project demonstrating dependency injection in Java using different methods: manual instantiation, dynamic instantiation, and using the Spring Framework with both XML configuration and annotations.

## Project Structure

The project is structured as follows:

├── Dependecy-Injection.iml
├── config.txt
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── CONFIG
│   │   │   ├── DAO
│   │   │   │   ├── DaoImpl.java
│   │   │   │   └── IDao.java
│   │   │   ├── EXTENSION
│   │   │   │   └── DaoImpl2.java
│   │   │   ├── METIER
│   │   │   │   ├── Imetier.java
│   │   │   │   └── MetierImpl.java
│   │   │   └── Presentation
│   │   │       ├── Pres.java
│   │   │       ├── PresVspring.java
│   │   │       └── PresVspringAnnot.java
│   │   └── resources
│   │       └── applicationContext.xml
│   └── test
│       └── java
└── target
    ├── classes
    │   ├── DAO
    │   │   ├── DaoImpl.class
    │   │   └── IDao.class
    │   ├── EXTENSION
    │   │   └── DaoImpl2.class
    │   ├── METIER
    │   │   ├── Imetier.class
    │   │   └── MetierImpl.class
    │   ├── Presentation
    │   │   ├── Pres.class
    │   │   ├── PresVspring.class
    │   │   └── PresVspringAnnot.class
    │   ├── applicationContext.xml
    │   └── main
    │       └── resources
    │           └── applicationContext.xml
    ├── generated-sources
    │   └── annotations
    └── maven-status
        └── maven-compiler-plugin
            └── compile
                └── default-compile
                    ├── createdFiles.lst
                    └── inputFiles.lst

## Part 1: Manual Dependency Injection

1. Create the `IDao` interface with a `getDate` method.
2. Implement the `IDao` interface with the `DaoImpl` class.
3. Create the `IMetier` interface with a `calcul` method.
4. Implement the `IMetier` interface with the `MetierImpl` class using low coupling.
5. Perform dependency injection:
   - Static instantiation
   - Dynamic instantiation

## Part 2: Dependency Injection with Spring

1. Configure dependency injection using the Spring Framework:
   - XML configuration (`applicationContext.xml`)
   - Annotation-based configuration

## Conclusion

While manual dependency injection works, it has its limitations such as increased coupling and tedious configuration. In contrast, using frameworks like Spring allows for more automated dependency management, reducing coupling and improving maintainability. The provided example demonstrates the transition from manual to Spring-based dependency injection, showcasing its benefits.
