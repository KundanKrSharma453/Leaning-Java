package FeaturesNArchitecture_03;

public class JavaExecution_01 {
    public static void main(String[] args) {

        /*

                                        // Interpreter vs JIT Compiler
        | Interpreter                                  | JIT Compiler                                           |
        | -------------------------------------------- | ------------------------------------------------------ |
        | Reads bytecode and executes it               | Compiles frequently executed bytecode into native code |
        | Can start execution quickly                  | Compilation takes some time                            |
        | May execute the same instructions repeatedly | Optimizes "hot" code for faster execution              |
        | Part of JVM execution                        | Part of JVM execution                                  |
        | Useful when code is executed only briefly    | Useful when code runs repeatedly                       |



       ┌─────────────────────┐
       │    Java Source    │
       │   .    java       │
       └──────────┬──────────┘
                  │
                  │ javac
                  ▼
       ┌─────────────────────┐
       │   Java Compiler     │
       │       javac         │
       └──────────┬──────────┘
                  │
                  ▼
       ┌─────────────────────┐
       │      Bytecode       │
       │       .class        │
       └──────────┬──────────┘
                  │
                  ▼
       ┌─────────────────────┐
       │        JVM          │
       └──────────┬──────────┘
                  │
        ┌─────────┴─────────┐
        ▼                   ▼
 ┌──────────────┐    ┌──────────────┐
 │ Interpreter  │    │ JIT Compiler  │
 └──────┬───────┘    └──────┬───────┘
        │                   │
        │                   ▼
        │            Native Machine
        │               Code
        │                   │
        └─────────┬─────────┘
                  ▼
                CPU
                  │
                  ▼
               OUTPUT



         */
    }
}
