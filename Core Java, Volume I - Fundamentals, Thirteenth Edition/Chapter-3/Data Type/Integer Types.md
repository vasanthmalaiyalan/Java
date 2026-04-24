சரி 🔥 இப்போ **3.3.1 Integer Types** —
👉 இது numbers handle பண்ண Javaல முக்கியமான base 💪

நான் இதை **book style + clear explanation + examples**-ஆ explain பண்ணுறேன் 👇

---

# 📘 3.3.1 Integer Types – Simple Tamil

## 🔹 Integerன்னா என்ன?

👉 Fraction இல்லாத numbers

👉 Examples:

```text id="g1b7f4"
-10, 0, 25, 1000
```

👉 decimal இல்ல ❗

---

# 🔹 Java Integer Types (4 types)

## 🧱 Full Table

| Type  | Size    | Range                      |
| ----- | ------- | -------------------------- |
| byte  | 1 byte  | -128 to 127                |
| short | 2 bytes | -32,768 to 32,767          |
| int   | 4 bytes | ~ -2 billion to +2 billion |
| long  | 8 bytes | very பெரிய range           |

---

## 🔹 1. `int` (Most important 🔥)

```java id="plg0bg"
int x = 100;
```

👉 default integer type

👉 most common usage

---

## 🔹 2. `long`

```java id="zdhb3h"
long population = 8000000000L;
```

👉 very பெரிய numbers

👉 suffix:

```text id="z5xtlf"
L (important ❗)
```

---

## 🔹 3. `byte`

```java id="t08y1h"
byte b = 100;
```

👉 small numbers

👉 rarely used

---

## 🔹 4. `short`

```java id="tkx42d"
short s = 1000;
```

👉 medium size

👉 also rarely used

---

# 💡 Practical insight

👉 real-worldல:

```text id="r72w7i"
90% cases → int
big numbers → long
```

👉 byte / short → special cases மட்டும்

---

# 🔹 2. Java vs C/C++ (Important 🔥)

👉 Java:

✔ size fixed
✔ same behavior

---

👉 C/C++:

❌ size change ஆகும் (machine dependent)

👉 problem:
👉 portability issue 😓

---

👉 Java solution:

```text id="gfn0p5"
Fixed sizes → same result everywhere
```

---

# 🔹 3. Number formats

## ✔ Decimal (normal)

```java id="dq9q9s"
int x = 100;
```

---

## ✔ Hexadecimal

```java id="p55gqz"
int x = 0xCAFE;
```

👉 prefix: `0x`

---

## ✔ Octal (rare 😅)

```java id="eqogre"
int x = 010;
```

👉 இது = 8

👉 avoid பண்ணு ❗

---

## ✔ Binary

```java id="06i0s5"
int x = 0b1001;
```

👉 இது = 9

---

## ✔ Underscore (readability)

```java id="g4lj1f"
int x = 1_000_000;
```

👉 compiler ignore பண்ணும்

👉 humanக்கு easy 😄

---

# 🔹 4. Unsigned இல்லை ⚠️

👉 Java:

❌ unsigned int கிடையாது

👉 எல்லாம் signed

---

👉 workaround:

👉 special methods use பண்ணலாம்

---

# 🔹 5. Overflow concept (important 💥)

👉 range exceed பண்ணினா:

👉 value wrap ஆகும்

👉 Example:

```java id="qyzqdf"
int x = 2147483647;
x = x + 1;
```

👉 result:

```text id="brt8s7"
-2147483648 😲
```

👉 overflow

---

# 💡 Simple புரிதல்

```text id="2te18x"
Integer types = whole numbers + fixed range
```

---

# 🔥 Real-world example

👉 bank system:

* balance → int / long
  👉 population → long
  👉 file bytes → byte

---

# 💬 Summary

👉 Java integer types:

✔ 4 types
✔ fixed size
✔ platform independent

👉 most use:

```text id="iy6kju"
int + long
```

---

# 🚀 Final takeaway

```text id="vjqks2"
Correct type choose பண்ணினா → bugs avoid பண்ணலாம்
```

---

## 😎 Next step

👉 3.3.2 Floating-point types (decimal numbers)

👉 அது important (money, calculations) 🔥

---

நீ readyனா
👉 next part explain பண்ணலாமா? 🚀
