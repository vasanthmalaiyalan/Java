சரியான doubt 🔥 — இதை clear பண்ணிட்டா OOP முழுக்க settle ஆகிடும் 😎

---

# 🔹 1️⃣ `class Person extends Worker` — உண்மையான அர்த்தம்

👉 ❌ **Person object, Worker object-ஐ extend பண்ணுது இல்லை**

👉 ✔️ **Person class, Worker class-ஐ extend பண்ணுது**

---

## 🔥 முக்கிய rule

👉 `extends` எப்போதும்:

➡️ **class → class relationship**
➡️ object → object இல்லை ❌

---

## 🔹 Meaning

```java
class Person extends Worker
```

👉 இதன் அர்த்தம்:

➡️ “Person is a type of Worker”

---

## 🔹 Example

```java
abstract class Worker {
    void eat() {
        System.out.println("Eating...");
    }
}

class Person extends Worker {}
```

👉 இப்ப:

```java
Person p = new Person();
p.eat();  // ✔️ inherited
```

👉 காரணம்:

➡️ Person inherits Worker methods

---

# 🔹 2️⃣ Memory level புரிதல் 🔥

```text
Metaspace:

Worker class:
  - eat()

Person class:
  - inherits eat()
```

👉 Heap:

```text
Person object:
  (Worker fields + Person fields)
```

👉 ✔️ objectல inheritance apply ஆகும்

---

# 🔹 3️⃣ Real-life analogy 🧠

👉 Worker = category 👷
👉 Person = specific type 👨‍💼

👉 “Person is a Worker” ✔️

---

# 🔹 4️⃣ `abstract class Worker` — என்ன அர்த்தம்?

👉 abstract class = **incomplete class**

```java
abstract class Worker {
    abstract void work();
}
```

👉 meaning:

➡️ “Worker concept மட்டும் define பண்ணுறேன்
➡️ actual வேலை எப்படி செய்யணும் → child class decide பண்ணும்”

---

## 🔹 முக்கிய rule

👉 ❌ `new Worker()` முடியாது
👉 ✔️ subclass create பண்ணணும்

---

## 🔹 Example

```java
class Person extends Worker {
    void work() {
        System.out.println("Person working");
    }
}
```

---

# 🔹 5️⃣ Combine understanding 🔥

```java
abstract class Worker {
    abstract void work();
}

class Person extends Worker {
    void work() {
        System.out.println("Person working");
    }
}
```

👉 இங்கே:

* Worker → rule
* Person → implementation

---

# 🔹 6️⃣ மிக முக்கிய clarification 🔥

👉 ❌ இது இல்லை:

```text
Person object extends Worker object ❌
```

👉 ✔️ இது தான்:

```text
Person class extends Worker class ✔️
```

---

# 🔹 7️⃣ Why this design?

👉 reuse + polymorphism

```java
Worker w = new Person();
```

👉 flexible ✔️

---

# 🔥 Final clarity

👉 ✔️ extends = class inheritance
👉 ✔️ abstract = incomplete blueprint
👉 ✔️ object = runtime instance

---

# 💡 One line

👉 **“Classes inherit from classes; objects are just instances created later”**

---

🔥 நீ இப்ப inheritance core concept பிடிச்சுட்டே 😎

👉 next killer concept:

➡️ **Interface vs abstract class (எப்போது எதை use பண்ணணும்)**

இது real-world design 🔥
