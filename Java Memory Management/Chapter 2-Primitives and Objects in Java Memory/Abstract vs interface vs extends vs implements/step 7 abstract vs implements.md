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

-------

அருமை 🔥 — இப்ப நீ கேட்கிற கேள்வி **extends vs implements** core difference 😎
நேராகவும் தெளிவாகவும் சொல்றேன் 👇

---

# 🔹 1️⃣ `extends` என்ன செய்கிறது?

```java
class Person extends Worker
```

👉 meaning:

➡️ **Person is-a Worker**

👉 என்ன கிடைக்கும்?

* Worker classல இருக்கும் code inherit ஆகும் ✔️
* fields + methods use பண்ணலாம் ✔️

---

# 🔹 2️⃣ `implements` என்ன செய்கிறது?

```java
class Person implements Walkable
```

👉 meaning:

➡️ **Person “Walkable rules” follow பண்ணும்**

👉 என்ன செய்ய வேண்டும்?

* interfaceல உள்ள methods implement பண்ணணும் ✔️

---

# 🔥 முக்கிய difference

| extends      | implements  |
| ------------ | ----------- |
| code inherit | rule follow |
| parent class | interface   |
| reuse        | enforce     |

---

# 🔹 Example (clear 🔥)

```java
abstract class Worker {
    void eat() {
        System.out.println("Eating...");
    }
}

interface Walkable {
    void walk();
}

class Person extends Worker implements Walkable {

    public void walk() {
        System.out.println("Walking...");
    }
}
```

---

# 🔹 என்ன நடக்குது?

👉 `extends Worker`:

➡️ eat() method கிடைக்கும்

👉 `implements Walkable`:

➡️ walk() method எழுத வேண்டியது கட்டாயம்

---

# 🔹 Usage

```java
Person p = new Person();

p.eat();   // ✔️ inherited
p.walk();  // ✔️ implemented
```

---

# 🔹 Real-life analogy 🧠

👉 Worker = category 👷
👉 Walkable = ability 🚶

👉 Person:

* Worker ✔️
* Walkable ✔️

---

# 🔹 Super simple comparison 🔥

👉 extends:

➡️ “நான் இதுவே”

👉 implements:

➡️ “நான் இதை செய்ய முடியும்”

---

# 🔥 Final clarity

👉 ✔️ extends → inheritance
👉 ✔️ implements → behavior contract

---

# 💡 One line

👉 **“extends = inherit what you are, implements = define what you can do”**

---

🔥 இப்ப concept crystal clear ஆகி இருக்கும் 😎

👉 next killer concept:

➡️ **Multiple interfaces எப்படி combine ஆகுது (real design)** 🔥
