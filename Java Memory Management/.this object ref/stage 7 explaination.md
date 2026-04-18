`சரி incase இப்படி இருக்கும்போது `public static void main(String[] args) {
    Person p = new Person();
    p.setAge(25);
}` இதை இப்படி இருந்தால் `public static void main(String[] args) {
    Person p = new Person();
    Person v = new Person();
    p.setAge(25);`இப்படி இருந்தால் index 0-வில் என்ன ஸ்டோர் ஆகும்? index 0-வில் p store ஆகுமா இல்லை v store ஆகுமா?`

    சூப்பர் 🔥 — இதுதான் **“this dynamic ஆக எப்படி decide ஆகுது?”**ன்னு புரிஞ்சிக்க key question 😎

---

# 🔹 Short answer

👉 ✔️ `p.setAge(25)` call பண்ணினா
➡️ **index 0 (this) = p**

👉 ❗ `v` create பண்ணினாலும்
➡️ அது effect இல்லை (method call செய்யலையே)

---

# 🔹 Example code

```java
public static void main(String[] args) {
    Person p = new Person();
    Person v = new Person();

    p.setAge(25);
}
```

---

# 🔹 Memory flow

## 🔸 main method (stack)

```text
Stack (main):
p → Person object 1
v → Person object 2
```

---

## 🔸 Heap

```text
Heap:
Person object 1 (age = 0)
Person object 2 (age = 0)
```

---

# 🔹 Method call

```java
p.setAge(25);
```

👉 JVM internally:

```java
setAge(p, 25);
```

---

# 🔹 setAge() frame

```text
Local Variable Array:

Index   Value
0       this → p → Person object 1
1       age → 25
```

👉 🔥 முக்கியம்:

➡️ `this = p`
➡️ `v` use ஆகவே இல்ல

---

# 🔹 என்ன ஆகும் v.setAge(30) இருந்தால்?

```java
v.setAge(30);
```

👉 அப்போ:

```text
Index 0 → this → v → Person object 2
Index 1 → age → 30
```

---

# 🔹 முக்கிய rule 🔥

👉 **யாரு method call பண்ணுகிறார்களோ**
➡️ அவங்க தான் `this`

---

# 🔹 Simple rule

```text
object.method()  →  this = object
```

---

# 🔹 Real-life analogy 🧠

👉 imagine:

* p = Ram
* v = Ravi

👉 Ram பேசினா → “நான்” = Ram
👉 Ravi பேசினா → “நான்” = Ravi

👉 “நான்” (this) → caller அடிப்படையில் change ஆகும் 😎

---

# 🔥 Final clarity

👉 ❌ index 0ல p அல்லது v fixஆ இல்லை
👉 ✔️ runtimeல decide ஆகும்

👉 யார் call பண்ணுறார்களோ:

➡️ அவங்க தான் `this`

---

# 💡 One line

👉 **“this = object that calls the method (runtime decided)”**

---

🔥 நீ இப்ப JVM dynamic behavior levelக்கு வந்துட்டே 😎

👉 next killer concept:

➡️ **Multiple method calls nestedஆ இருந்தா this எப்படி behave ஆகும்?**

இது இன்னும் interesting 🔥
பாக்கலாமா?
