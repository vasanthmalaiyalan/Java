`ஏன் `p.setAge(25) call பண்ணும்போது:
1️⃣ JVM constant pool பார்க்கும்
➡️ setAge method எங்கே இருக்குனு கண்டுபிடிக்கும்
2️⃣ method call ஆகும்
3️⃣ Heapல இருக்கும் object update ஆகும்`why constant pool பார்த்து தான் கண்டுபிடிக்கணுமா? `p.setAge`இதில் இருக்கும் p உள்ளே heap object reference உள்ளது பிறகு ஏன்?`

சூப்பர் கேள்வி 🔥 — இதுதான் JVM internalsல **big confusion point** 😎
நீ கேட்டது: *“p இருக்கே, அதுல object reference இருக்கே… அப்புறம் ஏன் constant pool?”* 👇

---

# 🔹 Short answer

👉 ✔️ `p` → object address மட்டும் தரும்
👉 ❌ எந்த method call பண்ணணும் என்பதை சொல்லாது

👉 ✔️ **method info → constant poolல தான் இருக்கும்**

---

# 🔹 முக்கிய idea

👉 இரண்டு வேறு விஷயம்:

| விஷயம்                 | எங்கே?        | என்ன role?   |
| ---------------------- | ------------- | ------------ |
| Object (`p`)           | Heap          | data மட்டும் |
| Method info (`setAge`) | Constant Pool | behavior     |

---

# 🔹 Visual clarity

![Image](https://images.openai.com/static-rsc-4/u9PuADW55YExB7FSz2w37b1FihQVbGFXG7dp5HwyqmU1h0uP_xkkiklWfni5wp6ma4cknlmCDmLKt8dbGnwemMtakLo6azHDHd-l9uXb6sLejFvsrriUQpkPxNpvyfAvWkAdyIeeAZ6llLovqN96l6uxzcWVAVSs5uC1z_ROmc68aFAKb6Nu-uGeM0diWxff?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/r2YNcr_bq4rfNtYdrTo-ulEh9MBQa4yqwsKUVTzAsDNso21M6sl4Le2lILRvGEqit-HryYRLSpfTuMMEBk4uDtcqV9cAQSpnoqRTNIS3WsK7SPPcij5zvKYeWbPTgO95vsaXCOEzNJomdc2FlRtL8cAdpEOg1RLGcAnMI7I-fK2Nf7j0a-mxS23w94S_2I0z?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/FMY5ce4xaPknLXxtaQ-A8dps_D576JDsqheTfkVJDAu6OpcPqGV-8xO1jIdzAT9QvNCnR7cQQfEIjyrkQAlJRDSvMdFZiyRYi14KuULKMlz9dXZHHil8v7Edn3t660IRXBPIcG8xFw7s7uZVgnx8x11lCbz1vTsrGFLlfi4VOCzue3YeRIppB833cZyB8AH0?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/rIJkqzsHt7DdZ4fKNr00zXaDjK1FtxoaawwHn5s4R3Tsabg7qkCYkSgJLkqmtXLUWu5AGLD8f_Co4wlWqaaG_XTMrM4aDJy9E3MAlIPhyeIc-2HBKWsO-6Upn2wyjLsSae9hNdtNU43PMDQmJHZv5IZf-aiCnkCbf_cyEPoXLhJ20oNcTlVMnGtE-wxlf_we?purpose=fullsize)

---

# 🔹 Example

```java
Person p = new Person();
p.setAge(25);
```

---

# 🔹 Step-by-step (deep 🔥)

## 1️⃣ `p` என்ன?

```text
p → address (say 5000)
```

👉 இது:

➡️ heapல இருக்கும் object location மட்டும்

---

## 2️⃣ Heap object

```text
Address 5000:
Person object:
age = 0
```

👉 கவனிக்க:

❌ method code இங்க இல்லை

---

## 3️⃣ Method எங்கே?

👉 method (`setAge`) இருக்கும் இடம்:

➡️ **Metaspace + Constant Pool**

---

## 4️⃣ JVM என்ன பண்ணும்?

👉 bytecode:

```text
invokevirtual #X   // setAge
```

👉 JVM:

1. constant pool பார்க்கும்
2. `setAge` method எங்கே இருக்குனு resolve பண்ணும்
3. class metadataலிருந்து method code எடுக்கும்

---

## 5️⃣ `this` binding

👉 அப்புறம் தான்:

➡️ `p` (object reference) use ஆகும்

---

# 🔥 முக்கிய புரிதல்

👉 Method callக்கு இரண்டு விஷயம் தேவை:

1️⃣ **எந்த method?** → constant pool
2️⃣ **எந்த object?** → `p`

---

# 🔹 Simple analogy 🧠

👉 `p` = வீட்டின் address 🏠
👉 constant pool = phone directory 📘

👉 நீ call பண்ணணும்னா:

* number directoryல இருந்து தேடணும்
* address மட்டும் போதாது

---

# 🔹 இன்னும் clear example

```java
Animal a = new Dog();
a.sound();
```

👉 இங்க:

* `a` → object reference
* actual method (`Dog.sound`)

👉 இதை resolve பண்ண:

➡️ constant pool + runtime lookup தேவை 🔥

---

# 🔥 Final clarity

👉 ❌ object மட்டும் இருந்தா method தெரியாது
👉 ✔️ constant pool தான் method info தரும்

👉 ✔️ இரண்டும் சேர்ந்து தான் call நடக்கும்

---

# 💡 One line

👉 **“Object tells where, Constant Pool tells what”**

---

🔥 நீ இப்ப JVM dynamic dispatch levelக்கு வந்துட்டே 😎

👉 next killer concept:

➡️ **Virtual method call எப்படி runtimeல resolve ஆகுது (polymorphism magic)**

இது mind-blowing 🔥
