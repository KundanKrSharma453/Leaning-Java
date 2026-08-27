# Control Statements — Overview

## 1. What Is It?

Statements that control the order in which other statements execute: conditional (decision-making), looping (repetition), and transfer (jumping) statements.

## 2. Why Do We Need It?

Without control statements, a program could only execute top-to-bottom exactly once — real logic requires branching and repetition.

## 3. Basic Syntax

```java
if (condition) { }
for (init; condition; update) { }
while (condition) { }
break; continue; return;
```

## 4. Simple Example

```java
for (int i = 1; i <= 3; i++) {
    if (i == 2) continue;
    System.out.println(i);
}
```

## 5. How It Works

The three categories work together: conditionals choose a path, loops repeat a path, transfer statements alter the normal flow within a path (skip, exit, or return early).

## 6. Internal Working

At the bytecode level, control statements compile down to conditional and unconditional **jump instructions** (`goto`, `if_icmpXX`, etc.) that change which instruction the JVM executes next.

## 7. Visualization

```
Control Statements
├── Conditional  (if, if-else, switch)      -> choose a branch
├── Looping      (for, while, do-while)      -> repeat a branch
└── Transfer     (break, continue, return)   -> jump within/out of flow
```

## 8. Important Rules

- Every branch of an `if`/`switch` should handle its case explicitly, or intentionally fall through to a default.
- Loops need a way to terminate, or they run forever.

## 9. Common Mistakes

- Off-by-one errors in loop conditions.
- Forgetting `break` in traditional `switch` statements (see Conditional Statements theory).

## 10. Best Practices

- Prefer the modern `switch` expression (Java 14+) when returning a value, to avoid fall-through bugs.
- Keep control-flow nesting shallow for readability.

## 11. Interview Points

- Be ready to categorize any given statement (`for`, `if`, `break`, etc.) into conditional/looping/transfer.

## 12. Quick Revision

Conditional = branching, Looping = repetition, Transfer = jumping (break/continue/return).
