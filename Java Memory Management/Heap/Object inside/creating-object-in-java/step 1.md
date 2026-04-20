சரி 🔥 — இப்ப நாம **“object create ஆகும்போது heapல என்ன நடக்குது?”**ன்னு full clarityயா பார்ப்போம் 😎👇

---

# 🔹 Basic code

```java
Person p = new Person();
```

---

# 🔹 Step-by-step என்ன நடக்குது?

---

## 🔸 1️⃣ Class already load ஆகி இருக்கும்

👉 JVM:

➡️ `Person` class → **Metaspaceல இருக்கும்**

---

## 🔸 2️⃣ `new Person()` execute

👉 JVM:

* Heapல memory allocate பண்ணும்
* ஒரு **புதிய object உருவாக்கும்**

---

## 🔸 3️⃣ Default values assign

```java
private String name;
private String hobby;
```

👉 Heapல object:

```text
name  → null
hobby → null
```

---

## 🔸 4️⃣ Constructor call

👉 default constructor:

```java
Person() { }
```

👉 initialize logic run ஆகும்

---

## 🔸 5️⃣ Reference assign

👉 Stackல:

```text
p → (address of Person object)
```

---

# 🔹 Full memory view

```text
Stack:                  Heap:

p  ------------->       Person object
                         name  = null
                         hobby = null
```

---

# 🔹 Values set பண்ணும்போது

```java
p.setName("Vasanth");
p.setHobby("Coding");
```

---

## 🔸 Heap update

```text
Person object:
name  → "Vasanth"
hobby → "Coding"
```

👉 String objects:

```text
"Vasanth" → String pool (heap)
"Coding"  → String pool (heap)
```

---

# 🔹 முக்கிய புரிதல் 🔥

👉 Object = bundle of values

👉 Heapல:

* fields values இருக்கும்
* references இருக்கும்

👉 Stackல:

* object reference மட்டும்

---

# 🔹 Internal structure (simplified)

```text
[Object Header][name ref][hobby ref]
```

---

# 🔹 Real-life analogy 🧠

👉 Class = blueprint 🏗️
👉 Object = actual house 🏠

👉 `new`:

➡️ புதிய வீடு கட்டுவது

---

# 🔹 Important point

👉 ❌ class heapல இல்லை
👉 ✔️ object மட்டும் heapல

👉 ❌ `p` heapல இல்லை
👉 ✔️ `p` stackல

---

# 🔥 Final clarity

👉 ✔️ `new` → heapல object create
👉 ✔️ fields → default values
👉 ✔️ reference → stack

---

# 💡 One line

👉 **“new creates object in heap, reference points to it from stack”**

---

🔥 நீ இப்ப object creation lifecycle புரிஞ்சுட்டே 😎

👉 next killer concept:

➡️ **Constructor execution + memory allocation order (deep JVM flow)**

இது next-level 🔥
