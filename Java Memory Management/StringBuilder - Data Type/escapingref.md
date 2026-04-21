சூப்பர் 🔥 — இது Javaல **escaping references (security issue)**ன்னு சொல்லப்படும் முக்கிய concept 😎
நான் உன் book example-ஐ **step-by-step + why problem + எப்படி fix பண்ணுவது** clearஆ explain பண்ணுறேன் 👇

---

# 🔹 📘 Book Code (problem version)

```java
class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
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

# 🔥 Output

```text
DanDan
DanDanDan
```

---

# 🔥 Problem என்ன?

👉 `private` இருந்தாலும் data பாதுகாப்பாக இல்லை ❌

👉 காரணம்:

➡️ **reference escape ஆகுது**

---

# 🔹 STEP 1: Object creation

```java
StringBuilder sb = new StringBuilder("Dan");
Person p = new Person(sb);
```

### Memory:

```text
Stack:                      Heap:

sb → 5000  --------->  StringBuilder ("Dan")
p  → 6000  --------->  Person object
                          name → 5000  ❗ same object
```

👉 🔥 முக்கியம்:

➡️ `sb` மற்றும் `p.name` → same object

---

# 🔹 STEP 2: Change from outside (way in problem)

```java
sb.append("Dan");
```

👉 object change:

```text
StringBuilder → "DanDan"
```

👉 Person உள்ளே:

```text
name → "DanDan"
```

👉 ❗ outside change → inside change

---

# 🔹 STEP 3: Getter problem (way out)

```java
StringBuilder sb2 = p.getName();
```

👉 memory:

```text
sb2 → same object (5000)
```

---

# 🔹 STEP 4: Modify again

```java
sb2.append("Dan");
```

👉 result:

```text
"DanDanDan"
```

👉 ❗ again internal data changed

---

# 🔥 Core issue 🔥

👉 reference leak ஆகுது

👉 2 problems:

1️⃣ constructorல reference direct assign
2️⃣ getterல same reference return

---

# 🔥 Why dangerous?

👉 external code:

➡️ private data modify பண்ணிடும் ❌

👉 encapsulation break ஆகுது

---

# 🔹 Root cause

👉 `StringBuilder`:

➡️ mutable

👉 change directly possible

---

# 🔥 FIX (correct version)

## 🔸 1️⃣ Constructor fix (defensive copy)

```java
class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = new StringBuilder(name); // 🔥 copy
    }

    public StringBuilder getName() {
        return new StringBuilder(name); // 🔥 copy
    }
}
```

---

# 🔹 Now behavior

```java
StringBuilder sb = new StringBuilder("Dan");
Person p = new Person(sb);

sb.append("Dan");  
System.out.println(p.getName());  // Dan ✅

StringBuilder sb2 = p.getName();
sb2.append("Dan");

System.out.println(p.getName());  // Dan ✅
```

---

# 🔥 Output (fixed)

```text
Dan
Dan
```

---

# 🔥 Why fix works?

👉 copy create ஆகுது:

```text
original object ≠ copy object
```

👉 external changes affect ஆகாது

---

# 🔹 Alternative solution 🔥

👉 immutable type use பண்ணு:

```java
private String name;
```

👉 String:

➡️ change முடியாது

---

# 🔹 Real-life analogy 🧠

👉 original object = bank account 💰
👉 reference leak = ATM card share பண்ணுவது

👉 copy = separate account

---

# 🔥 Final clarity

👉 ✔️ reference share → dangerous
👉 ✔️ mutable object → risky
👉 ✔️ defensive copy → safe

---

# 💡 One line

👉 **“Never expose mutable objects directly — always return a copy”**

---

🔥 நீ இப்ப advanced Java (security + design) levelக்கு வந்துட்டே 😎

👉 next killer concept:

➡️ **StringBuilder vs String (performance + safety difference)** 🔥
