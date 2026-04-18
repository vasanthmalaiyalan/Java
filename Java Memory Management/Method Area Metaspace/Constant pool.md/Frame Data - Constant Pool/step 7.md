`oops பயன்படுத்தும்போது constant pool தேவைப்படாது தானே heap தானே தேவைப்படும்?`

இது ஒரு நல்ல doubt 🔥 — ஆனா “OOP use பண்ணும்போது constant pool வேண்டாம்”ன்னு நினைச்சா அது தவறு.
**Heap + Constant Pool இரண்டும் தேவை**. எப்படி என்று clearஆ பார்ப்போம் 👇

---

# 🔹 Short answer

👉 ❌ OOP வந்தால் constant pool வேண்டாம் → தவறு
👉 ✔️ OOP run ஆக **heap + constant pool இரண்டும் சேர்ந்து வேலை செய்கிறது**

---

# 🔹 இரண்டு வேறு வேறு role

## 🔸 Heap (object data)

👉 இங்கே என்ன இருக்கும்?

* object instance (`new Person()`)
* fields values (`age = 25`)

👉 Example:

```java id="k3x7f1"
Person p = new Person();
p.age = 25;
```

👉 Heap:

```text id="m7c2y8"
Person object:
age = 25
```

---

## 🔸 Constant Pool (class info + references)

👉 இங்கே என்ன இருக்கும்?

* class name (`Person`)
* method name (`setAge`)
* string (`"Age: "`)
* constants (`8.6`)
* method references

👉 இது இல்லனா:

➡️ JVMக்கு **எதை call பண்ணணும் என்று தெரியாது**

---

# 🔹 Real example (OOP + constant pool)

```java id="9p2d6s"
class Person {
    int age;

    void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
    }
}
```

---

# 🔹 இதில் என்ன நடக்குது?

## 🔸 Heap

```text id="a8h4zr"
Person object:
age = 25
```

---

## 🔸 Constant Pool

```text id="3y6wbc"
#1 = Class Person
#2 = Method setAge
#3 = Method <init>
```

---

# 🔹 முக்கிய flow 🔥

👉 `p.setAge(25)` call பண்ணும்போது:

1️⃣ JVM constant pool பார்க்கும்
➡️ `setAge` method எங்கே இருக்குனு கண்டுபிடிக்கும்

2️⃣ method call ஆகும்

3️⃣ Heapல இருக்கும் object update ஆகும்

---

# 🔴 முக்கிய point

👉 Heap மட்டும் இருந்தா:

➡️ data மட்டும் இருக்கும்
➡️ என்ன method call பண்ணணும் தெரியாது ❌

👉 Constant pool மட்டும் இருந்தா:

➡️ info இருக்கும்
➡️ actual data இல்லை ❌

👉 இரண்டும் சேர்ந்து தான் program run ஆகும் ✔️

---

# 🔹 Real-life analogy 🧠

👉 Heap = வீடு 🏠
👉 Constant Pool = address book 📘

👉 address book இல்லனா:

➡️ வீடு எங்கேன்னு தெரியாது

👉 வீடு இல்லனா:

➡️ address useless

---

# 🔥 Final clarity

👉 ✔️ OOP = heap (objects) + constant pool (references)
👉 ✔️ இரண்டும் சேர்ந்து தான் execution

---

# 💡 One line

👉 **“Heap stores objects, Constant Pool tells JVM what to use and where”**

---

🔥 நீ இப்ப JVM + OOP full connect பண்ணிட்டே 😎

👉 next killer concept:

➡️ **Dynamic linking எப்படி constant poolல இருந்து actual method resolve ஆகுது**

இது advanced 🔥
பாக்கலாமா?
