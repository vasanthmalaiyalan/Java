சரி 🔥 இப்போ **3.3.2 Floating-Point Types** —
👉 decimal numbers (fraction values) handle பண்ணும் முக்கிய concept 💪

நான் இதை **book style + clear + practical examples**-ஆ explain பண்ணுறேன் 👇

---

# 📘 3.3.2 Floating-Point Types – Simple Tamil

## 🔹 1. Floating-pointன்னா என்ன?

👉 Fraction (decimal) உள்ள numbers

👉 Examples:

```text id="g6r5pz"
3.14, 0.5, -10.75
```

---

# 🔹 2. Types (2 மட்டும்)

| Type   | Size    | Precision   |
| ------ | ------- | ----------- |
| float  | 4 bytes | ~6–7 digits |
| double | 8 bytes | ~15 digits  |

---

## 🔹 3. `double` (Most important 🔥)

```java id="5n1z5t"
double price = 99.99;
```

👉 default floating type

👉 அதிக precision

👉 most used

---

## 🔹 4. `float`

```java id="48izgk"
float x = 3.14F;
```

👉 less precision

👉 suffix:

```text id="ylr3lz"
F (mandatory ❗)
```

👉 இல்லனா:

```java id="d57smj"
float x = 3.14; ❌ error
```

---

# 💡 Practical Insight

```text id="o5ahf7"
90% cases → double use பண்ணு
```

👉 float → special தேவையா இருந்தா மட்டும்

---

# 🔹 5. Scientific notation

```java id="4y4hl5"
double x = 1.729E3;
```

👉 meaning:

```text id="6jbfly"
1.729 × 10³ = 1729
```

---

# 🔹 6. Default rules

```java id="k3v6an"
3.14 → double
3.14F → float
3.14D → double (optional)
```

---

# 🔹 7. Special values (Important 🔥)

👉 Floating-pointல 3 special values:

### ✔ Positive Infinity

👉 example:

```java id="o8h07v"
double x = 1.0 / 0;
```

👉 result:

```text id="3m1vop"
Infinity
```

---

### ✔ Negative Infinity

```java id="snz66g"
double x = -1.0 / 0;
```

---

### ✔ NaN (Not a Number)

```java id="6v17zw"
double x = 0.0 / 0;
```

👉 result:

```text id="p1fnnt"
NaN
```

---

# 🔹 8. NaN check ⚠️

❌ Wrong:

```java id="kq08a3"
if (x == Double.NaN)
```

👉 இது வேலை செய்யாது

---

✔ Correct:

```java id="24grhb"
if (Double.isNaN(x))
```

---

# 🔹 9. Big Problem ⚠️ (VERY IMPORTANT)

👉 Floating-point precision issue

```java id="z6ohdb"
System.out.println(2.0 - 1.1);
```

👉 Output:

```text id="gqpyh4"
0.8999999999999999 ❗
```

👉 Expected:

```text id="o7l3c0"
0.9
```

---

## 🔹 Why this happens?

👉 Computer:

```text id="v9v9f2"
Binary system use பண்ணும்
```

👉 1/10 (0.1) → exact represent ஆகாது

👉 அதனால் rounding error

---

# 🔹 10. Important Warning 💥

👉 Money calculationக்கு:

```text id="u9mbsp"
float / double use பண்ணாதே ❌
```

---

👉 Instead use:

👉 BigDecimal

👉 (later பார்க்கலாம்)

---

# 🔹 11. Hex floating (advanced 😅)

```java id="h8k0vh"
double x = 0x1.0p-3;
```

👉 rarely used

👉 skip பண்ணலாம் 👍

---

# 💡 Simple புரிதல்

```text id="0yd7c4"
Floating-point = decimal numbers + approximation
```

---

# 🔥 Real-world examples

👉 use cases:

* scientific calculations
* graphics
* physics

👉 avoid:

* banking
* finance

---

# 💬 Summary

👉 Java floating types:

✔ float (less precision)
✔ double (high precision)

👉 most use:

```text id="a8ajsr"
double
```

---

# 🚀 Final takeaway

```text id="mb1c7v"
Floating numbers → exact இல்ல, approximation தான்
```

👉 இதை புரிஞ்சா:
👉 bugs avoid பண்ணலாம் 🔥

---

## 😎 Next step

👉 3.3.3 → `char` (Unicode + characters)

👉 அது interesting topic 🔥

---

நீ readyனா
👉 next explain பண்ணலாமா? 🚀
