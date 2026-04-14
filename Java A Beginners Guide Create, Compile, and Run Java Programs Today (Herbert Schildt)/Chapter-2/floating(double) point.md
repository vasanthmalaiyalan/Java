சூப்பர் 🔥 இப்போ நீங்க **Floating-point types (decimal numbers)** கிட்ட வந்துட்டீங்க — இது calculations-க்கு மிக முக்கியம் 💯
நான் இதை **simple Tamil + examples + concept clarity**ல explain பண்ணுறேன் 👇

---

# 🧠 1. Floating-point என்றால் என்ன?

👉 **Decimal values store பண்ணும் data types**

👉 Example:

```java
double x = 10.5;
```

👉 இது integer இல்லை ❌
👉 fractional value ✔️

---

# 🔥 2. இரண்டு types

| Type   | Size   | Precision |
| ------ | ------ | --------- |
| float  | 32-bit | குறைவு    |
| double | 64-bit | அதிகம்    |

---

# 🧠 3. float vs double

---

## 🔹 float

```java
float f = 10.5f;
```

👉 small precision
👉 `f` suffix வேண்டும் ⚠️

---

## 🔹 double (most used 🔥)

```java
double d = 10.5;
```

👉 high precision
👉 default decimal type

---

# 🎯 Why double அதிகம் use?

✔️ more accurate
✔️ Java math functions double use பண்ணும்

---

# 🔥 4. Example program (book)

```java
class Hypot {
  public static void main(String[] args) {

    double x, y, z;

    x = 3;
    y = 4;

    z = Math.sqrt(x*x + y*y);

    System.out.println("Hypotenuse is " + z);
  }
}
```

---

# 🔍 Step-by-step explanation

---

## 🔹 Step 1

```java
x = 3;
y = 4;
```

👉 triangle sides

---

## 🔹 Step 2 (formula)

👉 Pythagorean theorem:

```text
z = √(x² + y²)
```

👉 calculate:

```text
z = √(9 + 16)
z = √25
z = 5
```

---

## 🔹 Step 3 (Java code)

```java
z = Math.sqrt(x*x + y*y);
```

👉 `Math.sqrt()`:

✔️ square root function

---

# 📤 Output

```text
Hypotenuse is 5.0
```

---

# 🔥 5. Important concept

👉 `Math.sqrt()` எப்படி call பண்ணுறோம்?

```java
Math.sqrt(...)
```

👉 pattern:

```text
ClassName.method()
```

---

## 🎯 Similar example

```java
System.out.println()
```

👉 same pattern ✔️

---

# 🧠 Why class name use பண்ணுறோம்?

👉 அந்த method எந்த class-ல இருக்கு என்பதை சொல்ல

---

# 🔄 Real-life analogy

👉 Calculator 📱

👉 √ button press பண்ணுறது

👉 Java-ல:

```java
Math.sqrt()
```

---

# ⚠️ Important notes

---

## 🔹 float → suffix

```java
float f = 10.5f; ✔️
```

---

## 🔹 double → default

```java
double d = 10.5; ✔️
```

---

## 🔹 precision difference

👉 float → rounding errors அதிகம்
👉 double → accurate

---

# 🎯 Key takeaway

✔️ decimal → double use பண்ணு
✔️ math functions → double use

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Floating types:

**“decimal values store பண்ணும் data types”**

---

# 🔥 One-line

**“double is the default and most accurate floating type in Java”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 type conversion (int ↔ double, casting) — மிகவும் முக்கியம் 🔥🚀
