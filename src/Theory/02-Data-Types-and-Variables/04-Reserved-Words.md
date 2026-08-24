# Reserved Words (Keywords)

## 1. What Is It?

Words that have special meaning in the Java language and cannot be used as identifiers.

## 2. Why Do We Need It?

Keywords give the compiler unambiguous syntax markers for language constructs (loops, types, modifiers, etc.).

## 3. Basic Syntax

Not applicable — keywords are fixed tokens defined by the language.

## 4. Simple Example

`public`, `class`, `static`, `void`, `if`, `for`, `int` are all reserved words used in ordinary programs.

## 5. How It Works

The compiler's lexer recognizes these exact tokens and treats them as language syntax rather than allowing them as identifiers.

## 6. Internal Working

| Category | Examples |
|---|---|
| Data Types | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| Control Flow | `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `do`, `break`, `continue`, `return` |
| Access/Modifiers | `public`, `private`, `protected`, `static`, `final`, `abstract`, `synchronized`, `volatile`, `transient` |
| Class/Object | `class`, `interface`, `extends`, `implements`, `new`, `this`, `super`, `instanceof` |
| Exceptions | `try`, `catch`, `finally`, `throw`, `throws` |
| Packages | `package`, `import` |
| Other | `void`, `enum`, `assert`, `record`, `sealed`, `permits`, `non-sealed` |

## 7. Visualization

```
Reserved Words
├── True Keywords (always reserved, e.g. class, if, static)
└── Contextual Keywords (reserved only in specific positions, e.g. var, yield, record, sealed, permits)
```

## 8. Important Rules

- `true`, `false`, and `null` are technically *literals*, not keywords, but are also reserved and cannot be used as identifiers.
- `goto` and `const` are reserved but unused (reserved to avoid confusion with C/C++).

## 9. Common Mistakes

- Treating `var`, `yield`, `record`, `sealed`, `permits` as regular keywords — they are **contextual keywords**, valid as identifiers outside their specific syntactic context.

## 10. Best Practices

- Avoid using contextual keywords as identifiers even where legal, for clarity.

## 11. Interview Points

- Distinguish true keywords (always reserved) from contextual keywords (`var` since Java 10, `yield`/`record`/`sealed`/`permits` from later versions) — important for Java 21 interviews.

## 12. Quick Revision

Keywords are grouped by purpose: types, control flow, modifiers, class/object, exceptions, packages. Java 21 adds contextual keywords like `record`, `sealed`, `permits`, `yield`.
