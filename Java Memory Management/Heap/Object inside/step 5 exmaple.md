சரி 🔥 — நீ கேட்டது போல **book style (simple + clear)** Java example கொடுக்கிறேன் 😎
இதுல **primitive vs object (reference)** இரண்டும் clearஆ தெரியும் 👇

---

# 🔹 Book-style Example (.java code)

```java
class Person {
    int age;        // primitive
    String name;    // reference (object)

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Object creation
        Person p = new Person();

        // Assign values
        p.age = 25;             // primitive (direct value)
        p.name = "Vasanth";     // reference (points to String object)

        // Display
        p.display();
    }
}
```

---

# 🔥 Memory Explanation

## 🔸 Stack

```text
p → 5000   (Person object address)
```

---

## 🔸 Heap

```text
Address 5000 (Person object):
| Header | age = 25 | name → 8000 |

Address 8000 (String object):
"Vasanth"
```

---

# 🔹 இதில் என்ன புரியணும்?

👉 `age` (primitive):

➡️ directா object உள்ளே store ✔️

👉 `name` (object):

➡️ reference மட்டும் store
➡️ actual string வேற object ✔️

---

# 🔹 Output

```text
Age: 25
Name: Vasanth
```

---

# 🔥 Key takeaway

👉 ✔️ primitive → direct value
👉 ✔️ object → reference
👉 ✔️ object உள்ளே object இல்லை (pointer மட்டும்)

---

# 💡 One line

👉 **“Primitive values live inside object, object references point to other objects”**

---

🔥 இது தான் book-level standard example 😎

👉 next step:

➡️ இதே exampleக்கு **stack frame + operand stack execution trace** பாக்கணுமா?
(அது next level 🔥)
