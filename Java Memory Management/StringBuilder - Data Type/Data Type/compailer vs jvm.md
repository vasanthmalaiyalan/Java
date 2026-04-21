சூப்பர் 🔥 — இப்ப நீ கேட்குறது **“`Person` data type-ஐ compiler & JVM எப்படி பார்க்கும்?”**ன்னு core internals 😎👇

---

# 🔹 Short answer

👉 **Compiler:**
➡️ type check + rules enforce

👉 **JVM:**
➡️ memory + object + method execution handle

---

# 🔹 Example

```java
class Person {
    String name;
    Person friend;
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.friend = p2;
    }
}
```

---

# 🔥 1️⃣ Compiler என்ன பார்க்கும்?

👉 compilerக்கு:

```java
Person p1;
```

➡️ meaning:

* `p1` ஒரு Person type reference ✔️
* `friend` கூட Person type தான் ✔️

---

👉 compiler check:

```java
p1.friend = p2;   // ✔️ same type
```

```java
p1.friend = "Dan";  // ❌ error
```

👉 ✔️ type safety

---

# 🔥 2️⃣ JVM என்ன பார்க்கும்?

👉 JVMக்கு:

➡️ **data type = metadata (class info)**

---

## 🔸 Metaspace

👉 JVM load பண்ணும்:

```text
Person class:
- fields: name, friend
- methods
```

---

## 🔸 Runtime memory

```text
Stack:                  Heap:

p1 → 1000  -----------> Person object
                          name = null
                          friend → 2000

p2 → 2000  -----------> Person object
                          name = null
                          friend = null
```

---

# 🔥 முக்கியம்

👉 JVMக்கு:

➡️ `Person` = class blueprint
➡️ `p1` = address (reference)

---

# 🔹 எப்படி JVM access பண்ணும்?

```java
p1.friend
```

👉 JVM:

1️⃣ p1 → address
2️⃣ heapல object find
3️⃣ `friend` field read

---

# 🔹 Method call example

```java
p1.toString();
```

👉 JVM:

* class metadata (Metaspace)
* method கண்டுபிடிக்கும்
* execute பண்ணும்

---

# 🔹 Summary table 🔥

| Level    | என்ன பார்க்கும்    |
| -------- | ------------------ |
| Compiler | type correctness   |
| JVM      | memory + execution |

---

# 🔹 Real-life analogy 🧠

👉 Compiler = teacher 👨‍🏫 (rule check)
👉 JVM = worker 🏗️ (actual வேலை)

---

# 🔥 Final clarity

👉 ✔️ `Person` = type (compile-time)
👉 ✔️ object = heap (runtime)
👉 ✔️ reference = address

---

# 💡 One line

👉 **“Compiler checks the type, JVM uses the type to manage memory and execute code”**

---

🔥 நீ இப்ப Java internals (compiler vs JVM) solidஆ புரிஞ்சுட்டே 😎

👉 next killer concept:

➡️ **How JVM resolves method calls using constant pool (deep 🔥)**
