# Operators

## 1. What Is It?

Symbols that perform operations on one or more operands (values/variables) to produce a result.

## 2. Why Do We Need It?

Operators are how programs perform computation, comparison, and logical decision-making.

## 3. Basic Syntax

```java
result = operand1 operator operand2; // binary
result = operator operand;             // unary
```

## 4. Simple Example

```java
int result = 10 + 5 * 2; // multiplication happens first: 10 + 10 = 20
```

## 5. How It Works

Java evaluates expressions according to **operator precedence** (which operator binds first) and **associativity** (the order same-precedence operators combine), then left-to-right operand evaluation order.

## 6. Internal Working

Precedence (high to low, abbreviated):
1. Postfix `++ --`
2. Unary `++ -- + - ! ~`
3. Multiplicative `* / %`
4. Additive `+ -`
5. Relational `< > <= >=`
6. Equality `== !=`
7. Logical AND `&&`
8. Logical OR `||`
9. Ternary `?:`
10. Assignment `= += -= *= /= ...`

## 7. Visualization

```
Expression: 10 + 5 * 2
Step 1: 5 * 2 = 10   (multiplication has higher precedence)
Step 2: 10 + 10 = 20
Result: 20
```

## 8. Important Rules

- Multiplicative/additive are left-associative; assignment is right-associative.
- Parentheses always override default precedence.
- Java **always** evaluates operands left to right, regardless of operator precedence for *evaluation order* of side effects.

## 9. Common Mistakes

- Assuming operators evaluate strictly left-to-right ignoring precedence (`2 + 3 * 4` is 14, not 20).
- Overusing complex one-line expressions that are hard to read — prefer parentheses for clarity even when not required.

## 10. Best Practices

- Use parentheses to make intent explicit, even when precedence would already give the correct answer.

## 11. Interview Points

- Be able to evaluate a mixed-operator expression step-by-step and justify each step using precedence + associativity.

## 12. Quick Revision

Operator = symbol; Operand = value; Expression = combination; Precedence = order of operation types; Associativity = order among equal-precedence operators.
