package DataTypesAndVariables_02;

public class DataTypes_Variables_Literals {
    public static void main(String[] args) {
        /*

                 Visual Representation

        Data Type       Variable Name    Assignment    Literal
           │                │               │            │
         [int]           [score]           [=]         [100] ;
           │                │               │            │
     What type of       Name used to     Store the     Actual
     data is stored     identify it      value         value



                       ┌─────────────────────────┐
                       │        DATA TYPES     │
                       └────────────┬────────────┘
                                   │
         ┌──────────────────────────┴──────────────────────────┐
         ▼                                               ▼
┌─────────────────┐                                   ┌─────────────────┐
│ PrimitiveTypes│                                   │ Non-Primitive  │
└────────┬────────┘                                   └────────┬────────┘
         │ (8 Built-in Types)                                  │ (References)
         ├─► Boolean: boolean                                  ├─► String
         ├─► Character: char                                   ├─► Arrays
         ├─► Integer: byte, short, int, long                   ├─► Classes
         └─► Floating-Point: float, double                     └─► Interfaces






                 | Data Type |       Memory Size | Description / Range                                         | Example Code                     | Simple Explanation                                         |
| --------- | ----------------: | ----------------------------------------------------------- | -------------------------------- | ---------------------------------------------------------- |
| `boolean` |            1 bit* | Stores `true` or `false`                                    | `boolean isJavaFun = true;`      | Used for **Yes/No** or **True/False** values               |
| `byte`    |   1 byte (8 bits) | `-128` to `127`                                             | `byte level = 5;`                | Used for **very small whole numbers**                      |
| `short`   | 2 bytes (16 bits) | `-32,768` to `32,767`                                       | `short year = 2026;`             | Used for **small whole numbers**                           |
| `int`     | 4 bytes (32 bits) | `-2,147,483,648` to `2,147,483,647`                         | `int salary = 55000;`            | **Default choice for whole numbers**                       |
| `long`    | 8 bytes (64 bits) | `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807` | `long population = 8000000000L;` | Used for **very large whole numbers**                      |
| `float`   | 4 bytes (32 bits) | Decimal values, approximately 6–7 significant digits        | `float pi = 3.14f;`              | Used for **decimal numbers** when less precision is enough |
| `double`  | 8 bytes (64 bits) | Decimal values, approximately 15–16 significant digits      | `double price = 99.99;`          | **Default choice for decimal numbers**                     |
| `char`    | 2 bytes (16 bits) | Single Unicode character                                    | `char grade = 'A';`              | Used for **one character**                                 |

         */
    }
}
