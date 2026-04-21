சூப்பர் 🔥 — இது JVM + method call + object mutation எப்படி வேலை செய்கிறது என்பதின் core 😎
நீ கேட்ட கேள்வி ரொம்ப முக்கியம்:
**“sb reference தான் address வைத்திருக்குது… அப்ப எப்படி append logic run ஆகுது?”** 👇

---

# 🔹 Short answer

👉 `sb` address மட்டும் இல்ல
👉 அது **StringBuilder object-ஐ point பண்ணுது**

👉 `sb.append("Dan")` என்றால்:

➡️ அந்த object-ல இருக்கும் **append() method execute ஆகுது**

---

# 🔹 Step-by-step breakdown

## 🔸 1️⃣ Object creation

```java
StringBuilder sb = new StringBuilder("Dan");
```

👉 Memory:

```text
Stack:              Heap:

sb → 5000  -------> StringBuilder object
                        value = "Dan"
```

---

## 🔸 2️⃣ Method call

```java
sb.append("Dan");
```

👉 இது internally என்ன?

➡️ JVM இதைப் போல பார்க்கும்:

```text
invoke append() on object at address 5000
```

---

# 🔹 🔥 முக்கியம்

👉 `sb`:

➡️ method இல்ல ❌
➡️ object address மட்டும் ✔️

👉 actual method எங்கே?

➡️ **StringBuilder class (Metaspace)**

---

# 🔹 Execution flow

👉 JVM என்ன பண்ணும்:

1️⃣ `sb` → address (5000)
2️⃣ heapல object find பண்ணும்
3️⃣ அதன் class = StringBuilder
4️⃣ அந்த classல `append()` method கண்டுபிடிக்கும்
5️⃣ அந்த method run ஆகும்

---

# 🔹 append() என்ன செய்கிறது?

👉 Simplified:

```java
append("Dan")
```

➡️ existing value + new value

```text
"Dan" + "Dan" = "DanDan"
```

👉 object update ஆகுது 🔥

---

# 🔹 Memory after append

```text
Heap:

StringBuilder object:
value = "DanDan"
```

👉 reference change ஆகாது ❌
👉 object உள்ள data மட்டும் change ✔️

---

# 🔹 Why both sb & p affected?

```java
Person p = new Person(sb);
```

👉 memory:

```text
sb → 5000 --------\
                   \
p.name → 5000 -----/  same object
```

👉 அதனால்:

```java
sb.append("Dan");
```

➡️ same object change

---

# 🔹 இன்னொரு முக்கிய point 🔥

👉 StringBuilder:

➡️ mutable

👉 அதனால்:

➡️ same object modify ஆகும்

---

# 🔹 Real-life analogy 🧠

👉 `sb` = TV remote 📺
👉 object = TV

👉 `append()` = channel change

👉 இரண்டு remote இருந்தாலும்:

➡️ TV ஒன்று தான் ✔️

---

# 🔥 Final clarity

👉 ✔️ reference → address மட்டும்
👉 ✔️ method → classல் இருக்கும்
👉 ✔️ JVM → address மூலம் object கண்டுபிடிக்கும்
👉 ✔️ append → object data modify

---

# 💡 One line

👉 **“Method call happens on the object using the reference, not inside the reference itself”**

---

🔥 நீ இப்ப JVM execution model புரிஞ்சிக்க ஆரம்பிச்சுட்டே 😎

👉 next killer concept:

➡️ **append() internally எப்படி buffer manage பண்ணுது (performance 🔥)**
