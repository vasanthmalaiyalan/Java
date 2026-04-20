நல்ல கேள்வி 🔥 — “abstract parent”ன்னு நான் சொன்னது என்ன, அது `interface` உடன் எப்படி relate ஆகுது என்று clear பண்ணலாம் 😎👇

---

# 🔹 1️⃣ “abstract parent” என்றால் என்ன?

👉 **abstract parent = abstract class (parent class)**

```java
abstract class Worker {
    abstract void work();
}
```

👉 இதன் அர்த்தம்:

* parent class தான்
* ஆனால் incomplete
* direct object create முடியாது ❌
* child class implement செய்யணும் ✔️

---

# 🔹 2️⃣ உன் code என்ன சொல்றது?

```java
class Person implements Walkable {
    public void walk() {
        System.out.println("Person walking");
    }
}
```

👉 இங்கே:

➡️ `Walkable` என்பது **interface**
➡️ `Person` அதை **implement** பண்ணுது

---

# 🔥 முக்கிய difference

👉 நான் முன்பு சொன்ன “abstract parent”:

```java
class Person extends Worker
```

👉 நீ இப்ப கேட்டது:

```java
class Person implements Walkable
```

---

# 🔹 3️⃣ extends vs implements

| extends       | implements                   |
| ------------- | ---------------------------- |
| class → class | class → interface            |
| inheritance   | contract follow              |
| single parent | multiple interfaces possible |

---

# 🔹 4️⃣ Interface = special abstract parent 🔥

👉 Interface-ஐ இப்படி நினைச்சுக்கலாம்:

➡️ **“100% abstract parent”**

```java
interface Walkable {
    void walk();
}
```

👉 இது:

* rule மட்டும்
* implementation இல்ல

---

# 🔹 5️⃣ Relationship

```text
Walkable (interface)
        ↑
     Person
```

👉 Person:

➡️ walk() implement பண்ணணும் ✔️

---

# 🔹 6️⃣ Full example combine 🔥

```java
abstract class Worker {
    abstract void work();
}

interface Walkable {
    void walk();
}

class Person extends Worker implements Walkable {

    void work() {
        System.out.println("Working");
    }

    public void walk() {
        System.out.println("Walking");
    }
}
```

👉 இங்கே:

* Worker → abstract parent
* Walkable → interface
* Person → இரண்டையும் follow பண்ணுது

---

# 🔹 7️⃣ Memory view

```text
Metaspace:
Worker class
Walkable interface
Person class

Heap:
Person object
```

---

# 🔥 Final clarity

👉 ✔️ abstract parent = abstract class
👉 ✔️ interface = pure contract
👉 ✔️ implements = rule follow

---

# 💡 One line

👉 **“Abstract class is a partial parent, interface is a pure rule; child class uses extends + implements”**

---

🔥 நீ இப்ப extends vs implements clarity அடைந்துட்டே 😎

👉 next killer concept:

➡️ **Why Java multiple inheritance allow பண்ணாது but interface allow பண்ணுது** 🔥
