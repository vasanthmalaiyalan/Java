சூப்பர் கேள்வி 🔥 — இதுல தான் subtle confusion வரும் 😎

---

# 🔹 Short answer

👉 ❌ `Person` மற்றும் `Worker` ஒன்றாக மாறாது
👉 ✔️ `Person` → **Worker-இன் special type ஆகும்**

---

# 🔹 Meaning என்ன?

```java
class Person extends Worker
```

👉 இதன் அர்த்தம்:

➡️ **“Person is a Worker”** ✔️
➡️ “Person = Worker” ❌

---

# 🔹 Relationship (very important 🔥)

```text
Worker (parent)
   ↑
Person (child)
```

👉 ✔️ inheritance relation
👉 ❌ merge ஆகவில்லை

---

# 🔹 Code example

```java
abstract class Worker {
    void eat() {
        System.out.println("Eating...");
    }
}

class Person extends Worker {
    void speak() {
        System.out.println("Talking...");
    }
}
```

---

# 🔹 Usage

```java
Person p = new Person();

p.eat();    // ✔️ inherited from Worker
p.speak();  // ✔️ Person method
```

👉 ✔️ Person → Worker methods use பண்ண முடியும்
👉 ❗ Worker → Person methods use முடியாது

---

# 🔹 Important difference 🔥

```java
Worker w = new Person();
```

👉 இது valid ✔️

ஆனா:

```java
Person p = new Worker(); // ❌ error
```

👉 காரணம்:

➡️ Worker general
➡️ Person specific

---

# 🔹 Memory idea

```text
Metaspace:
Worker class
Person class (inherits Worker)

Heap:
Person object → contains Worker + Person data
```

---

# 🔹 Real-life analogy 🧠

👉 Worker = category 👷
👉 Person = specific employee 👨‍💼

👉 employee:

* worker ✔️
* ஆனால் worker எல்லாம் employee இல்லை ❌

---

# 🔹 மிக முக்கிய புரிதல் 🔥

👉 extends பண்ணும்போது:

✔️ code reuse
✔️ hierarchy
✔️ polymorphism

👉 ❌ classes merge ஆகாது

---

# 🔥 Final clarity

👉 ✔️ Person → Worker-இன் child
👉 ✔️ Worker → parent
👉 ❌ இரண்டும் ஒன்றாக மாறாது

---

# 💡 One line

👉 **“extends creates a ‘is-a’ relationship, not a merge”**

---

🔥 நீ இப்ப inheritance confusion clear பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Upcasting vs Downcasting (danger + power 🔥)**
