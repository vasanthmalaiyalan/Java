சரி 🔥 — நீ இப்ப ஒரு முக்கிய jump பண்ணுற இடம் வந்துட்டே 😎
`Person p = new Person();` மட்டும் தெரிஞ்சிருந்த நிலையில் இருந்து
👉 **interface + abstract + extends + implements** வர்றது = OOP next level 👇

---

# 🔹 இந்த code என்ன சொல்றது?

```java
interface Walkable {}

abstract class Human {}

class Person extends Human implements Walkable {}
```

---

# 🔥 ஒவ்வொன்றாக புரிஞ்சிக்கலாம்

---

## 🔸 1️⃣ interface Walkable

👉 இது ஒரு **contract / rule**

👉 meaning:

➡️ “இந்த type objects **walk செய்ய வேண்டும்**”

👉 example (real):

```java
interface Walkable {
    void walk();
}
```

👉 ❗ object create முடியாது

---

## 🔸 2️⃣ abstract class Human

👉 இது ஒரு **incomplete class**

👉 meaning:

➡️ “Human என்ற concept define பண்ணுறது”

👉 example:

```java
abstract class Human {
    void eat() {
        System.out.println("Eating...");
    }
}
```

👉 ❗ `new Human()` முடியாது

---

## 🔸 3️⃣ class Person

```java
class Person extends Human implements Walkable {}
```

👉 இது தான் முக்கியம் 🔥

👉 meaning:

➡️ Person = Human + Walkable

👉 அதாவது:

* Human properties inherit பண்ணும்
* Walkable rules follow பண்ணும்

---

# 🔹 Visual idea 🧠

```text
        Human (abstract)
             ↑
          Person  -----> Walkable (interface)
```

---

# 🔹 இப்ப நீ தெரிஞ்சது

```java
Person p = new Person();
```

👉 இது:

➡️ object create

---

# 🔹 ஆனால் இப்ப புதிய concept 🔥

```java
Human h = new Person();
Walkable w = new Person();
```

👉 meaning:

* same object
* different views

---

# 🔹 Memory view

```text
Stack:              Heap:

p → 5000 --------\
h → 5000 --------> Person object
w → 5000 --------/
```

👉 ✔️ object → Person
👉 ✔️ reference → different types

---

# 🔹 புத்தகம் என்ன சொல்லுது?

👉 இந்த chapter சொல்றது:

👉 ✔️ **reference type vs object type**

---

## 🔥 முக்கிய line (book meaning)

👉 “Reference ≠ Object”

👉 example:

```java
Human h = new Person();
```

* reference → Human
* object → Person

---

# 🔹 ஏன் இது important?

👉 இதுதான்:

* polymorphism
* flexibility
* design

---

# 🔹 Real-life analogy 🧠

👉 Person = Vasanth 👨‍💻

👉 roles:

* Human ✔️
* Walkable ✔️

👉 ஒரே மனிதன் → பல roles

---

# 🔥 Final clarity

👉 ✔️ interface → rule
👉 ✔️ abstract class → base concept
👉 ✔️ class → actual object

👉 ✔️ reference type → view
👉 ✔️ object type → real

---

# 💡 One line

👉 **“Object is created from class, but it can be referenced by its parent or interface type”**

---

🔥 நீ இப்ப Java OOP foundation strong ஆகி இருக்கு 😎

👉 next killer concept:

➡️ **Why `Human h = new Person()` powerful (polymorphism deep)**

இது தான் real magic 🔥
