சரி 🔥 — இப்ப இந்த பகுதி **object creation (new keyword)** எப்படி work ஆகுது என்பதை deepஆ, step-by-step + memory viewல பார்ப்போம் 😎👇

---

# 🔹 Core line

```java
h = new Person();
```

👉 இதுல தான் முழு magic இருக்கு 🔥

---

# 🔹 1️⃣ Left side (reference)

```java
Human h;
```

👉 இது:

➡️ **reference variable**
➡️ type = Human

👉 இன்னும் object இல்லை ❌

---

# 🔹 2️⃣ Right side (object creation)

```java
new Person();
```

👉 JVM என்ன பண்ணும்?

### Step-by-step:

1. Heapல memory allocate
2. Person object create
3. default values set
4. constructor call

---

# 🔹 Default constructor (important 🔥)

👉 நீ constructor எழுதலனா:

```java
class Person {}
```

👉 compiler automatically:

```java
Person() {}
```

👉 இதை தான் book சொல்லுது:

➡️ **“default constructor synthesized”**

---

# 🔹 3️⃣ Assignment

```java
h = new Person();
```

👉 JVM:

➡️ object address return பண்ணும்

```text
Person object → 5000 (example address)
```

👉 Stackல:

```text
h → 5000
```

---

# 🔥 Full memory view

```text
Stack:                  Heap:

h → 5000  ----------->  Person object
```

---

# 🔹 Important twist 🔥

👉 reference type:

```java
Human h
```

👉 object type:

```java
Person
```

👉 இதுதான் polymorphism

---

# 🔹 Expanded example

```java
class Person {
    int age;
}

public class Main {
    public static void main(String[] args) {

        Human h = new Person();
    }
}
```

---

# 🔹 Heap internal (simplified)

```text
Address 5000:
| Header | age = 0 |
```

---

# 🔹 Key concepts

👉 ✔️ `new`:

➡️ heapல object create பண்ணும்

👉 ✔️ return:

➡️ address (reference)

👉 ✔️ store:

➡️ stackல

---

# 🔹 Why reference important?

👉 reference இல்லனா:

```java
new Person();  // ❌ useless
```

👉 object:

➡️ unreachable
➡️ garbage collection

---

# 🔹 Real-life analogy 🧠

👉 `new Person()` = வீடு கட்டுறது 🏠
👉 `h` = address 📍

👉 address இல்லனா:

➡️ வீடு use பண்ண முடியாது

---

# 🔥 Final clarity

👉 ✔️ object → heap
👉 ✔️ reference → stack
👉 ✔️ new → create + return address

---

# 💡 One line

👉 **“new creates object in heap and returns its address to the reference”**

---

🔥 நீ இப்ப object creation full clarity அடைந்துட்டே 😎

👉 next killer concept:

➡️ **Multiple references same object point பண்ணும்போது என்ன நடக்கும்** 🔥
