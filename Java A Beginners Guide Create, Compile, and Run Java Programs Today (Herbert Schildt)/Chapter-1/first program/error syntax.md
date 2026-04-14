சூப்பர் 🔥 இது real programming skill — **syntax errors handle பண்ணுவது**
இந்த concept புரிஞ்சா debugging easy ஆகிடும் 👇

---

# 🧠 Syntax Error என்றால் என்ன?

👉 Code எழுதும்போது:

❌ Java rules (syntax) தவறானால் → error

👉 Example:

```java
System.out.println("Hello")
```

👉 ❌ `;` இல்ல → error

---

# ⚙️ Compiler என்ன செய்கிறது?

👉 நீங்கள்:

```bash
javac Example.java
```

👉 Compiler:

✔️ Code check பண்ணும்
✔️ Error இருந்தா message காட்டும்

---

# ⚠️ Important point (Book சொல்றது 🔥)

👉 Compiler message:

❌ எப்போதும் correct காரணம் சொல்லாது

👉 ஏன்?

👉 Compiler guess பண்ணும் 😄

---

# 🔍 Example (Book case)

👉 Missing `{`:

```java
public static void main(String[] args)
```

👉 `{` இல்ல ❌

---

## ❗ Compiler error:

```text
';' expected
```

👉 ❌ Wrong message

👉 Real problem:

✔️ `{` missing

---

# 🧠 Why wrong message?

👉 Compiler:

👉 “எதோ syntax தவறு இருக்கு”னு தெரியும்
👉 ஆனால் exact என்னன்னு கண்டுபிடிக்க முடியாது

---

# 🔥 Important debugging rule

👉 Error line மட்டும் பார்க்காதீங்க ❌

👉 அதுக்கு மேல இருக்கும் lines-ஐ பாருங்க ✔️

---

# 🎯 Golden rules (மிக முக்கியம்)

## 🟢 Rule 1

👉 First error-ஐ focus பண்ணு

---

## 🟢 Rule 2

👉 Previous lines check பண்ணு

---

## 🟢 Rule 3

👉 Missing things check பண்ணு:

* `{ }`
* `;`
* `()`
* quotes `" "`

---

## 🟢 Rule 4

👉 Case-sensitive check

```java
main ✔️
Main ❌
```

---

# 🔄 Common mistakes

## ❌ Missing semicolon

```java
System.out.println("Hello")
```

---

## ❌ Missing braces

```java
if(x > 0)
    System.out.println("Hi")
```

---

## ❌ Typo

```java
System.out.printLn ❌
```

---

# 🧠 Real mindset

👉 Error message:

❌ blindly trust பண்ணாதீங்க

👉 Think like:

👉 “இந்த errorக்கு actual காரணம் என்ன?”

---

# 🔄 Real-life analogy

👉 Doctor report 🩺

👉 Report symptoms மட்டும் சொலும்
👉 Actual problem கண்டுபிடிக்க doctor think பண்ணுவார்

👉 Same logic 🔥

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Compiler error:

✔️ hint மட்டுமே
❌ exact answer இல்ல

---

# 🔥 One-line

**“Compiler errors are hints, not always the real cause”**

---

👉 Next 😎
நாம் practical-ஆ:
👉 5 common Java errors + எப்படி fix பண்ணுவது (real examples) பார்க்கலாமா? 🚀
