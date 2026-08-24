# Java Program Execution Flow

## 1. What Is It?

The complete journey of a Java program from source code to running output.

## 2. Why Do We Need It?

Understanding this flow demystifies compiler errors, runtime errors, and performance behavior.

## 3. Basic Syntax

```bash
javac Program.java   # compile
java Program          # execute
```

## 4. Simple Example

`HelloWorld.java` -> `javac HelloWorld.java` produces `HelloWorld.class` -> `java HelloWorld` prints output.

## 5. How It Works

1. Write `.java` source.
2. `javac` compiles it to bytecode (`.class`).
3. JVM's Class Loader loads the `.class` file.
4. Bytecode is verified for safety.
5. Runtime Data Areas are set up.
6. The Execution Engine (interpreter + JIT) runs the bytecode.
7. Output is produced.

## 6. Internal Working

The interpreter executes bytecode instruction-by-instruction initially; frequently executed ("hot") code paths are compiled to native machine code by the JIT compiler for speed.

## 7. Visualization

```
.java
  |
  v
javac (compiler)
  |
  v
.class (bytecode)
  |
  v
Class Loader
  |
  v
Bytecode Verification
  |
  v
JVM Runtime (Runtime Data Areas)
  |
  v
Interpreter / JIT Compiler
  |
  v
Machine Code
  |
  v
CPU -> Output
```

## 8. Important Rules

- Compilation happens once; execution can happen many times on the same `.class` file.
- Class loading is lazy — classes load when first referenced, not all upfront.

## 9. Common Mistakes

- Assuming Java compiles directly to machine code (it compiles to bytecode instead).
- Confusing compile-time errors with runtime errors because both can appear near program start.

## 10. Best Practices

- Fix compiler errors first; they block execution entirely.
- Use `java -verbose:class` when learning to observe class loading in action.

## 11. Interview Points

- Be able to draw the full `.java -> .class -> JVM -> output` pipeline from memory.
- Explain the difference between the interpreter and JIT compiler in this flow.

## 12. Quick Revision

Source -> Compile (javac) -> Bytecode -> Class Loader -> Verify -> Runtime Areas -> Execution Engine -> Output.
