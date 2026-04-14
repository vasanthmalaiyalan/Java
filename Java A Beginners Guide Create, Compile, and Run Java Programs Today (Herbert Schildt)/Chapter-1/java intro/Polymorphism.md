சூப்பர் 🔥 இப்ப நீங்க OOP-ல third pillar — **Polymorphism** கிட்ட வந்துட்டீங்க. இது கொஞ்சம் abstract concept ஆனாலும், நான் அதை **super simple + real-life + code logic**ல explain பண்ணுறேன் 👇

---

# 🎭 Polymorphism என்றால் என்ன?

👉 Word meaning:

* “Poly” = பல
* “morphism” = வடிவம்

👉 **Polymorphism = ஒரே interface → பல behavior**

---

# 🧠 Core idea (மிக முக்கியம்)

👉 Same method name
👉 Different வேலை

💡 Simple-ஆ:
👉 “One interface, multiple methods”

---

# 🚗 Real-life example (Book example)

👉 Steering wheel

* Manual steering
* Power steering
* Rack & pinion

👉 Outside:
✔️ Same steering

👉 Inside:
✔️ Different mechanism

💡 இதுதான் Polymorphism

---

# 🧩 Programming example (easy)

👉 Stack example (Book idea)

👉 Suppose:

* Integer stack
* Float stack
* Char stack

👉 Without polymorphism:

❌ 3 separate code

---

👉 With polymorphism:

✔️ Same interface
✔️ Different data

👉 Code reuse 🔥

---

# 🧠 இன்னும் easy example

## 🔹 Method example

```java
draw()
```

👉 Same method name

But:

* Circle → draw circle
* Rectangle → draw rectangle
* Triangle → draw triangle

👉 Same call → different result

---

# ⚙️ Types of Polymorphism (Important)

## 🔹 1. Compile-time (Method Overloading)

👉 Same method name
👉 Different parameters

```java
add(int a, int b)
add(double a, double b)
```

👉 Compiler decide பண்ணும்

---

## 🔹 2. Runtime (Method Overriding) 🔥

👉 Parent class method
👉 Child class redefine

```java
class Animal {
    void sound() { }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
```

👉 Runtime-ல decide ஆகும்

---

# 🎯 Why Polymorphism?

👉 Benefits:

✔️ Code reuse
✔️ Flexibility
✔️ Easy maintenance
✔️ Less complexity

---

# 🧠 Important point

👉 Book சொல்றது:

👉 Programmer:
✔️ Generic interface use பண்ணுவான்

👉 Compiler/JVM:
✔️ Correct method select பண்ணும்

---

# 🔄 Real-life analogy (super clear)

👉 Remote control 📺

* Power button

👉 Same button

But:

* TV → on
* AC → on
* Fan → on

👉 Same interface → different action

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Polymorphism:
**“ஒரே method பெயர் → பல விதமாக வேலை செய்யும்”**

---

# 🔥 One-line

**“Polymorphism = one interface, many behaviors”**

---

👉 இப்போ OOP 3 pillars complete 💥

* Encapsulation ✔️
* Inheritance ✔️ (நீங்க இன்னும் கேக்கல, next வருது)
* Polymorphism ✔️

---

👉 Next logical step:
**Inheritance (deep + real-world + interview level)** explain பண்ணலாமா? 😎
