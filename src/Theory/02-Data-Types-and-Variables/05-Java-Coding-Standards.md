# Java Coding Standards

## 1. What Is It?

Conventional rules for naming and formatting Java code consistently.

## 2. Why Do We Need It?

Consistent style makes code easier to read, review, and maintain across teams and over time.

## 3. Basic Syntax

```java
package com.example.project;

public class StudentRecord {          // PascalCase
    private static final int MAX_SIZE = 100; // UPPER_SNAKE_CASE
    private int studentCount;           // camelCase

    public void calculateAverage() {}   // camelCase
}
```

## 4. Simple Example

Class `BankAccount`, method `getBalance()`, variable `accountHolderName`, constant `MAX_LIMIT`, package `com.bank.accounts`.

## 5. How It Works

These are conventions, not compiler-enforced rules (except reserved words) — but violating them creates code that is technically valid yet hard to read.

## 6. Internal Working

| Element | Convention | Example |
|---|---|---|
| Class/Interface | PascalCase | `StudentRecord` |
| Method | camelCase, verb-based | `calculateTotal()` |
| Variable | camelCase | `totalAmount` |
| Constant (`static final`) | UPPER_SNAKE_CASE | `MAX_LIMIT` |
| Package | all lowercase, dot-separated | `com.company.module` |

## 7. Visualization

```
Naming Pyramid
Package:   com.company.module   (all lowercase)
Class:     StudentRecord         (PascalCase)
Method:    calculateAverage()    (camelCase)
Variable:  studentCount          (camelCase)
Constant:  MAX_LIMIT              (UPPER_SNAKE_CASE)
```

## 8. Important Rules

- Braces open on the same line as the declaration (Java convention).
- Indentation: typically 4 spaces, consistent throughout the file.
- One top-level public class per file, matching the filename.

## 9. Common Mistakes

- Mixing naming styles within the same project.
- Overly short, meaningless names (`x`, `tmp`, `d1`) outside of trivial loop counters.

## 10. Best Practices

- Keep line lengths reasonable (~100–120 chars).
- Name booleans as questions: `isValid`, `hasPermission`.
- One responsibility per class/method.

## 11. Interview Points

- Be able to state each naming convention immediately (class, method, variable, constant, package).

## 12. Quick Revision

PascalCase for classes, camelCase for methods/variables, UPPER_SNAKE_CASE for constants, all-lowercase dotted names for packages.
