# Java Introduction

## 1. What Is It?

Java is a general-purpose, class-based, object-oriented programming language created by James Gosling at Sun Microsystems (first released 1995, now maintained by Oracle). It is designed to be simple, portable, and secure.

## 2. Why Do We Need It?

Java lets you write code once and run it on any device that has a Java Virtual Machine (JVM) — the core idea behind *"Write Once, Run Anywhere" (WORA)*. It powers everything from Android apps to enterprise backends.

## 3. Basic Syntax

```java
public class ClassName {
    public static void main(String[] args) {
        // program logic
    }
}
```

## 4. Simple Example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 5. How It Works

You write source code in a `.java` file, the `javac` compiler turns it into platform-independent **bytecode** (`.class`), and the JVM executes that bytecode on the target machine.

## 6. Internal Working

Java source is never compiled directly to native machine code. It compiles to bytecode, an intermediate instruction set understood by every JVM implementation, regardless of the underlying OS/CPU.

## 7. Visualization

```
HelloWorld.java --(javac)--> HelloWorld.class --(JVM)--> Output
```

## 8. Important Rules

- One `public` top-level class per `.java` file, and the file name must match that class name.
- Execution always starts from `public static void main(String[] args)`.
- Java is case-sensitive.

## 9. Common Mistakes

- Naming the file differently from the public class.
- Forgetting `static` on `main`, which prevents the JVM from finding an entry point without an object.
- Confusing Java with JavaScript — they are unrelated languages.

## 10. Best Practices

- Use meaningful class names.
- Keep one primary responsibility per class/file, especially in learning code.
- Always check compiler errors before assuming logic errors.

## 11. Interview Points

- Java is compiled **and** interpreted (bytecode compiled, then interpreted/JIT-compiled by the JVM).
- **Common Misconception:** "Java is a fully interpreted language" — false; it uses a hybrid compile+interpret+JIT model.

## 12. Quick Revision

Java = source code -> bytecode (javac) -> JVM execution. Platform independent because the JVM, not the OS, runs the bytecode.
