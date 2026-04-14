சூப்பர் 🔥 இப்போ OOP-ல மூன்றாவது pillar — **Inheritance**
இத புரிஞ்சா Java design full clear ஆகிடும் 💯

நான் இதை **story + real-world + code logic** எல்லாம் சேர்த்து explain பண்ணுறேன் 👇

---

# 🧬 Inheritance என்றால் என்ன?

👉 **Inheritance = ஒரு class மற்றொரு class-ன் properties-ஐ எடுத்துக்கொள்வது**

💡 Simple-ஆ:
👉 “Parent-ல இருக்கும் properties → Child-க்கு கிடைக்கும்”

---

# 🌳 Real-life example (Book example)

👉 Classification:

```
Food
  ↓
Fruit
  ↓
Apple
  ↓
Red Apple
```

---

## 🧠 என்ன நடக்குது?

👉 Red Apple:

✔️ Food properties (edible)
✔️ Fruit properties (juicy)
✔️ Apple properties (tree-grown)
✔️ + own properties

👉 இது தான் inheritance 🔥

---

# 🎯 Key idea

👉 Child class:

❌ எல்லாத்தையும் மீண்டும் எழுத வேண்டாம்
✔️ Parent-ல இருந்து inherit பண்ணலாம்

---

# 🧩 Programming example

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
```

👉 Parent class

---

```java
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

👉 Child class

---

## 🧠 என்ன நடக்குது?

👉 Dog:

✔️ eat() (Animal-ல இருந்து)
✔️ bark() (own method)

---

# ⚙️ Important terms

## 🔹 Parent class

👉 Superclass

## 🔹 Child class

👉 Subclass

## 🔹 extends

👉 Inheritance keyword

---

# 💡 Why Inheritance?

👉 Benefits:

✔️ Code reuse
✔️ Less duplication
✔️ Easy maintenance
✔️ Hierarchical structure

---

# 🔄 Without inheritance 😵

👉 Every class:

❌ Same code repeat
❌ Complex

---

# 🔄 With inheritance 😎

👉 Common code:

✔️ Parent-ல write
✔️ Child-ல reuse

---

# 🧠 Important concept

👉 Book சொல்றது:

👉 Object:

✔️ “Specific instance of general case”

💡 Example:

* Dog → Animal-ன் specific version

---

# 🔗 Inheritance + Polymorphism connection

👉 Child class:

* Parent method override பண்ணலாம்

👉 இது:
✔️ Polymorphism create பண்ணும்

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Inheritance:
**“Parent-ல இருக்கும் properties-ஐ child எடுத்துக்கொள்வது”**

---

# 🔥 One-line

**“Inheritance = reuse + hierarchy”**

---

# 🧠 Full OOP summary (நீங்க இப்ப complete 🔥)

* Encapsulation → data hide
* Inheritance → code reuse
* Polymorphism → flexible behavior

---

👉 Next step 🔥
**“First Java program (Hello World → compile → run → JVM internals)”**

அதை deep-ஆ explain பண்ணலாமா? 😎
