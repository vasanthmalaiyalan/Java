சரி 🔥 இப்போ நாம **Frame Data + Constant Pool** உண்மையில எப்படி வேலை செய்கிறது என்பதை
ஒரு **real-time Java example** கொண்டு clearஆ புரிஞ்சிக்கலாம் 😎👇

---

# 🔹 Real-time Example (Java code)

```java
class App {
    public static void main(String[] args) {
        double price = 8.6;
        printPrice(price);
    }

    static void printPrice(double value) {
        System.out.println("Price: " + value);
    }
}
```

---

# 🔥 இதில் என்ன நடக்குது (Frame Data focus)

---

## 🔹 Step 1: Compile time (Constant Pool உருவாகும்)

👉 compiler (`javac`) என்ன பண்ணும்?

➡️ Constant Pool உருவாக்கும்:

```text
#1 = Double 8.6
#2 = String "Price: "
#3 = Methodref printPrice
#4 = Methodref println
#5 = Class App
```

👉 meaning:

* values (8.6)
* string
* method names
* class பெயர்

👉 இவை எல்லாம்:

➡️ **Metaspace (runtime constant pool)**ல இருக்கும்

---

# 🔹 Step 2: main() frame create

```text
Frame: main()

Frame Data:
- constant pool reference (App class)
- return info
```

👉 முக்கியம்:

➡️ இந்த frameக்கு **constant pool reference இருக்கும்** 🔥

---

# 🔹 Step 3: price = 8.6

👉 bytecode:

```text
ldc2_w #1   // constant poolலிருந்து 8.6 எடு
```

👉 flow:

1. frame → constant pool reference use பண்ணும்
2. #1 → 8.6 value கிடைக்கும்
3. operand stackக்கு push
4. local variableல store

---

# 🔹 Step 4: printPrice(price)

👉 bytecode:

```text
invokestatic #3
```

👉 இங்கே:

➡️ `#3 = printPrice method reference`

👉 JVM என்ன பண்ணும்?

1. frame data → constant pool reference use
2. `printPrice` method கண்டுபிடிக்கும்
3. புதிய frame create

---

# 🔹 Step 5: printPrice() frame

```text
Frame: printPrice()

Frame Data:
- constant pool reference
- return address (mainக்கு திரும்ப)
```

---

# 🔹 Step 6: println()

```java
System.out.println("Price: " + value);
```

👉 bytecode:

```text
ldc #2          // "Price: "
invokevirtual #4 // println
```

👉 flow:

1. constant poolலிருந்து string எடுக்கிறது
2. println method resolve ஆகும்
3. call execute ஆகும்

---

# 🔥 Frame Data actual வேலை

👉 இந்த exampleல Frame Data என்ன பண்ணுது?

---

## ✅ 1. Constant pool reference

➡️ values, methods resolve பண்ணும்

👉 example:

```text
#1 → 8.6
#3 → printPrice
#4 → println
```

---

## ✅ 2. Method return control

👉 printPrice முடிந்ததும்:

➡️ mainக்கு திரும்பணும்

👉 அதை frame data handle பண்ணும்

---

## ✅ 3. Exception handling

👉 suppose:

```java
double x = 10 / 0;
```

👉 error வந்தா:

➡️ frame data → exception handle பண்ணும்

---

# 🔹 FULL FLOW (visual)

```text
main frame
   ↓ (constant pool → 8.6)
store price
   ↓
call printPrice
   ↓
printPrice frame
   ↓ (constant pool → println)
print output
   ↓
return → main
```

---

# 🔹 Real-life analogy 🧠

👉 Frame = worker 👨‍🔧
👉 Constant Pool = instruction book 📘

👉 worker:

* book பார்த்து value எடுப்பான்
* method எங்க இருக்கு கண்டுபிடிப்பான்

---

# 🔥 Final clarity

👉 Frame Data:

* constant pool link வைத்திருக்கும்
* method return track பண்ணும்
* exception handle பண்ணும்

👉 Constant Pool:

➡️ programக்கு தேவையான **names + values + references**

---

# 💡 One line

👉 **“Frame data controls execution using information from the constant pool”**

---

🔥 நீ இப்ப JVM internals serious levelல புரிஞ்சுட்டே 😎

👉 next killer concept:

➡️ **இந்த codeக்கு actual bytecode (line-by-line execution)**

அதை பார்த்தா JVM முழுசா open ஆகும் 🔥
