# Identifiers & Rules

## 1. What Is It?

An identifier is the name given to a variable, method, class, package, or other program element.

## 2. Why Do We Need It?

Identifiers let us refer to program elements meaningfully instead of by memory address.

## 3. Basic Syntax

```java
int totalMarks;      // valid
class StudentRecord {} // valid
```

## 4. Simple Example

Valid: `age`, `_count`, `$price`, `studentName2`
Invalid: `2ndPlace` (starts with digit), `class` (reserved word), `first-name` (hyphen not allowed)

## 5. How It Works

The compiler's lexer checks each identifier against Java's naming rules during tokenization; violations cause compile-time syntax errors.

## 6. Internal Working

Identifiers may contain Unicode letters, digits, `_`, and `$`, but cannot start with a digit and cannot exactly match a reserved keyword.

## 7. Visualization

```
Valid Identifier Characters: [A-Z a-z 0-9 _ $ (and Unicode letters)]
First Character: cannot be a digit
```

## 8. Important Rules

- Cannot start with a digit.
- Cannot be a reserved keyword (`class`, `int`, `if`, etc.).
- Case-sensitive (`age` and `Age` are different identifiers).
- Can contain letters, digits, underscore `_`, and dollar sign `$`.

## 9. Common Mistakes

- Using hyphens or spaces in names (not allowed in Java, unlike some other contexts).
- Naming a variable the same as a reserved word.

## 10. Best Practices

- Use descriptive names (`totalPrice`, not `tp`).
- Follow conventional casing (see Coding Standards) rather than just "anything legal".

## 11. Interview Points

- List the 4 core identifier rules from memory.
- Explain that `$` and `_` are legal but discouraged for regular identifiers (often reserved for generated/special code).

## 12. Quick Revision

Identifiers: letters/digits/`_`/`$`, cannot start with digit, cannot be a keyword, case-sensitive.
