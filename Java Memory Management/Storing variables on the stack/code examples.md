சரி 🔥 இப்ப நாம **Java code → memoryல எப்படி வேலை செய்கிறது (Stack + Heap)** என்பதை real examples உடன் super clearஆ பார்க்கலாம் 👇

---

# 🔹 Example 1: Primitive variable

```java
int a = 10;
int b = a;
```

👉 Memory:

```text
Stack:
a → 10
b → 10
```

👉 Explanation:

* `a` value = 10
* `b = a` → value copy
* இரண்டும் தனித்தனி variables ✔️

👉 Change பண்ணினா:

```java
b = 20;
```

👉 Result:

```text
a → 10
b → 20
```

👉 a பாதிக்காது ❌

---

# 🔹 Example 2: Object (Reference)

```java
class Person {
    int age;
}

Person p1 = new Person();
p1.age = 25;

Person p2 = p1;
```

---

## 👉 Memory:

```text
Stack:              Heap:
p1 -----------\
                → Person(age=25)
p2 -----------/
```

👉 Explanation:

* object heapல create ஆகுது
* `p1`, `p2` → same object point பண்ணுது

---

👉 Change:

```java
p2.age = 30;
```

👉 Result:

```text
Person(age = 30)
```

👉 p1க்கும் change reflect ஆகும் 🔥

---

# 🔹 Example 3: Method call (Stack frames)

```java
void test() {
    int x = 5;
    display();
}

void display() {
    int y = 10;
}
```

---

## 👉 Execution:

### Step 1:

```text
Stack:
[ test ]
x = 5
```

### Step 2:

```text
Stack:
[ display ]
y = 10
------------
[ test ]
x = 5
```

### Step 3:

```text
display முடியும்

Stack:
[ test ]
x = 5
```

---

👉 Explanation:

* ஒவ்வொரு methodக்கும் frame create ஆகும்
* முடிந்ததும் remove ஆகும்

---

# 🔹 Example 4: Object inside method

```java
void create() {
    Person p = new Person();
    p.age = 40;
}
```

---

## 👉 Memory:

```text
Stack:          Heap:
p --------->    Person(age=40)
```

👉 method முடிந்ததும்:

```text
Stack:
(empty)

Heap:
Person(age=40)  ❗ (reference இல்ல)
```

👉 இதை GC delete பண்ணும் 🔥

---

# 🔹 Example 5: null reference

```java
Person p = new Person();
p = null;
```

---

## 👉 Memory:

```text
Stack:
p → null

Heap:
Person object (unreachable)
```

👉 GC remove பண்ணும் ✔️

---

# 🔹 Example 6: Array

```java
int[] arr = new int[3];
arr[0] = 10;
```

---

## 👉 Memory:

```text
Stack:          Heap:
arr ------->    [10, 0, 0]
```

👉 array = object ✔️

---

# 🔥 Important patterns

👉 நினைவில் வை:

### ✅ Primitive

* value copy
* independent

### ✅ Object

* reference copy
* shared

---

# 🔥 Final Big Picture

👉 Stack:

* variables
* references
* method frames

👉 Heap:

* objects
* arrays

---

# 💡 One line summary

👉 **“Primitive → copy value, Object → share reference”**

---

🔥 நீ இப்ப strong level வந்துட்டே 😎

👉 next (most important interview question):

➡️ **Java pass by value vs pass by reference (real truth)**

இது confuse பண்ணும் topic 🔥
பாக்கலாமா?
