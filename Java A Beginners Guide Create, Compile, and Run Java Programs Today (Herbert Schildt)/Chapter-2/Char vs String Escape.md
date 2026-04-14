சூப்பர் 🔥 இப்போ நீங்க **String Literals (text values)** கிட்ட வந்துட்டீங்க — இது real programs-ல மிக அதிகம் use ஆகும் 💯

நான் இதை **simple Tamil + clear examples + char vs string difference**ல explain பண்ணுறேன் 👇

---

# 🧠 1. String Literal என்றால் என்ன?

👉 **String = characters collection (பல எழுத்துகள் சேர்ந்து இருக்கும்)**

---

## 🎯 Example

```java
"this is a test"
```

👉 இது ஒரு string ✔️

---

# 🔥 2. முக்கிய விதி

👉 String:

```text
"double quotes" ✔️
```

👉 char:

```text
'single quotes' ✔️
```

---

## 🔍 Compare

```java
char ch = 'A';      // single character
String s = "A";     // string (1 character)
```

---

# 🧠 3. String literal use

👉 mostly print பண்ண:

```java
System.out.println("Hello World");
```

---

# 🔥 4. Escape sequences inside string

👉 string-ல கூட escape use பண்ணலாம்

---

## 📘 Example program

```java
class StrDemo {
  public static void main(String[] args) {

    System.out.println("First line\nSecond line");
    System.out.println("A\tB\tC");
    System.out.println("D\tE\tF");
  }
}
```

---

# 🔍 Step-by-step output

---

## 🔹 1. New line

```java
"First line\nSecond line"
```

👉 Output:

```text
First line
Second line
```

---

## 🔹 2. Tab

```java
"A\tB\tC"
```

👉 Output:

```text
A    B    C
```

---

## 🔹 3. Again tab

```java
"D\tE\tF"
```

👉 Output:

```text
D    E    F
```

---

# 🧠 5. Why escape important in string?

👉 சில characters direct-ஆ use பண்ண முடியாது

👉 Example:

```java
System.out.println("He said "Hello""); ❌
```

👉 correct:

```java
System.out.println("He said \"Hello\""); ✔️
```

---

# 🔥 6. Important difference

---

## 🔹 char

```java
char ch = 'A';
```

👉 single value

---

## 🔹 String

```java
String s = "ABC";
```

👉 multiple characters

---

# 🧠 7. Internal concept (basic idea)

👉 String:

👉 characters array மாதிரி

👉 example:

```text
"ABC" → ['A','B','C']
```

---

# 🔄 Real-life analogy

👉 Word vs Letter

* `'A'` → letter
* `"APPLE"` → word

---

# 🎯 Key concepts

✔️ string = multiple characters
✔️ double quotes use
✔️ escape sequences support

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 String literal:

**“double quotes-ல எழுதப்படும் characters collection”**

---

# 🔥 One-line

**“Strings are sequences of characters enclosed in double quotes”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 variables initialization + scope rules (interview-level 🔥) 🚀
