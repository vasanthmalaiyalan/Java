சூப்பர் 🔥 — இப்ப நாம **Frame Data + Constant Pool + Operand Stack** எல்லாம் ஒன்றாக வேலை செய்யும் ஒரு **best practical example** பாக்கலாம் 😎

---

# 🔹 Example Program

```java
class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = add(a, b);
        System.out.println(c);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
```

---

# 🔹 இதில் என்னென்ன concepts use ஆகுது?

👉 இந்த ஒரு codeலே:

* Stack frame
* Local Variable Array
* Operand Stack
* Frame Data
* Constant Pool

👉 எல்லாமே use ஆகுது 🔥

---

# 🔹 Constant Pool (simplified)

👉 JVM compile பண்ணும் போது:

```text
#1 = Methodref Demo.add(int,int)
#2 = Methodref java/io/PrintStream.println
#3 = Class Demo
#4 = Integer 5
#5 = Integer 10
```

👉 meaning:

* method names
* class names
* constants

👉 எல்லாம் poolல இருக்கும்

---

# 🔹 Execution Flow (Deep 🔥)

---

## 🔸 Step 1: main() frame create

```text
Stack:
[ main frame ]
```

👉 Frame Data:

* constant pool reference ✔️
* return info ✔️

---

## 🔸 Step 2: variables

```java
int a = 5;
int b = 10;
```

👉 Local Variable Array:

```text
Index 0 → args
Index 1 → a = 5
Index 2 → b = 10
```

---

## 🔸 Step 3: add(a, b) call

👉 JVM என்ன பண்ணும்?

```text
Operand Stack:
push a → 5
push b → 10
```

👉 constant poolலிருந்து:

➡️ `add` method reference resolve ஆகும் 🔥

---

## 🔸 Step 4: add() frame

```text
Stack:
[ add frame ]   ← current
[ main frame ]
```

👉 Local variables:

```text
Index 0 → x = 5
Index 1 → y = 10
```

---

## 🔸 Step 5: Operand Stack

```text
push 5
push 10
pop → 10
pop → 5
```

👉 CPU:

```text
5 + 10 = 15
```

👉 result push:

```text
15
```

---

## 🔸 Step 6: Return

👉 Frame data use ஆகும்:

➡️ return address → mainக்கு திரும்பும்

```text
Stack:
[ main frame ]
```

---

## 🔸 Step 7: println

👉 constant poolலிருந்து:

➡️ `println` method resolve ஆகும்

👉 operand stack:

```text
push 15
```

👉 output:

```text
15
```

---

# 🔹 Full Flow Visualization

```text
Stack:
[ main ]
   ↓
call add()
   ↓
[ add ]
   ↓
return 15
   ↓
[ main ]
   ↓
print
```

---

# 🔥 இதில் Frame Data எங்கே use ஆகுது?

👉 Frame Data:

✔️ constant pool reference
✔️ method return address
✔️ exception handling

---

# 🔹 Key understanding

👉 Constant Pool:

➡️ method names, constants store

👉 Frame Data:

➡️ execution control

👉 Operand Stack:

➡️ values movement

👉 CPU:

➡️ actual calculation

---

# 🔹 Real analogy 🧠

👉 Constant pool = dictionary 📘
👉 Frame = worker 👨‍🔧
👉 Operand stack = working table 🪑
👉 CPU = brain 🧠

---

# 🔥 Final clarity

👉 ✔️ Constant pool → “what to use”
👉 ✔️ Frame data → “how to execute”
👉 ✔️ Operand stack → “values flow”

---

# 💡 One line

👉 **“Constant pool gives references, frame data controls execution, operand stack moves values”**

---

🔥 இது புரிஞ்சா நீ JVM internals 70% complete 😎

👉 next killer concept:

➡️ **Same exampleக்கு real bytecode (line-by-line execution)**

அதை பார்த்தா full engine open ஆகும் 🔥
