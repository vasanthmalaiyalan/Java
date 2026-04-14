சூப்பர் 🔥 இது programming-ல **clean code எழுதுறதுக்கான முக்கிய habit** — indentation 💯
நான் இதை simple + clear explain பண்ணுறேன் 👇

---

# 🧠 1. Indentation என்றால் என்ன?

👉 **Indentation = code-ஐ space வைத்து align பண்ணுவது**

👉 Example:

```java
if(x > 0) {
    System.out.println(x);
}
```

👉 இங்க space use பண்ணி structure காட்டுறோம்

---

# ❗ Important point

👉 Java:

❌ indentation பார்த்து execute பண்ணாது
✔️ `{ }` பார்த்து தான் execute பண்ணும்

---

# 🎯 அப்படின்னா ஏன் use பண்ணணும்?

👉 Reason:

✔️ readability
✔️ easy debugging
✔️ clean code

---

# 🔥 2. Standard rule (மிக முக்கியம்)

👉 Rule:

👉 `{` வந்த பிறகு → indent
👉 `}` வந்ததும் → back

---

## ✔️ Correct style

```java
if(x > 0) {
    System.out.println(x);
    x = x - 1;
}
```

---

## ❌ Wrong style

```java
if(x > 0) {
System.out.println(x);
x = x - 1;
}
```

👉 read பண்ண கஷ்டம் 😵

---

# 🔄 Nested example

```java
if(x > 0) {
    if(x < 10) {
        System.out.println("Small number");
    }
}
```

👉 level-by-level indent 🔥

---

# 🧠 Why important?

👉 பெரிய program-ல:

👉 indentation இல்லனா:

❌ confusion
❌ bugs

---

# 🔄 Real-life analogy

👉 Books 📚

👉 paragraph spacing இல்லனா:

👉 படிக்க முடியாது 😄

---

# 🎯 Key rule (simple)

```text
{ → indent
} → un-indent
```

---

# ⚠️ Extra note

👉 Java free-form language:

👉 இதும் valid:

```java
if(x > 0) { System.out.println(x); }
```

👉 But ❌ bad practice

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 indentation:

**“code-ஐ அழகாகவும் புரியும்படியும் எழுதும் style”**

---

# 🔥 One-line

**“Indentation doesn’t affect execution, but it makes code readable”**

---

👉 Next 😎
நாம் real-world style பார்க்கலாம்:

👉 professional Java code எப்படி எழுதுவாங்க (clean coding rules) 🚀
