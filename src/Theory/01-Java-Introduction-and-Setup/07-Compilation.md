# Compilation

## 1. What Is It?

The process of translating human-readable Java source code (`.java`) into platform-independent bytecode (`.class`) using the `javac` compiler.

## 2. Why Do We Need It?

The JVM cannot execute raw Java text; it executes bytecode. Compilation bridges that gap while also catching syntax and type errors early.

## 3. Basic Syntax

```bash
javac FileName.java
```

## 4. Simple Example

```bash
$ javac HelloWorld.java
$ ls
HelloWorld.class  HelloWorld.java
```

## 5. How It Works

`javac` performs lexical analysis, parsing, semantic/type checking, and then generates bytecode instructions stored in a `.class` file, one per top-level/nested class.

## 6. Internal Working

Compilation happens in stages: tokenizing -> parsing into an AST -> semantic analysis (type checking, resolving symbols) -> bytecode generation. Errors at any stage stop compilation before a `.class` file is produced.

## 7. Visualization

```
HelloWorld.java --(javac)--> HelloWorld.class
```

## 8. Important Rules

- A `.class` file is produced only when compilation is fully successful.
- One `.class` file is generated per class, including nested/inner classes.

## 9. Common Mistakes

- Assuming a `.class` file exists after a failed compilation.
- Confusing compiler errors (syntax/type issues, caught at compile time) with runtime errors.

## 10. Best Practices

- Read compiler error messages top to bottom; the first error often causes cascading ones.
- Compile often, in small steps.

## 11. Interview Points

- **Common Misconception:** "javac produces machine code" — false; it produces bytecode, which is further processed by the JVM.

## 12. Quick Revision

Compilation = `.java` -> `javac` -> `.class` (bytecode), independent of any specific machine.
