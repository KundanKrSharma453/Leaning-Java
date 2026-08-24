# Looping Statements

## 1. What Is It?

Statements that repeat a block of code while a condition holds true.

## 2. Why Do We Need It?

Loops avoid duplicating code for repetitive tasks (processing collections, counting, retrying, etc.).

## 3. Basic Syntax

```java
for (init; condition; update) { }
while (condition) { }
do { } while (condition);
for (Type item : collection) { } // enhanced for
```

## 4. Simple Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## 5. How It Works

`for`: initialize once, check condition, run body, run update, repeat. `while`: check condition first, run body if true, repeat. `do-while`: run body first, then check condition (always runs at least once).

## 6. Internal Working

All loop forms compile to the same underlying bytecode pattern: a condition check plus a conditional jump back to the top of the loop body. The enhanced `for` loop is syntactic sugar — over arrays it becomes an index-based loop, and over `Iterable` it uses an `Iterator` internally (`hasNext()`/`next()`).

## 7. Visualization

```
Initialization
      |
      v
  Condition? --No--> Exit Loop
      |Yes
      v
   Loop Body
      |
      v
    Update
      |
      └──> (back to Condition)
```

## 8. Important Rules

- `do-while` always executes its body at least once, even if the condition is initially false.
- Enhanced `for` cannot modify the underlying collection's size safely (risk of `ConcurrentModificationException`) and doesn't expose the index directly.
- An infinite loop (`for(;;)` or `while(true)`) needs an internal `break`/`return` to terminate.

## 9. Common Mistakes

- Off-by-one errors (`<=` vs `<` in the condition).
- Modifying the loop variable inside the body in confusing ways, making the iteration count hard to reason about.
- Creating unintentional infinite loops by forgetting the update step.

## 10. Best Practices

- Use enhanced `for` when you just need each element and don't need the index.
- Use classic `for` when you need the index or fine control over the step.
- Use `while`/`do-while` when the number of iterations isn't known ahead of time.

## 11. Interview Points

- Explain exactly when to choose `for` vs `while` vs `do-while` vs enhanced `for`.
- **Common Misconception:** "`while` and `do-while` always behave the same" — false; `do-while` guarantees at least one execution.

## 12. Quick Revision

for = known iteration count/index. while = condition-first, may run 0 times. do-while = body-first, runs >=1 time. enhanced-for = simplified iteration over arrays/collections.
