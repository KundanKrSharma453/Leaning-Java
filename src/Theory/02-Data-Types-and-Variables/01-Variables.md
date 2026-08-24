# Variables

## 1. What Is It?

A variable is a named storage location in memory that holds a value of a specific data type.

## 2. Why Do We Need It?

Variables let programs store, retrieve, and manipulate data instead of hard-coding values everywhere.

## 3. Basic Syntax

```java
dataType variableName = value; // declaration + initialization
dataType variableName;         // declaration only
variableName = value;          // assignment
```

## 4. Simple Example

```java
int age = 25;
final double PI = 3.14159;
age = 26; // reassignment (allowed, not final)
```

## 5. How It Works

Declaration reserves a name and type; initialization gives it a first value; assignment (re)sets the value afterward. `final` variables can be assigned exactly once.

## 6. Internal Working

Local variables live on the **Java Stack** (per method call frame) and are not automatically initialized — the compiler forces you to assign before use. Instance variables live on the **Heap** as part of their object and get default values automatically. Static variables live in the **Method Area**, one copy per class.

## 7. Visualization

```
Java Stack (per thread)         Heap                Method Area
┌───────────────┐        ┌───────────────┐    ┌──────────────┐
│ local vars      │        │ instance vars   │    │ static vars    │
│ (method frame)  │        │ (per object)    │    │ (per class)    │
└───────────────┘        └───────────────┘    └──────────────┘
```

## 8. Important Rules

- Local variables have no default value and must be initialized before use.
- Instance/static variables get default values automatically (0, false, null, etc.).
- `final` variables can only be assigned once.

## 9. Common Mistakes

- Using a local variable before initializing it (compile-time error: "variable might not have been initialized").
- Shadowing an instance variable with a local variable of the same name and forgetting to use `this.`.

## 10. Best Practices

- Prefer the smallest necessary scope for a variable.
- Use `final` for values that should not change, improving readability and thread-safety.

## 11. Interview Points

- Explain the 3 variable categories (local, instance, static) and where each lives in memory.
- **Common Misconception:** "All variables get default values" — false; only instance and static variables do, not local variables.

## 12. Quick Revision

Local (stack, no default, method-scoped) | Instance (heap, per-object, default values) | Static (method area, per-class, default values) | `final` (assign-once).
