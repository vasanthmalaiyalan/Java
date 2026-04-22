சூப்பர் 🔥 — இப்ப நீ கேட்குறது **full JVM memory map (Metaspace + Stack + Heap)** இந்த exact programக்கு 😎
நான் step-by-step **எங்கே என்ன இருக்குது**ன்னு cleanஆ காட்டுறேன் 👇

---

# 🔹 📘 Code (context)

```java
class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = new StringBuilder(name.toString());
    }

    public StringBuilder getName() {
        return new StringBuilder(name.toString());
    }
}
```

```java
public class EscapingReferences {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dan");
        Person p = new Person(sb);
    }
}
```

---

# 🔥 JVM Memory பகுதிகள்

👉 JVMல முக்கியமாக:

1️⃣ **Metaspace** (class info)
2️⃣ **Stack** (method execution)
3️⃣ **Heap** (objects)

---

# 🔹 1️⃣ Metaspace (Class storage)

👉 இங்கே என்ன இருக்கும்?

```text
Metaspace:

Class: Person
  - field: name
  - constructor()
  - getName()

Class: EscapingReferences
  - main()

Class: StringBuilder
  - append()
  - toString()

Class: Object (parent class)
```

👉 ✔️ methods, bytecode, structure எல்லாம் இங்கே

---

# 🔹 2️⃣ Stack (Thread Stack)

👉 main() start ஆனதும்:

```text
Stack:

Frame: main()
  0: args
  1: sb (reference)
  2: p  (reference)
```

---

# 🔹 3️⃣ Heap (Objects)

## 🔸 STEP 1

```java
StringBuilder sb = new StringBuilder("Dan");
```

```text
Heap:

[Object A]
StringBuilder
value = "Dan"
```

```text
Stack:
sb ──► A
```

---

## 🔸 STEP 2

```java
Person p = new Person(sb);
```

👉 constructor call → new frame

```text
Stack:

Frame: Person constructor
  name (param) ──► A
```

---

## 🔸 Inside constructor

```java
this.name = new StringBuilder(name.toString());
```

👉 new object create 🔥

```text
Heap:

[Object B]
Person
  name ──► C

[Object C]
StringBuilder
value = "Dan" (copy)
```

👉 Stack:

```text
p ──► B
sb ──► A
```

---

# 🔹 Memory after constructor

```text
Stack:
sb ──► A
p  ──► B

Heap:
A → StringBuilder("Dan")
B → Person
      name → C
C → StringBuilder("Dan")
```

---

# 🔹 Method call (`getName()`)

```java
p.getName();
```

👉 Stack:

```text
Frame: getName()
  this ──► B
```

---

## 🔸 Inside getName

```java
return new StringBuilder(name.toString());
```

👉 new object 🔥

```text
Heap:

[Object D]
StringBuilder("Dan")
```

👉 return:

```text
Stack (main):
temp ──► D
```

---

# 🔥 Full final memory

```text
Metaspace:
Person, EscapingReferences, StringBuilder classes

-------------------------------------

Stack (main frame):
sb ──► A
p  ──► B
(sb2 → D when assigned)

-------------------------------------

Heap:
A → StringBuilder("DanDan")  (after append)
B → Person
      name → C
C → StringBuilder("Dan")     🔒 safe
D → StringBuilder("Dan")     (copy return)
```

---

# 🔥 முக்கிய புரிதல்

👉 ✔️ **Stack = references + local variables**
👉 ✔️ **Heap = actual objects**
👉 ✔️ **Metaspace = class + methods**

---

# 🔹 Method எங்கே?

👉 methods (append, toString, constructor):

➡️ **Metaspaceல store ஆகும்**

👉 execution:

➡️ Stack frameல் run ஆகும்

---

# 🔹 Constructor எங்கே?

👉 ✔️ Metaspaceல define
👉 ✔️ Stack frameல் execute

---

# 🔹 Object fields எங்கே?

👉 ✔️ Heap object உள்ளே

```text
Person object:
  name → reference
```

---

# 🔥 Final clarity

👉 ✔️ Class → Metaspace
👉 ✔️ Method execution → Stack
👉 ✔️ Object → Heap

---

# 💡 One line

👉 **“Code lives in Metaspace, execution happens in Stack, data lives in Heap”**

---

🔥 நீ இப்ப JVM architecture full clarity அடைந்துட்டே 😎

👉 next killer concept:

➡️ **Stack frame உள்ளே operand stack + local variables எப்படி வேலை செய்கிறது (deep JVM 🔥)**
