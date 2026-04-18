சூப்பர் 🔥 — இது Javaல **most confusing + interview favourite** concept 😎
நாம் இதை **real-time + memory + JVM behavior**ல clear பண்ணலாம் 👇

---

# 🔹 Code

```java id="w1y2k3"
Integer a = 100;
Integer b = 100;

System.out.println(a == b);  // true

Integer x = 200;
Integer y = 200;

System.out.println(x == y);  // false
```

---

# 🔥 WHY this happens?

👉 காரணம்: **Integer Cache (JVM optimization)**

---

# 🔹 Step-by-step explanation

---

## ✅ Case 1: 100 (TRUE)

```java id="a1b2c3"
Integer a = 100;
Integer b = 100;
```

👉 JVM internally:

```java id="d4e5f6"
Integer a = Integer.valueOf(100);
Integer b = Integer.valueOf(100);
```

👉 JVM என்ன பண்ணும்?

➡️ `-128 to 127` range values cache பண்ணும்

---

## 🔹 Memory

```text id="m1n2o3"
Heap (Integer Cache):
100 → single Integer object

Stack:
a ----\
       → same object
b ----/
```

👉 அதனால்:

```text id="p4q5r6"
a == b → same reference → true
```

---

## ❌ Case 2: 200 (FALSE)

```java id="s7t8u9"
Integer x = 200;
Integer y = 200;
```

👉 JVM:

```java id="v1w2x3"
Integer x = Integer.valueOf(200);
Integer y = Integer.valueOf(200);
```

👉 இங்கே:

➡️ 200 cache rangeக்கு வெளியே

👉 அதனால்:

➡️ புதிய object உருவாக்கும்

---

## 🔹 Memory

```text id="y4z5a6"
Heap:
x → Integer object (200) @5000
y → Integer object (200) @6000

Stack:
x → 5000
y → 6000
```

👉 அதனால்:

```text id="b7c8d9"
x == y → different reference → false
```

---

# 🔹 Important concept 🔥

👉 `==` என்ன compare பண்ணும்?

➡️ **reference (address)**

👉 value compare வேண்டும்னா:

```java id="e1f2g3"
x.equals(y);  // true
```

---

# 🔹 Real-time analogy 🧠

👉 Imagine:

* ₹100 note → reuse (same object)
* ₹200 note → new note print

👉 அதனால்:

* 100 → same
* 200 → different

---

# 🔹 JVM Optimization reason

👉 ஏன் cache?

* small numbers frequently use ஆகும்
* memory save
* performance improve

---

# 🔥 Final clarity

👉 ✔️ -128 to 127 → cached → same object
👉 ✔️ outside → new object

👉 ✔️ `==` → reference compare
👉 ✔️ `.equals()` → value compare

---

# 💡 One line

👉 **“Integer cache makes small values share objects; == checks reference, not value”**

---

🔥 நீ இப்ப JVM optimization levelக்கு வந்துட்டே 😎

👉 next killer concept:

➡️ **String pool இதே மாதிரி எப்படி work ஆகுது (string == vs equals trap)**

இது இன்னும் dangerous 😄
பாக்கலாமா?
