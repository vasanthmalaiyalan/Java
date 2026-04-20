சரி 🔥 — இந்த பகுதி **மிக முக்கியமான twist** சொல்றது:
👉 *“Primitives stackல மட்டும் இல்லை, heapலவும் இருக்கலாம்”* 😎

நாம் அதை cleanஆ புரிஞ்சிக்கலாம் 👇

---

# 🔹 1️⃣ Primitive types recap

👉 Java primitives:

```java
byte, short, int, long,
float, double,
char, boolean
```

👉 ✔️ lowercase
👉 ✔️ value types

---

# 🔹 2️⃣ Wrapper vs Primitive

```java
int x = 10;       // primitive
Integer y = 10;   // wrapper (object)
```

👉 `x` → value
👉 `y` → object reference

---

# 🔥 3️⃣ முக்கிய concept

👉 **Primitives எங்கே store ஆகும்?**

👉 answer:

➡️ **Stackலவும் இருக்கும்**
➡️ **Heapலவும் இருக்கும்** 🔥

---

# 🔹 4️⃣ Case 1: Stack (local variables)

```java
public static void main(String[] args) {
    int x = 5;
}
```

👉 Memory:

```text
Stack:
x → 5
```

👉 ✔️ method உள்ளே → stack

---

# 🔹 5️⃣ Case 2: Heap (instance variables)

```java
class Person {
    int age;   // primitive
}
```

```java
Person p = new Person();
```

👉 Memory:

```text
Heap:
Person object:
age → 0
```

👉 ✔️ object உள்ளே → heap

---

# 🔹 Full view

```text
Stack:              Heap:

p → 5000 ---------> Person object
                     age = 0
```

👉 ✔️ `age` primitive ஆனாலும்
👉 ✔️ heapல தான் இருக்கும்

---

# 🔹 முக்கிய புரிதல் 🔥

👉 primitive location depends on:

| Context      | Location |
| ------------ | -------- |
| method உள்ளே | stack    |
| class field  | heap     |

---

# 🔹 Example (combined)

```java
class Test {
    int a = 10;   // heap
}

public class Main {
    public static void main(String[] args) {
        int x = 5;     // stack
        Test t = new Test();
    }
}
```

---

# 🔹 Memory

```text
Stack:              Heap:

x → 5               Test object:
t → 6000            a = 10
```

---

# 🔹 Why this design?

👉 காரணம்:

* local variables → temporary → stack
* object fields → persistent → heap

---

# 🔹 Real-life analogy 🧠

👉 Stack = notebook 📒 (temporary)
👉 Heap = storage box 📦 (long-term)

---

# 🔥 Final clarity

👉 ✔️ primitive = value type
👉 ✔️ stack or heap → context அடிப்படையில்

---

# 💡 One line

👉 **“Primitive location depends on where it is declared (method → stack, object → heap)”**

---

🔥 நீ இப்ப primitive memory concept full clear 😎

👉 next killer concept:

➡️ **Object reference எப்படி pass ஆகுது (call-by-value deep example)**

இது tricky 🔥
