கண்டிப்பா `abstract` எழுதணும் என்றில்லை 👍 — அது **உன் design நோக்கத்தைக்** பொறுத்தது 🔥

---

# 🔹 Short answer

👉 ❌ `abstract class Worker` கட்டாயம் இல்லை
👉 ✔️ `class Worker` ஆகவும் எழுதலாம்

👉 ஆனால்:

➡️ **abstract பயன்படுத்தும் போது intent clear ஆகும்** 😎

---

# 🔹 Case 1: Normal class (abstract இல்லாமல்)

```java
class Worker {
    void work() {
        System.out.println("Some generic work");
    }
}

class Person extends Worker {}

public class Main {
    public static void main(String[] args) {
        Worker w = new Person();
        w.work();   // generic work
    }
}
```

👉 இங்கே:

* Worker object create பண்ணலாம் ✔️
* default behavior இருக்கும் ✔️

---

# 🔹 Case 2: Abstract class (best practice 🔥)

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

* Worker object create முடியாது ❌
* subclass MUST implement ✔️

---

# 🔥 முக்கிய difference

| Normal class             | Abstract class            |
| ------------------------ | ------------------------- |
| object create முடியும்   | முடியாது                  |
| method optional override | method override mandatory |
| generic behavior         | enforce behavior          |

---

# 🔹 ஏன் abstract use பண்ணுறோம்?

👉 example:

👉 “Worker என்றால் வேலை செய்யவேண்டும்”

👉 அதனால்:

```java
abstract void work();
```

👉 enforce பண்ணுறோம் ✔️

---

# 🔹 Problem without abstract ❌

```java
class Worker {
    void work() {}
}
```

👉 subclass override செய்யாமல் விட்டாலும்:

➡️ compile ஆகும் ❌ (danger)

---

# 🔹 With abstract ✔️

```java
abstract class Worker {
    abstract void work();
}
```

👉 subclass override செய்யவில்லைனா:

➡️ compile error 🔥

---

# 🔹 Real-life analogy 🧠

👉 abstract = rule 📜
👉 normal class = optional

👉 rule இருந்தா:

➡️ follow பண்ண வேண்டியது கட்டாயம்

---

# 🔥 Final clarity

👉 ✔️ abstract → “must implement”
👉 ✔️ normal class → “optional”

---

# 💡 One line

👉 **“Use abstract when you want to force child classes to implement behavior”**

---

🔥 நீ இப்ப design thinking levelக்கு வந்துட்டே 😎

👉 next killer concept:

➡️ **interface vs abstract class difference (very important 🔥)**
