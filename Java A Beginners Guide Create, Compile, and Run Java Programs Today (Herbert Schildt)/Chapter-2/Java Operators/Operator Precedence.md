சூப்பர் 🔥 இப்ப நீ வந்திருப்பது Javaல ஒரு **மிக முக்கியமான topic — Operator Precedence**
👉 இது புரியலனா expressions எல்லாம் தவறாக calculate ஆகும் 💀
நான் இதை **simple + real examples** உடன் explain பண்ணுறேன் 👇

---

# 🧠 1. Operator Precedence என்றால் என்ன?

👉 ஒரு expressionல multiple operators இருந்தா:

```java
int x = 10 + 5 * 2;
```

👉 எந்த operation first run ஆகும்?

👉 இதை decide பண்ணுவது:

```text
Operator Precedence (priority)
```

---

# 🔥 2. Basic idea

```text
High priority → first execute
Low priority → later execute
```

---

# 🟢 3. Simple Example

```java
int x = 10 + 5 * 2;
```

👉 execution:

```text
5 * 2 = 10
10 + 10 = 20
```

👉 Output:

```text
20
```

👉 ❌ NOT:

```text
(10 + 5) * 2 = 30
```

---

# 💥 4. Important Precedence Order (Simplified)

👉 Top → Bottom

---

## 🔝 Highest

```text
++  --   (postfix)
++  --   (prefix)
!   ~    (unary)
(type cast)
```

---

## 🟡 Arithmetic

```text
*   /   %
+   -
```

---

## 🔵 Shift

```text
<<   >>   >>>
```

---

## 🟣 Comparison

```text
>   >=   <   <=
==  !=
```

---

## 🟠 Logical

```text
& 
^
|
&&
||
```

---

## 🔻 Lowest

```text
=   +=   -=   etc
```

---

# 🔥 5. Real Examples

---

## 🟢 Example 1

```java
int x = 5 + 2 * 3;
```

👉 result:

```text
2 * 3 = 6
5 + 6 = 11
```

---

## 🟢 Example 2

```java
int x = (5 + 2) * 3;
```

👉 result:

```text
7 * 3 = 21
```

👉 🔥 parentheses override precedence

---

## 🔴 Example 3 (Logical)

```java
boolean result = true || false && false;
```

👉 precedence:

```text
&& > ||
```

👉 so:

```text
false && false = false
true || false = true
```

---

## 💀 Example 4 (Tricky)

```java
int x = 10;
int y = 5;

int z = x + y * x / y;
```

👉 step:

```text
y * x = 50
50 / y = 10
x + 10 = 20
```

---

# 🔥 6. Increment tricky case

```java
int i = 5;
int x = i++ + ++i;
```

👉 step:

```text
i++ → 5 (i=6)
++i → 7
x = 5 + 7 = 12
```

---

# 🧠 7. Golden Rule

```text
Parentheses () always highest priority 🔥
```

👉 use this to avoid confusion

---

# 💥 8. Easy நினைவில் வைக்க

```text
1. () 
2. unary (++ -- ! cast)
3. * / %
4. + -
5. comparison
6. logical
7. assignment
```

---

# 🧠 9. Real-world advice

👉 professional developers:

```text
❌ complex expressions avoid
✅ parentheses use
```

---

# 💥 Final Summary

```text
Operator precedence = execution order
high → first
low → last
() → override everything
```

---

🔥 இது புரிஞ்சா நீ Java expression master 💯

---

நீ next 😎
👉 நான் உனக்கு **10 tricky precedence questions (interview level)** கொடுக்கலாமா? 🚀
