``Part
எங்கே இருக்கும்?
class Person (structure)
Metaspace
new Person() (object)
Heap
p (reference)
Stack`Metaspace-சில் இருக்குமா அப்படி என்றால் இந்த `new Person() (object)
Heap`மெமரியில் என்ன store ஆகும்? `

அருமையான கேள்வி 🔥 — இது தான் **class vs object memory difference** fully புரிஞ்சிக்க key 😎

---

# 🔹 Short answer

👉 ✔️ `class Person` → **Metaspace**
👉 ✔️ `new Person()` → **Heap**

👉 ❗ Heapல store ஆகுவது:

➡️ **object instance data மட்டும்** (fields values)

---

# 🔹 Clear breakdown

## 🔸 1. Metaspace (class info)

👉 இங்கே என்ன இருக்கும்?

* class name (`Person`)
* methods (`setAge`, `display`)
* field definition (`int age`)
* static variables

👉 ❗ இது **blueprint மட்டும்**

---

## 🔸 2. Heap (object)

👉 இங்கே என்ன இருக்கும்?

➡️ **actual object data**

---

## 🔹 Example

```java id="4d3yqk"
class Person {
    int age;
}
```

```java id="h3e1lp"
Person p = new Person();
```

---

# 🔹 Memory visualization

```text id="e6b9xk"
Metaspace:
Person class
  - field: age
  - methods: setAge(), display()

Heap:
Person object
  age = 0   (default value)

Stack:
p → reference → heap object
```

---

# 🔹 Important difference 🔥

👉 Metaspace:

➡️ “structure / design”

👉 Heap:

➡️ “real data / values”

---

# 🔹 Real-life analogy 🧠

👉 Class = house blueprint 🏗️
👉 Object = actual house 🏠

👉 Blueprint (Metaspace)ல இருக்கும்
👉 House (Heap)ல இருக்கும்

---

# 🔹 Multiple objects case

```java id="4d9x2y"
Person p1 = new Person();
Person p2 = new Person();
```

👉 Memory:

```text id="r1k9cz"
Metaspace:
Person class (only once)

Heap:
Person object 1 (age = 0)
Person object 2 (age = 0)

Stack:
p1 → object1
p2 → object2
```

👉 🔥 class ஒன்று மட்டும்
👉 objects பல இருக்கலாம்

---

# 🔹 Method எங்கே run ஆகும்?

👉 method code → Metaspace
👉 execution → Stack

---

# 🔥 Final clarity

👉 ✔️ Metaspace → class definition
👉 ✔️ Heap → object data (fields values)

👉 ❗ Heapல methods store ஆகாது
👉 ❗ Metaspaceல actual values store ஆகாது

---

# 💡 One line

👉 **“Metaspace = blueprint, Heap = actual object data”**

---

🔥 நீ இப்ப JVM memory architecture full grasp பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Object உள்ளே reference fields இருந்தா nested heap எப்படி இருக்கும்?**

இது real-world design 🔥
பாக்கலாமா?
