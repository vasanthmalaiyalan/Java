சூப்பர் 🔥 இப்போ நீங்க **Escape Sequences (special characters)** கிட்ட வந்துட்டீங்க — இது strings/printing-க்கு மிகவும் முக்கியம் 💯
நான் இதை **simple Tamil + examples + why needed**ல explain பண்ணுறேன் 👇

---

# 🧠 1. Problem என்ன?

👉 சில characters direct-ஆ எழுத முடியாது

👉 Example:

```java
char ch = ''';   ❌ error
```

👉 ஏன்?

👉 `'` already Java-ல special meaning

---

# 🔥 2. Solution → Escape Sequence

👉 **Escape sequence = special character represent பண்ணும் code**

👉 format:

```text
\ + character
```

---

# 🎯 3. Common escape sequences

| Escape | Meaning         |
| ------ | --------------- |
| `\'`   | single quote    |
| `\"`   | double quote    |
| `\\`   | backslash       |
| `\n`   | new line        |
| `\t`   | tab             |
| `\r`   | carriage return |
| `\b`   | backspace       |
| `\f`   | form feed       |
| `\s`   | space           |

---

# 🔍 4. Examples

---

## 🔹 Single quote

```java
char ch = '\'';
```

👉 Output: `'`

---

## 🔹 Double quote

```java
System.out.println("He said \"Hello\"");
```

👉 Output:

```text
He said "Hello"
```

---

## 🔹 Backslash

```java
System.out.println("C:\\Users\\Java");
```

👉 Output:

```text
C:\Users\Java
```

---

## 🔹 New line

```java
System.out.println("Hello\nWorld");
```

👉 Output:

```text
Hello
World
```

---

## 🔹 Tab

```java
System.out.println("A\tB");
```

👉 Output:

```text
A    B
```

---

# 🔥 5. Special numeric escapes

---

## 🔹 Octal

```java
char ch = '\101';
```

👉 101 (octal) → 'A'

---

## 🔹 Unicode (hex)

```java
char ch = '\u0041';
```

👉 → 'A'

---

# 🧠 6. Why important?

👉 Without escape:

❌ சில characters use பண்ண முடியாது

👉 With escape:

✔️ safely represent பண்ணலாம்

---

# 🔄 Real-life analogy

👉 Secret code 🔐

👉 `\n` → “new line”

👉 code பார்த்து JVM புரியும்

---

# ⚠️ Important points

---

## 🔹 1. `\` (backslash) must use

👉 escape sequence start

---

## 🔹 2. Strings-ல use அதிகம்

```java
System.out.println("Line1\nLine2");
```

---

## 🔹 3. Character-க்கும் use பண்ணலாம்

```java
char ch = '\t';
```

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Escape sequence:

**“special characters-ஐ represent பண்ணும் backslash code”**

---

# 🔥 One-line

**“Escape sequences allow special characters to be used in Java strings and chars”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 Variables + scope (block-level rules — மிகவும் முக்கியம் 🔥) 🚀
