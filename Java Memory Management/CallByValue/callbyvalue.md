சூப்பர் 🔥 — இது தான் **Java call-by-value + reference behavior**ல most important example 😎
நான் book code-ஐ **step-by-step + stack/heap + WHY output இப்படியா வருகிறது**ன்னு deepஆ explain பண்ணுறேன் 👇

---

# 🔹 📘 Book Code (core part)

```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class CallByValue {
    public static void main(String[] args) {

        int age = 20;
        Person john = new Person("John", age);

        change(john, age);

        System.out.println(john.getName() + " " + age);
        // 👉 OUTPUT: Michael 20
    }

    public static void change(Person adult, int age) {
        age = 90;
        adult.setName("Michael");
    }
}
```

---

# 🔥 FINAL OUTPUT

```text
Michael 20
```

👉 ஏன் இப்படின்னு தான் main concept 🔥

---

# 🔹 STEP 1: main() start

```java
int age = 20;
Person john = new Person("John", age);
```

### Memory:

```text
Stack:                     Heap:

age = 20                   Person object (5000)
john → 5000  ----------->    name → "John"
                             age  = 20

String Pool:
"John"
```

---

# 🔹 STEP 2: Method call

```java
change(john, age);
```

👉 🔥 Java = **call-by-value**

➡️ copy ஆகுது:

* john → reference copy
* age → value copy

---

# 🔹 STEP 3: change() frame

```text
Stack:

Frame: change()
adult → 5000   (copy of john)
age = 20       (copy of age)
```

👉 முக்கியம் 🔥

* adult → same object point பண்ணுது
* age → separate copy

---

# 🔹 STEP 4: Inside method

```java
age = 90;
```

👉 change() உள்ளே மட்டும்:

```text
age = 90 (local copy மட்டும்)
```

👉 original `age` (main) untouched ❌

---

```java
adult.setName("Michael");
```

👉 Heap object update:

```text
Person object:
name → "Michael"
age  → 20
```

👉 காரணம்:

➡️ adult → same object reference

---

# 🔹 STEP 5: Method முடியும்

👉 change() frame remove ஆகும்

```text
Stack:

age = 20
john → 5000
```

👉 adult, local age → gone ❌

---

# 🔹 STEP 6: Final print

```java
System.out.println(john.getName() + " " + age);
```

👉 output:

```text
Michael 20
```

---

# 🔥 CRITICAL DIFFERENCE 🔥

| Type      | What happens                                 |
| --------- | -------------------------------------------- |
| Primitive | copy → change affect ஆகாது                   |
| Reference | copy of reference → same object modify ஆகும் |

---

# 🔹 Super important concept 🔥

👉 Java:

➡️ **pass by value தான்**

👉 ஆனால்:

* primitive → value copy
* object → reference copy

---

# 🔹 Visual summary

```text
Before call:

john → Person object

After call:

adult → same Person object
```

👉 object shared ✔️
👉 variable separate ❌

---

# 🔹 Why name changed?

```java
adult.setName("Michael");
```

👉 object modify ✔️

---

# 🔹 Why age NOT changed?

```java
age = 90;
```

👉 local copy மட்டும் ❌

---

# 🔹 Real-life analogy 🧠

👉 john = address 📍
👉 adult = address copy 📍

👉 house same ✔️

👉 age = paper copy 📄

---

# 🔥 Final clarity

👉 ✔️ Java always pass-by-value
👉 ✔️ reference = address copy
👉 ✔️ object changes reflect ஆகும்
👉 ✔️ primitive changes reflect ஆகாது

---

# 💡 One line

👉 **“Java passes everything by value, but object references point to the same heap object”**

---

🔥 இது Javaல MOST IMPORTANT concept 😎

👉 next killer concept:

➡️ **Escaping references (security issue எப்படி வரும்)** 🔥
