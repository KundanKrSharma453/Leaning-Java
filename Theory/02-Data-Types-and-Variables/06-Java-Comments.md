# Java Comments

## 1. What Is It?

Text in source code ignored by the compiler, used to explain code to human readers.

## 2. Why Do We Need It?

Comments document intent, clarify non-obvious logic, and generate API documentation (via Javadoc).

## 3. Basic Syntax

```java
// single-line comment

/* multi-line
   comment */

/**
 * Javadoc (documentation) comment
 * @param name description
 */
```

## 4. Simple Example

```java
// Calculates the sum of two integers
int sum = a + b;
```

## 5. How It Works

The compiler strips comments during lexical analysis before parsing; they have zero effect on compiled bytecode. Javadoc comments are additionally read by the `javadoc` tool to generate HTML documentation.

## 6. Internal Working

`//` comments run to end of line; `/* */` comments can span multiple lines but cannot nest; `/** */` is a special multi-line form recognized by documentation tools via tags like `@param`, `@return`, `@throws`.

## 7. Visualization

```
Source with comments --(javac strips comments)--> Bytecode (no comments)
```

## 8. Important Rules

- `/* */` comments cannot be nested.
- Javadoc comments must appear immediately before the element (class/method/field) they document.

## 9. Common Mistakes

- Accidentally nesting `/* */` comments, causing a syntax error.
- Writing comments that just restate the code (`i++; // increment i`) instead of explaining *why*.

## 10. Best Practices

- Comment the *why*, not the *what* — code should already show what it does.
- Use Javadoc for public APIs so tools can auto-generate documentation.

## 11. Interview Points

- Know all three comment types and when each is appropriate.

## 12. Quick Revision

`//` single-line, `/* */` multi-line (no nesting), `/** */` Javadoc (documentation generation).
