# Java Programming Elements

## 1. What Is It?

The basic building blocks used to write any Java program: keywords, identifiers, literals, operators, separators, comments, classes, methods, and statements.

## 2. Why Do We Need It?

Every Java program, no matter how complex, is composed from these same fundamental elements — recognizing them makes reading unfamiliar code much easier.

## 3. Basic Syntax

```java
package com.example;         // package declaration

public class Example {       // class declaration
    int count = 0;            // variable

    void show() {              // method
        System.out.println(count); // statement
    }
}
```

## 4. Simple Example

```java
public class ProgrammingElementsDemo {
    public static void main(String[] args) {
        int number = 10; // variable + literal
        System.out.println(number); // statement
    }
}
```

## 5. How It Works

The compiler parses the source file into tokens (keywords, identifiers, literals, operators, separators), then builds a structure of packages, classes, methods, and statements from those tokens.

## 6. Internal Working

Java's lexer/parser tokenizes source text before semantic analysis and bytecode generation — this is why a single misplaced symbol (like a missing `;`) causes a compile-time syntax error before any deeper logic is checked.

## 7. Visualization

```
Program
├── Package Declaration
├── Import Statements
└── Class Declaration
     ├── Fields (variables)
     ├── Constructors
     └── Methods
          └── Statements
               ├── Expressions
               ├── Operators
               └── Literals
```

## 8. Important Rules

- A `package` statement, if present, must be the first line in the file.
- Every statement ends with a semicolon.
- Code blocks are delimited with `{ }`.

## 9. Common Mistakes

- Mixing up keywords (reserved by the language) with identifiers (names you choose).
- Forgetting semicolons or mismatched braces.

## 10. Best Practices

- Keep each class focused on a single concept, especially in learning examples.
- Use meaningful identifiers rather than single letters (outside of loop counters).

## 11. Interview Points

- Be able to name all core elements: keywords, identifiers, literals, operators, separators, comments.

## 12. Quick Revision

Elements: keywords, identifiers, literals, operators, separators/punctuation, comments — combined into classes, methods, and statements.
