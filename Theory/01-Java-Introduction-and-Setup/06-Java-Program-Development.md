# Java Program Development

## 1. What Is It?

The end-to-end lifecycle of building a Java application: writing, compiling, testing, debugging, and running.

## 2. Why Do We Need It?

A repeatable development cycle avoids wasted effort and catches errors early.

## 3. Basic Syntax

```bash
# 1. Write     -> Program.java
# 2. Compile   -> javac Program.java
# 3. Run       -> java Program
# 4. Debug/Fix -> repeat
```

## 4. Simple Example

Edit `Calculator.java` -> compile -> run -> notice wrong output -> fix logic -> recompile -> rerun.

## 5. How It Works

Development is an iterative loop: Edit -> Compile -> Run -> Test -> Debug -> Edit again, until the program behaves correctly.

## 6. Internal Working

Modern IDEs automate compile-run-debug cycles, but the underlying steps (`javac`, `java`) are the same tools used from the command line.

## 7. Visualization

```
Write Code -> Compile -> Fix Compile Errors? --Yes--> Write Code
     |
     No
     v
   Run -> Correct Output? --No--> Debug -> Write Code
     |
    Yes
     v
   Done
```

## 8. Important Rules

- Always resolve compile-time errors before evaluating runtime behavior.
- Test with multiple inputs, not just the "happy path".

## 9. Common Mistakes

- Skipping small, incremental testing and writing large amounts of code before ever compiling.
- Ignoring compiler warnings.

## 10. Best Practices

- Compile and run frequently in small increments.
- Use version control (e.g. Git) even for learning projects.

## 11. Interview Points

- Describe the software development cycle (edit-compile-run-debug) and where unit testing fits in professional workflows.

## 12. Quick Revision

Development = Write -> Compile -> Run -> Test -> Debug, repeated until correct.
