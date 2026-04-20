``Object உள்ளே:
primitives → direct value
objects → reference மட்டும்`primitives?`

சரியான கேள்வி 🔥 — இங்கே “primitives”ன்னா என்னன்னு super clear பண்ணலாம் 😎👇

---

# 🔹 Primitives என்றால் என்ன?

👉 Javaல **built-in basic data types** தான் primitives

👉 total 8 types:

```java
int, byte, short, long,
float, double,
char,
boolean
```

---

# 🔹 Example

```java
class Person {
    int age;        // primitive
    boolean active; // primitive
    String name;    // object
}
```

---

# 🔹 Memory எப்படி இருக்கும்?

```text
Heap (Person object):

| Header | age = 25 | active = true | name → 8000 |
```

👉 ✔️ `age`, `active` → direct value
👉 ✔️ `name` → reference மட்டும்

---

# 🔹 Why primitives special?

👉 Primitive values:

* small size
* fixed size
* direct storage

👉 அதனால்:

➡️ object உள்ளேயே store ஆகும் ✔️

---

# 🔹 Compare

## Primitive

```java
int age = 25;
```

```text
| age = 25 |
```

👉 ✔️ direct value

---

## Object

```java
String name = "Vasanth";
```

```text
| name → address |
```

👉 ✔️ reference

---

# 🔹 Another example

```java
class Test {
    int x = 10;
    double y = 5.5;
}
```

👉 Memory:

```text
| Header | x = 10 | y = 5.5 |
```

👉 ✔️ எல்லாம் direct values

---

# 🔹 Important difference 🔥

| Type      | Storage      |
| --------- | ------------ |
| Primitive | direct value |
| Object    | reference    |

---

# 🔹 Real-life analogy 🧠

👉 Primitive = number எழுதுறது 📄
👉 Object = address எழுதுறது 📍

---

# 🔥 Final clarity

👉 ✔️ primitives = basic values
👉 ✔️ object உள்ளே directா இருக்கும்
👉 ✔️ reference type மட்டும் pointer வைத்திருக்கும்

---

# 💡 One line

👉 **“Primitives store actual value, objects store address (reference)”**

---

🔥 நீ இப்ப Java memory model full strong ஆகிட்டே 😎

👉 next killer concept:

➡️ **Why Java only pass-by-value (even for objects)**

இது mind-blowing 🔥


