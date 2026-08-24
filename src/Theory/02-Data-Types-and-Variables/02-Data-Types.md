# Data Types

## 1. What Is It?

A classification that specifies what kind of value a variable can hold and how much memory it occupies.

## 2. Why Do We Need It?

Data types let the compiler allocate the right amount of memory and catch type-mismatch errors before the program runs.

## 3. Basic Syntax

```java
byte b = 10;
int i = 1000;
double d = 3.14;
char c = 'A';
boolean flag = true;
String s = "text"; // reference type
```

## 4. Simple Example

```java
int score = 95;
double average = 88.5;
char grade = 'A';
boolean passed = true;
```

## 5. How It Works

Primitive types store actual values directly. Reference types store a reference (pointer) to an object located on the heap.

## 6. Internal Working

```
Java Data Types
├── Primitive (value stored directly)
│   ├── byte, short, int, long   (integer)
│   ├── float, double             (floating-point)
│   ├── char                       (single 16-bit Unicode character)
│   └── boolean                    (true/false)
└── Reference (stores address of object on heap)
    ├── Class
    ├── Interface
    ├── Array
    └── Enum
```

## 7. Visualization

| Type | Size | Range | Default | Example |
|---|---|---|---|---|
| byte | 8 bits | -128 to 127 | 0 | `byte b = 10;` |
| short | 16 bits | -32,768 to 32,767 | 0 | `short s = 200;` |
| int | 32 bits | ~-2.1B to 2.1B | 0 | `int i = 1000;` |
| long | 64 bits | ~-9.2×10^18 to 9.2×10^18 | 0L | `long l = 100000L;` |
| float | 32 bits | ~±3.4×10^38 (7 digit precision) | 0.0f | `float f = 1.5f;` |
| double | 64 bits | ~±1.7×10^308 (15 digit precision) | 0.0d | `double d = 1.5;` |
| char | 16 bits | 0 to 65,535 (single Unicode char) | '\u0000' | `char c = 'A';` |
| boolean | JVM-dependent (not precisely specified) | true / false | false | `boolean b = true;` |

## 8. Important Rules

- `boolean` has no defined bit size in the JVM spec — it's conceptually 1 bit but JVM-dependent in practice.
- `char` is unsigned and represents a UTF-16 code unit, not a byte.
- Reference type default value is always `null`.

## 9. Common Mistakes

- Assuming `char` is 8 bits like in C — it's 16 bits in Java.
- Using `float`/`double` for exact decimal math (e.g. currency) — leads to rounding errors; use `BigDecimal` instead.

## 10. Best Practices

- Use `int` by default for whole numbers unless you specifically need a smaller/larger range.
- Use `double` by default for decimals; only use `float` when memory is critical and precision loss is acceptable.

## 11. Interview Points

- **Common Misconception:** "`char` is 8 bits" — false, it's 16 bits (UTF-16).
- Know default values by heart — they matter for instance/static variables.

## 12. Quick Revision

8 primitives = 4 integer (byte, short, int, long) + 2 floating-point (float, double) + char + boolean. Everything else (String, arrays, classes) is a reference type.
