# LoxJava
Java implementation of the Lox programming language from the book [Crafting Interpreters](http://craftinginterpreters.com/)


## Requirements

Tested with Java 19 & Maven 3.9


## Usage

To compile, run the following from this directory:

```shell
mvn package
```

To run the REPL:

```shell
java -cp target/src-1.0-SNAPSHOT.jar com.lox.Lox
```

To run a `.lox` file:

```shell
java -cp target/src-1.0-SNAPSHOT.jar com.lox.Lox <path-to-lox-file>
```