# Java Installation

## 1. What Is It?

The process of installing a JDK (Java Development Kit) so you can compile and run Java 21 programs on your machine.

## 2. Why Do We Need It?

Without a JDK, you cannot compile `.java` files. Only a JRE would let you *run* existing `.class` files, not develop new ones.

## 3. Basic Syntax

```bash
java -version
javac -version
```

## 4. Simple Example

After installing JDK 21:
```bash
$ java -version
java version "21" ...
$ javac -version
javac 21
```

## 5. How It Works

You download a JDK 21 distribution (e.g. Eclipse Temurin, Oracle JDK, or another OpenJDK build), install it, and add its `bin` directory to your system `PATH` so `java`/`javac` are available from any terminal.

## 6. Internal Working

Installation places the JVM, class libraries, `javac`, `java`, `jar`, `jshell`, and other tools under a JDK home directory (`JAVA_HOME`).

## 7. Visualization

```
Download JDK 21 -> Install -> Set JAVA_HOME -> Add to PATH -> Verify (java -version)
```

## 8. Important Rules

- `JAVA_HOME` should point to the JDK root, not the `bin` folder.
- Multiple JDK versions can coexist; use a version manager or update `PATH` to switch.

## 9. Common Mistakes

- Installing only a JRE and then being unable to compile code.
- Forgetting to update `PATH`, so the terminal cannot find `java`/`javac`.

## 10. Best Practices

- Use an LTS version (Java 21 is LTS) for long-term projects.
- Use a version manager (e.g. SDKMAN!, jenv) when working across multiple Java versions.

## 11. Interview Points

- Know the difference between JDK, JRE, and JVM (see JVM Architecture theory).
- Java 21 is a Long-Term Support (LTS) release.

## 12. Quick Revision

Install JDK 21 -> set `JAVA_HOME` -> add `bin` to `PATH` -> verify with `java -version` and `javac -version`.
