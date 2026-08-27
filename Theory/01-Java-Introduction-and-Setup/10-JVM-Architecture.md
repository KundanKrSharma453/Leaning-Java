# JVM Architecture

## 1. What Is It?

The Java Virtual Machine (JVM) is the runtime engine that loads, verifies, and executes Java bytecode. It is what makes Java "write once, run anywhere".

## 2. Why Do We Need It?

The JVM abstracts away the underlying OS/hardware so the same bytecode runs identically on any platform with a compatible JVM.

## 3. Basic Syntax

Not applicable — this is a runtime architecture, not language syntax.

## 4. Simple Example

Running `java HelloWorld` starts a JVM process that loads `HelloWorld.class` and executes its `main` method.

## 5. How It Works

The JVM has three major subsystems: **Class Loader Subsystem**, **Runtime Data Areas**, and the **Execution Engine**, supported by the **Native Method Interface (JNI)** and native libraries.

## 6. Internal Working

- **Class Loader Subsystem**
  - *Loading*: reads `.class` bytes into memory.
  - *Linking*: **Verification** (checks bytecode safety/correctness), **Preparation** (allocates memory for static fields with default values), **Resolution** (replaces symbolic references with direct references).
  - *Initialization*: runs static initializers and assigns actual static values.
- **Runtime Data Areas**
  - *Method Area*: class-level data (metadata, static variables, constant pool) — shared across threads.
  - *Heap*: all objects and instance data — shared across threads, garbage collected.
  - *Java Stack*: one per thread; stores frames for method calls (local variables, partial results).
  - *PC Register*: one per thread; tracks the current executing bytecode instruction.
  - *Native Method Stack*: supports native (non-Java) method calls.
- **Execution Engine**
  - *Interpreter*: executes bytecode line by line.
  - *JIT Compiler*: compiles hot bytecode to native machine code.
  - *Garbage Collector*: automatically reclaims heap memory no longer referenced.
- **JNI**: bridge to native libraries written in C/C++.

## 7. Visualization

```
                      JVM
   ┌───────────────────────────────────────────┐
   │        Class Loader Subsystem              │
   │  Loading -> Linking -> Initialization       │
   └───────────────────────────────────────────┘
                       |
   ┌───────────────────────────────────────────┐
   │            Runtime Data Areas               │
   │  Method Area | Heap | Java Stack             │
   │  PC Register | Native Method Stack           │
   └───────────────────────────────────────────┘
                       |
   ┌───────────────────────────────────────────┐
   │            Execution Engine                  │
   │  Interpreter | JIT Compiler | Garbage Collector│
   └───────────────────────────────────────────┘
                       |
                 JNI + Native Libraries
```

## 8. Important Rules

- Heap and Method Area are shared across all threads; Stack, PC Register, and Native Method Stack are per-thread.
- Garbage collection only manages heap memory, not the stack.

## 9. Common Mistakes

- Confusing JDK, JRE, and JVM (see table below).
- Believing the JVM is a single universal binary — it is platform-specific; only bytecode is portable.

## 10. Best Practices

- Understand which data area is affected by `OutOfMemoryError` (usually Heap or Method Area) versus `StackOverflowError` (Java Stack) when debugging.

## 11. Interview Points

| Term | What It Is |
|---|---|
| JVM | Runs bytecode; provides platform independence |
| JRE | JVM + core libraries needed to *run* Java programs |
| JDK | JRE + development tools (`javac`, `jar`, `jshell`, debugger) needed to *build* Java programs |

Modern Java (9+) ships modular runtimes (JPMS) and Java 21 continues this model — JDK 21 includes the JRE's capabilities plus development tooling in one distribution.

## 12. Quick Revision

JVM = Class Loader (load/link/init) + Runtime Data Areas (Method Area, Heap, Stack, PC Register, Native Stack) + Execution Engine (Interpreter, JIT, GC). JDK ⊃ JRE ⊃ JVM.
