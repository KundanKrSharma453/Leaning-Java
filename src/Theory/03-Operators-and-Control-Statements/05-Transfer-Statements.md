# Transfer Statements

## 1. What Is It?

Statements that transfer control out of the normal sequential flow: `break`, `continue`, and `return`.

## 2. Why Do We Need It?

They let you exit loops early, skip iterations, or exit a method early with a result — avoiding deeply nested conditional logic.

## 3. Basic Syntax

```java
break;      // exit the nearest loop or switch
continue;   // skip to the next iteration of the nearest loop
return value; // exit the current method, optionally returning a value
```

## 4. Simple Example

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // skip 3
    if (i == 5) break;    // stop before printing 5
    System.out.println(i);
}
```

## 5. How It Works

`break` immediately exits the nearest enclosing loop or `switch`. `continue` immediately jumps to the loop's update/condition check, skipping the rest of the current iteration's body. `return` immediately exits the current method, optionally passing back a value to the caller.

## 6. Internal Working

All three compile to unconditional jump (`goto`-style) bytecode instructions — `break`/`continue` jump to a label just outside/at the top of the loop, and `return` jumps to the method's exit sequence (unwinding the current stack frame).

## 7. Visualization

```
break:     [ Loop Body ] --break--> [ Code After Loop ]
continue:  [ Loop Body ] --continue--> [ Update/Condition Check ] --> next iteration
return:    [ Method Body ] --return--> [ Back to Caller ]
```

## 8. Important Rules

- `break`/`continue` only apply to the nearest enclosing loop unless a labeled loop is used (`outer: for (...) { break outer; }`).
- `return` inside a `finally` block silently overrides an in-flight exception or earlier return — a subtle and generally discouraged pattern.

## 9. Common Mistakes

- Assuming `continue` exits the loop entirely — it only skips to the next iteration.
- Forgetting that `break` inside a `switch` only exits the switch, not any enclosing loop.

## 10. Best Practices

- Use labeled `break`/`continue` sparingly and only when it genuinely improves clarity over restructuring the loop.
- Prefer early `return` in methods over deeply nested `if` blocks, to keep code flat and readable.

## 11. Interview Points

- Clearly differentiate `break` (exit) vs `continue` (skip) vs `return` (exit method) — a very common basic interview question.

## 12. Quick Revision

break = stop the loop/switch. continue = skip to next iteration. return = exit the method (with or without a value).
