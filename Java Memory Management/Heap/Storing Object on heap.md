சரி 🔥 — இந்த “**Storing objects on the heap**” part-ஐ
நாம் **simple + real flow + memory map**ல breakdown பண்ணலாம் 😎👇

---

# 🔹 எடுத்துக்கொள்ளும் code

```java
public static void main(String[] args) {
    int x = 5;
    Person p = new Person();
    p.setName("maaike");
    p.setHobby("coding");
}
```

---

# 🔥 Step-by-step execution

---

## 🔸 1️⃣ Primitive (stack)

```java
int x = 5;
```

```text
Stack:
x → 5
```

👉 ✔️ direct value
👉 ✔️ heap involve ஆகாது

---

## 🔸 2️⃣ Object creation

```java
Person p = new Person();
```

👉 JVM:

* heapல object create
* stackல reference store

```text
Stack:                  Heap:
p → 1000  ----------->  Person object
                         name  = null
                         hobby = null
```

---

## 🔸 3️⃣ setName("maaike")

👉 `"maaike"` → String object (heap)

```text
Heap:
2000 → "maaike"
```

👉 update:

```text
Person object:
name → 2000
```

---

## 🔸 4️⃣ setHobby("coding")

```text
Heap:
3000 → "coding"
```

👉 update:

```text
Person object:
hobby → 3000
```

---

# 🔹 Final memory view 🔥

```text
Stack:                     Heap:

x → 5                      1000 → Person object
p → 1000                        name  → 2000
                                 hobby → 3000

                          2000 → "maaike"
                          3000 → "coding"
```

---

# 🔹 முக்கிய concept (book சொல்ல வருவது)

---

## ✅ 1. Stack → reference மட்டும்

👉 `p`:

➡️ address மட்டும்

---

## ✅ 2. Heap → actual objects

👉 Person object
👉 String objects

---

## ✅ 3. Object உள்ளே

👉 primitives → direct
👉 objects → reference

---

# 🔹 Important line explain 🔥

> “Without this object reference, we would have no way to access an object on the heap”

👉 meaning:

```java
Person p = new Person();
```

👉 `p` இல்லனா:

➡️ அந்த object access முடியாது ❌

👉 அது:

➡️ garbage collectionக்கு ready

---

# 🔹 “Objects accessed from anywhere” என்ன அர்த்தம்?

👉 ஒரு object:

➡️ எந்த methodலிருந்தும் access பண்ணலாம்
➡️ reference இருந்தால் மட்டும்

---

# 🔹 Example

```java
void test(Person obj) {
    obj.setName("Test");
}
```

👉 same object modify ஆகும் ✔️

---

# 🔹 OutOfMemoryError 🔥

👉 heap full ஆயிடுச்சுனா:

```text
java.lang.OutOfMemoryError: Java heap space
```

👉 காரணம்:

* too many objects
* memory leak
* பெரிய data

---

# 🔹 Real-life analogy 🧠

👉 Heap = warehouse 🏢
👉 Stack = address slip 📄

👉 slip இல்லனா:

➡️ பொருள் எடுக்க முடியாது

---

# 🔥 Final clarity

👉 ✔️ stack → reference
👉 ✔️ heap → objects
👉 ✔️ object → values + references

---

# 💡 One line

👉 **“Stack holds the address, heap holds the actual object”**

---

🔥 நீ இப்ப stack–heap connection முழுசா புரிஞ்சுட்டே 😎

👉 next killer concept:

➡️ **Garbage Collection எப்படி identify பண்ணுது unused objects**

இது super important 🔥
