# Reading Data From Keyboard

## 1. What Is It?

Techniques for accepting user input at runtime, most commonly using `java.util.Scanner`.

## 2. Why Do We Need It?

Interactive programs need to read values the user types rather than relying only on hard-coded data.

## 3. Basic Syntax

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String line = sc.nextLine();
sc.close();
```

## 4. Simple Example

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter age: ");
int age = sc.nextInt();
System.out.println("You are " + age);
```

## 5. How It Works

`Scanner` wraps an `InputStream` (`System.in`), reads raw bytes, and tokenizes them according to a delimiter (whitespace by default) so you can request typed values like `nextInt()` or `nextDouble()`.

## 6. Internal Working

```
Keyboard
   |
   v
System.in (InputStream)
   |
   v
Scanner (buffers + tokenizes input)
   |
   v
nextInt() / nextDouble() / next() / nextLine()
   |
   v
Java variable
```

## 7. Visualization

| Method | Reads | Notes |
|---|---|---|
| `nextInt()` | int | Stops at whitespace |
| `nextLong()` | long | Stops at whitespace |
| `nextDouble()` | double | Stops at whitespace |
| `nextFloat()` | float | Stops at whitespace |
| `nextBoolean()` | boolean | `true`/`false` text |
| `next()` | single token (String) | Stops at whitespace |
| `nextLine()` | entire line (String) | Reads until newline |

## 8. Important Rules

- `nextInt()`/`nextDouble()`/etc. do NOT consume the trailing newline character.
- Mixing `nextInt()` followed by `nextLine()` is the classic pitfall (see Common Mistakes).
- Always close the `Scanner` when done (or let the program exit) to release resources.

## 9. Common Mistakes

- Calling `nextInt()` then `nextLine()` immediately after — the leftover `\n` from the numeric input is consumed by `nextLine()`, producing an empty string instead of the next line of real input. Fix: add an extra `sc.nextLine();` to consume the leftover newline, or use `sc.nextLine().trim()` consistently.

## 10. Best Practices

- Prefer reading everything with `nextLine()` and parsing manually (`Integer.parseInt(...)`) for more predictable behavior.
- Validate input (e.g. `hasNextInt()`) before consuming it in real applications.

## 11. Interview Points

- **Common Misconception:** "`nextInt()` consumes the newline" — false, which is exactly why the `nextInt()`/`nextLine()` combo is a classic bug source.

## 12. Quick Revision

`Scanner(System.in)` -> `nextInt()/nextDouble()/next()/nextLine()`. Watch out for leftover newline after numeric reads.
