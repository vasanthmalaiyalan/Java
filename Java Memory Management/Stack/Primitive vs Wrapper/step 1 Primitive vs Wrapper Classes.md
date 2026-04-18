சரி 🔥 — இது Javaல மிகவும் முக்கியமான distinction:
**Primitive vs Wrapper Classes**. அதை real example + memory view உடன் clearஆ பார்க்கலாம் 😎👇

---

# 🔹 Short idea

👉 Primitive → value directly
👉 Wrapper → object (reference)

---

# 🔹 Example code

```java id="xq7h4b"
int primitiveInt = 2;
Integer wrapperInt = 2;
```

---

# 🔹 Memory view

```text id="9m6kz1"
Stack:              Heap:
primitiveInt → 2

wrapperInt → 5000 -----> Integer object
                          value = 2
```

👉 🔥 முக்கியம்:

* primitive → direct value
* wrapper → reference + object

---

# 🔹 Why wrapper class?

👉 Primitive:

* simple
* fast
* methods இல்லை

👉 Wrapper:

* object
* methods இருக்கும்
* collectionsல use செய்ய முடியும்

---

# 🔹 Example (method usage)

```java id="qz5k1e"
Integer num = 10;
System.out.println(num.toString());
```

👉 Primitiveல இது முடியாது ❌
👉 Wrapperல முடியும் ✔️

---

# 🔹 Full comparison

| Feature | Primitive | Wrapper |
| ------- | --------- | ------- |
| Storage | Stack     | Heap    |
| Type    | value     | object  |
| Size    | small     | bigger  |
| Methods | ❌         | ✔️      |
| Null    | ❌         | ✔️      |

---

# 🔹 Auto-boxing 🔥

```java id="2p1k7w"
Integer x = 5;  // auto-boxing
```

👉 JVM internally:

```java id="8c9n3f"
Integer x = Integer.valueOf(5);
```

---

# 🔹 Unboxing

```java id="zv6b2r"
int y = x;  // unboxing
```

👉 JVM:

```java id="4t8m1s"
int y = x.intValue();
```

---

# 🔹 Important difference 🔥

```java id="v0y2c8"
Integer a = 100;
Integer b = 100;

System.out.println(a == b);  // true (cache)
```

```java id="f9k6d3"
Integer a = 200;
Integer b = 200;

System.out.println(a == b);  // false
```

👉 காரணம்:

➡️ wrapper objects heapல இருக்கும்
➡️ reference compare ஆகும்

---

# 🔹 Primitive lifetime

```java id="r3j7v9"
void test() {
    int a = 10;
}
```

👉 method முடிந்ததும்:

```text id="6y1hpt"
a → removed from stack
```

👉 ✔️ completely gone

---

# 🔹 Wrapper lifetime

```java id="8u2c5m"
void test() {
    Integer x = 10;
}
```

👉 method முடிந்ததும்:

```text id="3s7kq4"
x → removed from stack
object → heapல இருக்கும் (GC later)
```

---

# 🔹 Real-life analogy 🧠

👉 Primitive = number எழுதுற காகிதம் 📄
👉 Wrapper = object box 📦

👉 box பெரியது
👉 methods இருக்கும்

---

# 🔥 Final clarity

👉 ✔️ Primitive → stackல value
👉 ✔️ Wrapper → heapல object
👉 ✔️ stackல reference மட்டும்

---

# 💡 One line

👉 **“Primitive stores value, Wrapper stores object reference”**

---

🔥 நீ இப்ப memory model + OOP connect பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Integer cache எப்படி work ஆகுது (why 100 true, 200 false)**

இது interview favourite 🔥
