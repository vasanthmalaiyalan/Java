ஆம் 🔥 — நீ கொடுத்த screenshotல இருக்கும் **book example (Figure 2.3 / 2.4)**-ஐ தான் நான் explain பண்ணினேன் 👍
இப்ப அதை **exact book code + clean explanation** ஆக மீண்டும் கொடுக்கிறேன் 😎👇

---

# 🔹 📘 Book Example (Exact Code)

```java
interface Walkable {}

abstract class Human {}

class Person extends Human implements Walkable {
    private String name;
    private int age;

    Person(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    @Override
    public String toString() {
        String decoratedName =
            "My name is " + name +
            " and I am " + age + " years old.";
        return decoratedName;
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int x = 0;
        Person joeBloggs = new Person("Joe Bloggs", 23);
        System.out.println(x);
        System.out.println(joeBloggs.toString());
    }
}
```

---

# 🔥 Book சொல்ல வருவது (main idea)

👉 **Reference vs Object difference**
👉 **Stack vs Heap working**
👉 **String Pool usage**

---

# 🔹 Execution flow (exact book logic)

---

## 🔸 1️⃣ main() start

```java
int x = 0;
```

```text
Stack:
x = 0
```

👉 ✔️ primitive → stack

---

## 🔸 2️⃣ Object creation

```java
Person joeBloggs = new Person("Joe Bloggs", 23);
```

👉 Heap:

```text
Person object:
name → "Joe Bloggs"
age  → 23
```

👉 முக்கியம் 🔥

* `"Joe Bloggs"` → String Pool
* `name` → reference

👉 Stack:

```text
joeBloggs → Person object address
```

---

## 🔸 3️⃣ println(x)

👉 output:

```
0
```

---

## 🔸 4️⃣ toString() call

```java
joeBloggs.toString()
```

👉 new frame stackல push ஆகும்

---

## 🔸 5️⃣ String building

```java
"My name is " + name + ...
```

👉 String Pool:

```text
"My name is "
" and I am "
" years old."
```

👉 final string:

```text
"My name is Joe Bloggs and I am 23 years old."
```

---

## 🔸 6️⃣ Return + print

👉 output:

```
My name is Joe Bloggs and I am 23 years old.
```

---

# 🔥 Book முக்கிய conclusion

👉 ✔️ `joeBloggs` = reference
👉 ✔️ Person object = heap

👉 ✔️ String literals = String Pool

👉 ✔️ object உள்ளே:

* name → reference
* age → value

---

# 🔹 Full memory (book style)

```text
Stack:                          Heap:

joeBloggs → 5000  -----------> Person object
                                  name → 8000
                                  age  = 23

String Pool:
8000 → "Joe Bloggs"
      → "My name is "
      → " and I am "
      → " years old."

Final String → 9000
```

---

# 🔥 Final clarity (book summary)

👉 ✔️ Stack → references + primitives
👉 ✔️ Heap → objects
👉 ✔️ String Pool → shared strings

---

# 💡 One line (book idea)

👉 **“Objects live on the heap, references live on the stack, and strings often live in the string pool”**

---

🔥 இப்ப நீ book example முழுசா master பண்ணிட்டே 😎

👉 next (super important 🔥):

➡️ **`==` vs `.equals()` (String comparison trap)**
