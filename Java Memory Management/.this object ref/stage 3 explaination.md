## நம்ம எதற்காக setAge கிரியேட் பண்ணனும் ? direct p.age(25) என்று கால் செய்யலாமே?

நல்ல கேள்வி 🔥 — இது OOP (Object-Oriented Programming) heart தான் 😎

நேராக சொல்றேன் 👇

---

# 🔹 Short answer

👉 ❌ `p.age(25)` என்று call செய்ய முடியாது
👉 ✔️ `p.age = 25;` மட்டும் directா assign செய்ய முடியும்

---

# 🔹 ஏன் `p.age(25)` வேலை செய்யாது?

👉 காரணம்:

* `age` ஒரு **variable (field)**
* method இல்லை

👉 method call syntax:

```java
p.setAge(25);   // correct
```

👉 variable:

```java
p.age = 25;     // correct
```

👉 ❌ இது wrong:

```java
p.age(25);      // error ❌
```

---

# 🔹 அப்படின்னா ஏன் setAge method தேவை?

👉 இதுதான் real concept 🔥

---

## 🔹 1. Data control (validation)

```java id="9j1c5h"
void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}
```

👉 direct assign பண்ணினா:

```java id="m2x8q1"
p.age = -10;   // wrong value 😬
```

👉 method use பண்ணினா:

✔️ control இருக்கும்

---

## 🔹 2. Encapsulation (🔥 முக்கியம்)

👉 OOP principle:

➡️ data hide பண்ணணும்

```java id="a6z9w2"
class Person {
    private int age;

    void setAge(int age) {
        this.age = age;
    }
}
```

👉 இப்ப:

```java id="p4t2n8"
p.age = 25;   // ❌ error (private)
p.setAge(25); // ✔️ correct
```

---

## 🔹 3. Future changes easy

👉 இப்ப simple:

```java
this.age = age;
```

👉 நாளைக்கு:

```java
this.age = age + 1;
```

👉 external code change செய்ய வேண்டாம் ✔️

---

## 🔹 4. Debugging easy

👉 எல்லா changes ஒரே இடத்தில் நடக்கும்

---

# 🔹 Real-life analogy 🧠

👉 Variable direct access = open door 🚪
👉 Method access = security guard 🛡️

👉 guard check பண்ணி தான் உள்ளே விடுவான்

---

# 🔹 When direct access okay?

👉 small/simple programs:

```java id="k3n7z5"
p.age = 25;
```

👉 production code:

➡️ ❌ avoid

---

# 🔥 Final clarity

👉 `p.age(25)` ❌ (method இல்லை)
👉 `p.age = 25` ✔️ (direct access)
👉 `p.setAge(25)` ✔️ (best practice)

---

# 💡 One line

👉 **“Method = control, direct access = no control”**

---

🔥 நீ இப்ப OOP mindsetக்கு move ஆகிட்டே 😎

👉 next killer concept:

➡️ **Getter & Setter full design + real-world usage (interview ready)**

பாக்கலாமா? 🚀
