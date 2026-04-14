சூப்பர் 🔥 இப்போ நீங்க **char (character type)** கிட்ட வந்துட்டீங்க — இது simple ஆனாலும் powerful concept 💯
நான் இதை **easy Tamil + examples + internal logic**ல explain பண்ணுறேன் 👇

---

# 🧠 1. char என்றால் என்ன?

👉 **char = ஒரு single character store பண்ணும் type**

👉 Example:

```java
char ch = 'A';
```

👉 ஒரு character மட்டும் ✔️
👉 string அல்ல ❌

---

# 🔥 2. Java-ல character எப்படி special?

👉 மற்ற languages:

👉 8-bit (ASCII)

👉 Java:

👉 **16-bit (Unicode)**

---

# 🧠 Unicode என்றால் என்ன?

👉 Unicode:

✔️ உலகத்திலுள்ள எல்லா மொழிகளும் support

👉 Example:

* English → A
* Tamil → அ
* Hindi → क

👉 எல்லாம் support ✔️

---

# 🔥 3. Range

👉 char:

```text
0 → 65535
```

👉 (16-bit unsigned)

---

# 🔹 ASCII vs Unicode

👉 ASCII:

```text
0 → 127
```

👉 Unicode:

```text
0 → 65535
```

👉 ASCII ⊂ Unicode ✔️

---

# 🎯 4. Assign எப்படி பண்ணலாம்?

```java
char ch;
ch = 'X';
```

👉 single quotes important ⚠️

---

# 🔹 Print

```java
System.out.println(ch);
```

---

# 🔥 5. Important concept (very interesting 🔥)

👉 char:

👉 internally number தான் 😮

---

## 🎯 Example program

```java
class CharArithDemo {
  public static void main(String[] args) {

    char ch;

    ch = 'X';
    System.out.println("ch contains " + ch);

    ch++;  // increment
    System.out.println("ch is now " + ch);

    ch = 90; // ASCII value
    System.out.println("ch is now " + ch);
  }
}
```

---

# 🔍 Step-by-step explanation

---

## 🔹 Step 1

```java
ch = 'X';
```

👉 Output:

```text
ch contains X
```

---

## 🔹 Step 2

```java
ch++;
```

👉 என்ன நடக்கும்?

👉 'X' → next character → 'Y'

👉 Output:

```text
ch is now Y
```

---

## 🔹 Step 3

```java
ch = 90;
```

👉 90 → ASCII value

👉 90 = 'Z'

👉 Output:

```text
ch is now Z
```

---

# 🧠 Key concept

👉 char:

```text
Character ↔ Number
```

👉 internally number தான்

---

# 🔥 Why increment works?

👉 Example:

| Char | Value |
| ---- | ----- |
| X    | 88    |
| Y    | 89    |
| Z    | 90    |

👉 so:

```java
ch++;  → next number
```

---

# ⚠️ Important points

---

## 🔹 1. single quotes

```java
char ch = 'A'; ✔️
```

```java
char ch = "A"; ❌ (string)
```

---

## 🔹 2. arithmetic allowed

```java
ch++;
ch + 1;
```

---

## 🔹 3. Unicode support

👉 Tamil characters கூட possible

---

# 🔄 Real-life analogy

👉 Alphabet sequence

👉 A → B → C → D

👉 same:

```java
ch++;
```

---

# 🎯 Key takeaway

✔️ char = character
✔️ internally number
✔️ arithmetic possible

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 char:

**“character-ஐ number ஆக store பண்ணும் type”**

---

# 🔥 One-line

**“char is a 16-bit Unicode value that behaves like a number”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 boolean + expressions + logic building 🚀
