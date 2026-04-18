``Integer y = 100;              // wrapper

        Account acc = new Account(); `அதாவது இதற்கு new பயன்படுத்தி object கிரியேட் செய்தால் `Account acc = new Account();` heap la store ஆகும் அதுவே `Integer y = 100; `Integer என்பது பயன்படுத்தினால்` y` stack ref ஆகவும் 100 heap ஆகவும் ஸ்டோர் ஆகிறதா?`

        நல்ல observation 🔥 — நீ சொன்னது பாதி சரி, ஆனா ஒரு **important correction** இருக்கு 👇

---

# 🔹 Short answer

👉 ✔️ `Account acc = new Account();`
➡️ object → heap ✔️
➡️ `acc` → stack reference ✔️

👉 ✔️ `Integer y = 100;`
➡️ `y` → stack reference ✔️
➡️ **100 → heapல இருக்கும் Integer object** ✔️

👉 ❗ ஆனால்:

➡️ இது **always new object இல்ல** (cache reuse ஆகலாம்)

---

# 🔹 இரண்டு case clear பண்ணலாம்

---

## ✅ Case 1: Integer (Auto-boxing)

```java
Integer y = 100;
```

👉 JVM internally:

```java
Integer y = Integer.valueOf(100);
```

---

## 🔹 Memory (100 cache range)

```text
Heap (Integer Cache):
100 → Integer object @5000

Stack:
y → 5000
```

👉 ✔️ புதிய object create ஆகாது
👉 ✔️ cacheல இருந்ததை reuse பண்ணும்

---

## ❌ Case 2: new keyword

```java
Integer y = new Integer(100);
```

👉 Memory:

```text
Heap:
new Integer object @6000

Stack:
y → 6000
```

👉 ✔️ always new object

---

# 🔹 Account example

```java
Account acc = new Account();
```

👉 Memory:

```text
Heap:
Account object @7000

Stack:
acc → 7000
```

👉 ✔️ cache இல்லை
👉 ✔️ always new object

---

# 🔴 முக்கிய difference 🔥

| Code               | Object creation   |
| ------------------ | ----------------- |
| `new Account()`    | always new object |
| `Integer y = 100`  | cache reuse       |
| `new Integer(100)` | always new object |

---

# 🔹 Important point

👉 நீ சொன்னது:

> “100 heapல store ஆகும்”

👉 ✔️ correct
👉 ❗ but:

➡️ அது **cache object ஆக இருக்கலாம்**
➡️ every time new create ஆகாது

---

# 🔹 Real-life analogy 🧠

👉 Integer cache = shared book 📘
👉 new Integer = new book வாங்குறது

---

# 🔥 Final clarity

👉 ✔️ `y` → stackல reference
👉 ✔️ Integer object → heap
👉 ✔️ small values → cache reuse

---

# 💡 One line

👉 **“Wrapper creates object in heap, but may reuse cached object instead of creating new”**

---

🔥 நீ இப்ப Java memory + optimization combine பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Why new Integer() avoid பண்ணணும் (performance + memory impact)**

இது real-world முக்கியம் 🔥
