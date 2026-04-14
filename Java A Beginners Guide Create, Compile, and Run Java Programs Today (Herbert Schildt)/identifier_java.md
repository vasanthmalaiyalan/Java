சூப்பர் 🔥 இது Java-வின் **naming rules (Identifiers)** — programming-ல மிகவும் important 💯
நான் இதை **simple Tamil + rules + examples + mistakes**ல explain பண்ணுறேன் 👇

---

# 🧠 1. Identifier என்றால் என்ன?

👉 **Identifier = நீங்கள் வைக்கும் பெயர் (name)**

👉 use ஆகும்:

* variable
* method
* class

---

## 🎯 Example

```java
int age;
double salary;
class Student {}
```

👉 `age`, `salary`, `Student` → identifiers ✔️

---

# 🔥 2. Identifier rules (மிக முக்கியம்)

---

## 🔹 Rule 1: Start எப்படி?

👉 தொடக்கம்:

✔️ letter (a–z, A–Z)
✔️ `_` (underscore)
✔️ `$` (rare use)

---

## ✔️ Examples

```java
id="a1"
age
_count
$value
```

---

## ❌ Wrong

```java
id="a2"
1age   ❌ (digit start)
```

---

# 🔹 Rule 2: Next characters

👉 பின்னர்:

✔️ letters
✔️ digits
✔️ `_`
✔️ `$`

---

## ✔️ Examples

```java
id="a3"
age1
value_2
total$count
```

---

# 🔹 Rule 3: Case-sensitive 🔥

👉 Java:

```java
id="a4"
myVar ≠ MyVar ≠ MYVAR
```

👉 எல்லாம் different ✔️

---

# 🔹 Rule 4: Keywords use பண்ணக்கூடாது ❌

```java
id="a5"
int if = 10;   ❌
```

---

# 🔹 Rule 5: Built-in names avoid

👉 avoid:

```java
id="a6"
println ❌
System ❌
```

👉 confusion avoid பண்ண

---

# 🔹 Rule 6: Meaningful names use பண்ணு

👉 good practice ✔️

```java
id="a7"
int totalMarks;
double averageScore;
```

👉 ❌ avoid:

```java
id="a8"
int x;
int a;
```

---

# 🎯 Valid identifier examples

```text
Test
up
x
_top
y2
MaxLoad
my_var
sample23
```

---

# ❌ Invalid examples

```text
12x        ❌ (starts with digit)
my-var     ❌ (- not allowed)
int        ❌ (keyword)
```

---

# 🧠 Why underscore?

👉 readability improve

```java
id="a9"
line_count ✔️
```

---

# ⚠️ `$` usage

👉 technically allowed ✔️
👉 but normally use பண்ண மாட்டாங்க

---

# 🔄 Real-life analogy

👉 Name:

👉 “Ram”, “Speed”, “TotalMarks”

👉 meaningful இருந்தா தான் புரியும்

---

# 🎯 Best practice (important 🔥)

👉 Java naming convention:

* variable → camelCase
  👉 `totalMarks`

* class → PascalCase
  👉 `StudentData`

---

# 🔚 Final clarity

💡 Simple-ஆ:

👉 Identifier:

**“program-ல நாம் வைக்கும் பெயர்”**

---

# 🔥 One-line

**“Identifiers are names you give to variables, methods, and classes”**

---

👉 Next 😎
நாம் deep போகலாம்:

👉 Java naming conventions (industry-level style) 🚀
