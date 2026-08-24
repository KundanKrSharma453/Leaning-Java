# Execution

## 1. What Is It?

The process of running compiled bytecode (`.class`) using the `java` launcher, which starts the JVM.

## 2. Why Do We Need It?

Compilation alone doesn't produce output — the JVM must load and execute the bytecode to actually run your program.

## 3. Basic Syntax

```bash
java ClassName
```

## 4. Simple Example

```bash
$ java HelloWorld
Hello, World!
```

## 5. How It Works

The `java` command starts a new JVM instance, which loads the specified class, locates its `main` method, and begins executing bytecode from there.

## 6. Internal Working

The JVM's Class Loader Subsystem loads the class, the bytecode verifier checks safety, Runtime Data Areas are allocated, and the Execution Engine (interpreter + JIT) begins running instructions.

## 7. Visualization

```
java ClassName
   |
   v
JVM starts -> Class Loader -> Verify -> Runtime Areas -> Execution Engine -> Output -> JVM exits
```

## 8. Important Rules

- The class passed to `java` must contain `public static void main(String[] args)`.
- Execution ends when `main` returns (or `System.exit()` is called, or an uncaught exception propagates).

## 9. Common Mistakes

- Running `java ClassName.class` instead of `java ClassName` (no extension needed).
- Forgetting that `main` must be `public static void`.

## 10. Best Practices

- Handle exceptions gracefully instead of letting the JVM print a raw stack trace to users.
- Use exit codes meaningfully in real applications (`System.exit(code)`).

## 11. Interview Points

- Explain what happens between typing `java ClassName` and seeing output — this is a very common interview question.

## 12. Quick Revision

Execution = `java ClassName` -> JVM starts -> loads/verifies class -> runs bytecode from `main` -> produces output.
