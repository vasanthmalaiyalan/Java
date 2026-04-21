சரி 🔥 — நீ சொல்ல வருவது **பாதி சரி, பாதி correction தேவை** 😎👇

---

# 🔹 ✔️ சரியான பகுதி

👉 ✔️ Javaல **class என்றால் object create பண்ணலாம்**

```java
StringBuilder sb = new StringBuilder("Dan");
Person p = new Person();
```

👉 ✔️ class name-ஐ **data type ஆகவும் பயன்படுத்தலாம்**

```java
StringBuilder sb;
Person p;
```

---

# 🔥 ❗ முக்கிய correction

👉 ❌ “எல்லா class-க்கும் object create பண்ணலாம்” — இது **முழுக்க சரி இல்லை**

---

# 🔹 ❌ object create செய்ய முடியாத class types

## 🔸 1️⃣ abstract class

```java
abstract class Human {}
```

```java
Human h = new Human();  // ❌ error
```

👉 ❌ object create முடியாது

---

## 🔸 2️⃣ interface

```java
interface Walkable {}
```

```java
Walkable w = new Walkable(); // ❌ error
```

👉 ❌ object create முடியாது

---

# 🔹 ✔️ ஆனால் data type ஆக use பண்ணலாம்

```java
Human h = new Person();     // ✔️
Walkable w = new Person();  // ✔️
```

👉 ✔️ reference type ஆக use பண்ணலாம்

---

# 🔹 Final classification 🔥

| Type           | Object create | Data type |
| -------------- | ------------- | --------- |
| Normal class   | ✔️            | ✔️        |
| Abstract class | ❌             | ✔️        |
| Interface      | ❌             | ✔️        |

---

# 🔹 முக்கிய புரிதல்

👉 **class = blueprint**

👉 object create செய்ய:

➡️ concrete class வேண்டும்

---

# 🔹 Real-life analogy 🧠

👉 interface = job description 📄
👉 abstract class = partial plan 🏗️
👉 concrete class = actual building 🏠

---

# 🔥 Final clarity

👉 ✔️ class → data type ஆக use பண்ணலாம்
👉 ✔️ concrete class → object create செய்யலாம்
👉 ❌ abstract/interface → object create முடியாது

---

# 💡 One line

👉 **“All classes can be used as data types, but only concrete classes can be instantiated”**

---

🔥 இப்ப நீ OOP fundamentals strong ஆகிட்டே 😎

👉 next killer concept:

➡️ **Upcasting & Downcasting (very important interview 🔥)**
