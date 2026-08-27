# Conditional Statements

## 1. What Is It?

Statements that execute different code blocks depending on whether a condition is true or false.

## 2. Why Do We Need It?

Programs must make decisions — conditionals implement that decision-making.

## 3. Basic Syntax

```java
if (condition) { }
else if (condition) { }
else { }

switch (value) {
    case A -> { }
    default -> { }
}
```

## 4. Simple Example

```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

## 5. How It Works

The condition (a `boolean` expression) is evaluated; if `true`, the associated block runs and the rest are skipped; if `false`, evaluation continues to the next `else if`/`else`.

## 6. Internal Working

At the bytecode level, `if` compiles to a conditional branch instruction that jumps past the block when the condition is false. `switch` on `int`/`enum`/`String` compiles to efficient jump tables or lookup switches for performance.

## 7. Visualization

```
        Condition?
        /       \
     Yes          No
      |            |
   Code Block   Else Block
        \        /
          Continue
```

## 8. Important Rules

- Only one branch of an `if-else-if` chain executes.
- Traditional `switch` statements fall through to the next case unless `break` is used; `switch` **expressions** with `->` do not fall through.
- `yield` returns a value from a `switch` expression block.

## 9. Common Mistakes

- Forgetting `break` in a traditional `switch`, causing unintended fall-through.
- Using `=` instead of `==` in a condition (a compile error in Java for non-boolean types, but still a common typo to watch for).

## 10. Best Practices

- Prefer `switch` expressions (`->`) over traditional `switch` statements when selecting a value, since Java 21 supports them and they are exhaustive-checked and fall-through-free.
- Keep conditions simple; extract complex boolean logic into a well-named boolean variable or method.

## 11. Interview Points

- Explain Java 21 modern switch: arrow labels (`->`), `yield`, exhaustiveness with `sealed` types/enums, and pattern matching in `switch` (preview/finalized features across recent versions).
- **Common Misconception:** "switch expressions fall through like switch statements" — false; arrow-style cases do not fall through.

## 12. Quick Revision

if/else-if/else = sequential boolean checks. switch = multi-way branch on a single value; modern arrow syntax avoids fall-through and can `yield` a value directly.
