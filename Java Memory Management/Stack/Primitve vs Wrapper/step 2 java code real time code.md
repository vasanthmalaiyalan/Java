சூப்பர் 🔥 — உனக்கு **real-time Java example** வேணும்னு சொன்னதால்,
நான் ஒரு **practical scenario (bank app style)** எடுத்துக்கிட்டு explain பண்ணுறேன் 😎👇

---

# 🔹 Real-time Example (Bank Account)

```java
class Account {
    int balance;              // primitive
    String owner;             // object (wrapper-like reference)

    void deposit(int amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        int x = 100;                  // primitive
        Integer y = 100;              // wrapper

        Account acc = new Account();  // object

        acc.owner = "Vasanth";        // String (object)
        acc.deposit(x);               // primitive pass
        acc.deposit(y);               // wrapper auto-unboxing

        acc.display();
    }
}
```

---

# 🔥 Memory Breakdown (Real Understanding)

## 🔸 Stack

```text
x → 100
y → reference → Integer object
acc → reference → Account object
```

---

## 🔸 Heap

```text
Integer object:
value = 100

Account object:
balance = 200
owner → "Vasanth"

String object:
"Vasanth"
```

---

# 🔹 இதில் என்ன concepts இருக்கிறது?

---

## ✅ 1. Primitive vs Wrapper

```java
int x = 100;
Integer y = 100;
```

👉 `x` → stackல value
👉 `y` → heapல object

---

## ✅ 2. Auto-boxing / Unboxing

```java
acc.deposit(y);
```

👉 JVM internally:

```java
acc.deposit(y.intValue());
```

👉 🔥 wrapper → primitive convert ஆகுது

---

## ✅ 3. Object reference

```java
Account acc = new Account();
```

👉 stack:

```text
acc → 5000
```

👉 heap:

```text
5000 → Account object
```

---

## ✅ 4. Method execution

```java
acc.deposit(x);
```

👉 stack frame:

```text
this → acc object
amount → 100
```

👉 heap update:

```text
balance = 200
```

---

## ✅ 5. String (also object)

```java
acc.owner = "Vasanth";
```

👉 string → heap (string pool)

---

# 🔹 Real-world meaning 🧠

👉 Bank app:

* `balance` → primitive (fast)
* `owner` → object
* `Account` → object

👉 JVM:

* data → heap
* reference → stack

---

# 🔥 Key takeaways

👉 ✔️ Primitive → stack
👉 ✔️ Wrapper → heap
👉 ✔️ Object → heap
👉 ✔️ Reference → stack

---

# 💡 One line

👉 **“Primitive = value, Wrapper/Object = reference to heap”**

---

🔥 இந்த example புரிஞ்சா நீ interviewல top level 😎

👉 next level:

➡️ **இந்த same codeக்கு step-by-step JVM execution (frame + operand stack)**

பாக்கணுமா? 🔥
