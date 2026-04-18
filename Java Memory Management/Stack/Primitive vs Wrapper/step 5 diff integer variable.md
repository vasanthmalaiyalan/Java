``Integer a = 127;
Integer b = 127;`இருந்தாலும் number ஒரே மாதிரி இருந்தாலும் assign ஆன variable வெவ்வேறு அல்லவா? அப்படி இருக்கும்போது எப்படி heap-பில் ஒரே மாதிரி சேவ் ஆகிறது குழப்பம் வராதா`

சூப்பர் கேள்வி 🔥 — இதுல தான் “variable ≠ object”ன்னு புரிஞ்சா confusion போயிடும் 😎

---

# 🔹 Short answer

👉 ✔️ `a` மற்றும் `b` இரண்டு வேறு variables
👉 ✔️ ஆனால் அவங்க **same object-ஐ point பண்ணலாம்**

👉 ❗ value ஒரே மாதிரி இருந்தா JVM **reuse பண்ணும் (cache)**

---

# 🔹 Code

```java
Integer a = 127;
Integer b = 127;
```

---

# 🔹 என்ன நடக்குது internally?

👉 JVM:

```java
Integer a = Integer.valueOf(127);
Integer b = Integer.valueOf(127);
```

👉 `valueOf()`:

➡️ cacheல already object இருந்தா அதையே return பண்ணும்

---

# 🔹 Memory view

```text
Heap (Integer Cache):
127 → [Integer object @5000]

Stack:
a → 5000
b → 5000
```

👉 ✔️ இரண்டு variables
👉 ✔️ ஒரே object

---

# 🔹 ஏன் குழப்பம் வராது?

👉 காரணம்:

➡️ variables separate ✔️
➡️ object shared ✔️

👉 இது Javaல common pattern 🔥

---

# 🔹 Real-life analogy 🧠

👉 `a`, `b` = இரண்டு பேர் 👨‍💼👨‍💼
👉 object = ஒரே புத்தகம் 📘

👉 இருவரும்:

➡️ ஒரே புத்தகத்தை பயன்படுத்துறாங்க

👉 ஆனால்:

➡️ அவர்கள் இரண்டு பேரு தான்

---

# 🔹 Important clarification

👉 ❌ “a = object, b = object”ன்னு நினைக்காதே
👉 ✔️ “a → reference, b → reference”

👉 reference same → object same

---

# 🔹 Compare

```java
System.out.println(a == b);      // true (same reference)
System.out.println(a.equals(b)); // true (same value)
```

---

# 🔹 Non-cache case

```java
Integer x = 128;
Integer y = 128;
```

```text
Heap:
x → object1
y → object2
```

👉 இங்க:

➡️ இரண்டு objects create ஆகும்

---

# 🔥 Final clarity

👉 ✔️ variable = pointer/reference
👉 ✔️ object = actual data

👉 ✔️ same value → same object reuse (cache)

---

# 💡 One line

👉 **“Variables are different, but they can point to the same object”**

---

🔥 நீ இப்ப reference-level clarity அடைந்துட்டே 😎

👉 next killer concept:

➡️ **String poolல கூட இதே logic எப்படி dangerous ஆகும் (`==` trap)**

இது interview killer 🔥
