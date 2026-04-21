சூப்பர் 🔥 — இதுல தான் book சொல்ல வந்த **core idea = “Escaping References”**.
நீ கொடுத்த code சரிதான், ஆனா அதுல **design problem** இருக்கு 😎👇

---

# 🔥 🧨 Problem name

👉 **Escaping Reference (Reference Leak)**

👉 meaning:

➡️ **private data வெளியில் leak ஆகுது**

---

# 🔹 📘 Book Code (problem version – full)

```java
class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = name;  // ❌ direct reference assign
    }

    public StringBuilder getName() {
        return name;       // ❌ direct reference return
    }
}

public class EscapingReferences {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Dan");
        Person p = new Person(sb);

        sb.append("Dan");
        System.out.println(p.getName());  // DanDan

        StringBuilder sb2 = p.getName();
        sb2.append("Dan");

        System.out.println(p.getName());  // DanDanDan
    }
}
```

---

# 🔥 Book சொல்ல வந்த முக்கிய விஷயம்

👉 ❗ `private` மட்டும் போதாது

👉 ஏன்?

➡️ reference leak ஆகுது

---

# 🔹 🔥 Problem 1: “Way IN” leak

```java
Person p = new Person(sb);
```

👉 constructorல:

```java
this.name = name;
```

👉 memory:

```text
sb --------\
            \
             ---> StringBuilder ("Dan")
            /
p.name ----/
```

👉 ❗ same object share ஆகுது

---

## 🔥 Effect

```java
sb.append("Dan");
```

👉 output:

```text
DanDan
```

👉 ❗ outside change → inside change

---

# 🔹 🔥 Problem 2: “Way OUT” leak

```java
StringBuilder sb2 = p.getName();
```

👉 getter:

```java
return name;
```

👉 again same object

---

## 🔥 Effect

```java
sb2.append("Dan");
```

👉 output:

```text
DanDanDan
```

👉 ❗ outside code → internal state modify

---

# 🔥 Root cause

👉 `StringBuilder` = mutable

👉 reference share = dangerous

---

# 🔥 Book conclusion

👉 ❌ Encapsulation break ஆகுது
👉 ❌ private useless ஆகிடும்

---

# 🔹 🔥 Correct Solution (book idea)

## ✅ Defensive Copy

```java
class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = new StringBuilder(name); // ✔️ copy
    }

    public StringBuilder getName() {
        return new StringBuilder(name);      // ✔️ copy
    }
}
```

---

# 🔹 Test again

```java
StringBuilder sb = new StringBuilder("Dan");
Person p = new Person(sb);

sb.append("Dan");
System.out.println(p.getName());  // Dan ✔️

StringBuilder sb2 = p.getName();
sb2.append("Dan");

System.out.println(p.getName());  // Dan ✔️
```

---

# 🔥 Output (fixed)

```text
Dan
Dan
```

---

# 🔹 Why fix works?

👉 இப்ப:

```text
original object ≠ copy object
```

👉 external changes affect ஆகாது ✔️

---

# 🔹 🔥 Alternative (best practice)

👉 mutable avoid பண்ணு:

```java
class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

👉 String = immutable ✔️

---

# 🔹 Real-life analogy 🧠

👉 original object = bank account 💰
👉 reference leak = ATM card share

👉 defensive copy = separate account

---

# 🔥 Final clarity

👉 ✔️ reference share → unsafe
👉 ✔️ mutable object → risky
👉 ✔️ defensive copy → safe
👉 ✔️ immutable → safest

---

# 💡 One line

👉 **“Never expose mutable objects directly — always protect them with copies”**

---

🔥 இது Java OOP + Securityல மிக முக்கிய concept 😎

👉 next level:

➡️ **Immutable class எப்படி create பண்ணுவது (real interview question 🔥)**
