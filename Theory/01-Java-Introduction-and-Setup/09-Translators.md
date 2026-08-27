# Translators (Compiler, Interpreter, JIT)

## 1. What Is It?

Programs that convert code from one form to another so it can be executed. Java uses a **compiler**, an **interpreter**, and a **JIT (Just-In-Time) compiler** together.

## 2. Why Do We Need It?

Source code is human-readable but not directly executable by hardware; translators bridge that gap, and Java's specific combination balances portability with performance.

## 3. Basic Syntax

Not applicable — conceptual topic.

## 4. Simple Example

`javac` (compiler) turns `.java` into `.class`; at runtime the JVM interprets bytecode and JIT-compiles hot methods to native code.

## 5. How It Works

1. **Compiler (`javac`)**: source -> bytecode (once).
2. **Interpreter**: reads bytecode and executes it instruction by instruction at runtime.
3. **JIT Compiler**: identifies frequently executed ("hot") bytecode and compiles it directly to native machine code for that specific CPU, caching the result for reuse.

## 6. Internal Working

The JVM starts by interpreting bytecode for fast startup, then profiles execution; hot spots get compiled by the JIT (hence "HotSpot JVM") so repeated execution becomes near-native speed without sacrificing portability of the original bytecode.

## 7. Visualization

```
Source (.java)
   | compiler (javac)
   v
Bytecode (.class)
   | interpreter (fast start) + JIT (hot-path speed)
   v
Native machine instructions (at runtime)
```

## 8. Important Rules

- Compilation (`javac`) happens once, ahead of time.
- Interpretation and JIT compilation happen at runtime, inside the JVM.

## 9. Common Mistakes

- Saying Java is "only interpreted" or "only compiled" — it is a hybrid model using all three translator types.

## 10. Best Practices

- Understand that JIT warm-up means the first few executions of a method may be slower than later ones.

## 11. Interview Points

- **Common Misconception:** "Java is purely interpreted" — incorrect. Java compiles to bytecode ahead of time, then the JVM interprets and/or JIT-compiles it at runtime.

## 12. Quick Revision

Compiler (source -> bytecode, once) + Interpreter (bytecode -> execution, per run) + JIT (hot bytecode -> native code, per run) = Java's translation pipeline.
