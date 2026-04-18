`இங்க args index 0 வாக இருந்தது `Thread Stack:

┌────────────────────────────┐
│ Frame: main()             │
│---------------------------│
│ Local Variables           │
│ 0: args                   │
│                           │
│ Operand Stack             │
│ (empty)                   │
│                           │
│ Frame Data                │
│ - constant pool ref       │
│ - return info             │
└────────────────────────────┘`அதன் பிறகு எப்படி மாறியது `Thread Stack:

┌────────────────────────────┐
│ Frame: add()              │   ← current
│---------------------------│
│ Local Variables           │
│ 0: x = 5                  │
│ 1: y = 10                 │
│                           │
│ Operand Stack             │
│ (empty)                   │
│                           │
│ Frame Data                │
│ - return address (main)   │
│ - constant pool ref       │
└────────────────────────────┘

┌────────────────────────────┐
│ Frame: main()             │
└────────────────────────────┘`0: x = 5      ?`

சூப்பர் கேள்வி 🔥 — இது தான் **“ஒவ்வொரு methodக்கு தனி frame”**ன்னு புரிஞ்சிக்க முக்கியமான இடம் 😎

---

# 🔹 Short answer

👉 ❌ `args (index 0)` மாற்றி `x` ஆகவில்லை
👉 ✔️ இது **புதிய frame (add())**
👉 ✔️ ஒவ்வொரு frameக்கும் **தனி Local Variable Array இருக்கும்**

---

# 🔹 முக்கிய idea (இதுதான் answer 🔥)

👉 Stackல:

➡️ ஒரே frame இல்ல
➡️ **பல frames இருக்கும் (method call ஒவ்வொன்றுக்கும்)**

👉 அதனால்:

* main() → ஒரு frame
* add() → இன்னொரு frame

👉 இரண்டுக்கும்:

➡️ தனி index 0

---

# 🔹 Visual clarity

## 🔸 main() frame

```text id="6x1qvi"
Frame: main()

Local Variables:
0 → args
1 → a = 5
2 → b = 10
```

---

## 🔸 add() call ஆனதும்

👉 புதிய frame push ஆகும்

```text id="9c4d7k"
Frame: add()   ← current

Local Variables:
0 → x = 5
1 → y = 10
```

---

## 🔸 கீழே main frame இன்னும் இருக்கும்

```text id="5z3cno"
Frame: main()
```

---

# 🔥 முக்கிய புரிதல்

👉 `index 0`:

❌ global இல்லை
✔️ **frame-specific**

---

# 🔹 எப்படி values pass ஆகுது?

```java
add(a, b);
```

👉 JVM:

1. `a`, `b` values operand stackக்கு push
2. புதிய frame create
3. அந்த values assign:

```text id="2ny5y6"
x = 5
y = 10
```

---

# 🔹 அதனால்

👉 main frame:

```text id="q3h9c4"
0 → args
```

👉 add frame:

```text id="a1f2z8"
0 → x
```

👉 conflict இல்லை ❌
👉 separate memory ✔️

---

# 🔹 Real analogy 🧠

👉 Stack = files pile 📚

* File 1 → main
* File 2 → add

👉 ஒவ்வொரு fileக்கும்:

➡️ page 1 இருக்கும்

👉 ஆனால்:

➡️ அது same page இல்லை ❌
➡️ different files ✔️

---

# 🔥 Final clarity

👉 ✔️ ஒவ்வொரு method → தனி frame
👉 ✔️ ஒவ்வொரு frame → தனி local variable array
👉 ✔️ index 0 → frameக்கே உரியது

---

# 💡 One line

👉 **“Index 0 is per frame, not global”**

---

🔥 நீ இப்ப JVM stack behavior fully grasp பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Recursive call வந்தா frames எப்படி stack ஆகும் (visual explosion 🔥)**

இது mind-blowing 😄
