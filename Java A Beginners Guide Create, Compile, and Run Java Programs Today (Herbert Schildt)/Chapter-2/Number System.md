சூப்பர் 🔥 இப்போ நீங்க **number systems (Hex, Octal, Binary)** கிட்ட வந்துட்டீங்க — இது low-level programming + hacking + systems-க்கு மிகவும் important 💯

நான் இதை **simple Tamil + clear examples + easy tricks**ல explain பண்ணுறேன் 👇

---

# 🧠 1. Why different number systems?

👉 normally நாம் use பண்ணுவது:

✔️ Decimal (base 10)

👉 ஆனால் programming-ல்:

✔️ Binary
✔️ Octal
✔️ Hexadecimal

👉 use பண்ணுவாங்க

---

# 🔥 2. Types of number systems

---

## 🔹 1. Decimal (base 10)

👉 digits:

```text
0–9
```

👉 example:

```java
int x = 10;
```

---

## 🔹 2. Binary (base 2)

👉 digits:

```text
0, 1
```

👉 Java syntax:

```java
int x = 0b1100;
```

👉 meaning:

```text
1100₂ = 12₁₀
```

---

## 🔹 3. Octal (base 8)

👉 digits:

```text
0–7
```

👉 Java syntax:

```java
int x = 011;
```

👉 meaning:

```text
011₈ = 9₁₀
```

---

## 🔹 4. Hexadecimal (base 16)

👉 digits:

```text
0–9 + A–F
```

👉 Java syntax:

```java
int x = 0xFF;
```

👉 meaning:

```text
FF₁₆ = 255₁₀
```

---

# 🧠 3. Syntax summary (மிக முக்கியம் 🔥)

| Type    | Prefix | Example |
| ------- | ------ | ------- |
| Decimal | none   | 10      |
| Binary  | `0b`   | 0b1100  |
| Octal   | `0`    | 011     |
| Hex     | `0x`   | 0xFF    |

---

# 🔍 4. Conversion easy trick

---

## 🔹 Binary → Decimal

```text
0b1100
= 1×8 + 1×4 + 0×2 + 0×1
= 12
```

---

## 🔹 Hex → Decimal

```text
0xFF
= 15×16 + 15
= 255
```

---

## 🔹 Octal → Decimal

```text
011
= 1×8 + 1
= 9
```

---

# 🔥 5. Example program

```java
class NumberSystems {
  public static void main(String[] args) {

    int dec = 10;
    int bin = 0b1100;
    int oct = 011;
    int hex = 0xFF;

    System.out.println("Decimal: " + dec);
    System.out.println("Binary: " + bin);
    System.out.println("Octal: " + oct);
    System.out.println("Hex: " + hex);
  }
}
```

---

# 📤 Output

```text
Decimal: 10
Binary: 12
Octal: 9
Hex: 255
```

---

# 🧠 6. Why useful?

👉 பயன்படுத்தப்படும் இடங்கள்:

✔️ memory address
✔️ colors (hex → #FF0000)
✔️ bit operations
✔️ low-level systems

---

# ⚠️ Important notes

---

## 🔹 1. Leading zero = octal ⚠️

```java
int x = 011;  // NOT 11 ❌ → it's 9 ✔️
```

👉 beginners mistake 😄

---

## 🔹 2. Hex letters

```text
A = 10
B = 11
C = 12
D = 13
E = 14
F = 15
```

---

## 🔹 3. Binary support (modern Java)

```java
0b1010 ✔️
```

---

# 🔄 Real-life analogy

👉 Different languages 🗣️

👉 English (decimal)
👉 Tamil (binary 😄)

👉 meaning same, format different

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 number systems:

**“same value different representation”**

---

# 🔥 One-line

**“Java lets you write numbers in decimal, binary, octal, and hex formats”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 escape sequences (char + string special symbols 🔥) 🚀
