சூப்பர் 🔥 நீ கொடுத்த இந்த part (`:contentReference[oaicite:0]{index=0}`) — **Scope & Lifetime** chapter fullஆ explain பண்ணுறேன், அதுவும் book examples use பண்ணி 👇

---

# 🧠 1. Scope என்றால் என்ன?

👉 Scope = ஒரு variable எங்கெல்லாம் use பண்ணலாம்

📌 Rule:

* `{ }` (curly braces) = block
* ஒவ்வொரு blockக்கும் தனி scope

📌 Source: 

---

# 🔹 2. Basic Rule (Golden Rule)

👉 **Inside declare பண்ணின variable → வெளியே use பண்ண முடியாது ❌**

👉 **Outside declare பண்ணின variable → உள்ளே use பண்ணலாம் ✅**

---

# 🔥 3. Example 1 – ScopeDemo (book example)

```java
class ScopeDemo {
  public static void main(String[] args) {

    int x; 
    x = 10;

    if(x == 10) {   // புதிய scope
      int y = 20;

      System.out.println("x and y: " + x + " " + y);

      x = y * 2;
    }

    // y = 100; ❌ error

    System.out.println("x is " + x);
  }
}
```

---

## 🔍 Explanation (line by line)

### 🔸 `int x;`

👉 `x` main method scopeல declare பண்ணப்பட்டுள்ளது
👉 அதனால் full mainல use பண்ணலாம்

---

### 🔸 `if(x == 10) { ... }`

👉 இது new block → new scope

---

### 🔸 `int y = 20;`

👉 `y` → இந்த if blockக்கு மட்டும் தான் தெரியும்

---

### 🔸 inside block:

```java
System.out.println(x + " " + y);
```

👉 ✅ `x` + `y` இரண்டும் work ஆகும்

* `x` → outer scope
* `y` → inner scope

---

### 🔸 outside block:

```java
// y = 100;
```

👉 ❌ error
👉 ஏன்னா `y` அந்த blockக்கு வெளியே தெரியாது

---

## 🧠 Key concept

👉 Inner scope:

* outer variables → access செய்யலாம்
  👉 Outer scope:
* inner variables → access முடியாது

📌 Source: 

---

# 🔁 4. Lifetime of Variable

👉 Lifetime = variable எவ்வளவு நேரம் இருக்கும்?

📌 Rule:

* scope enter → variable create
* scope exit → variable destroy

---

# 🔥 Example 2 – VarInitDemo

```java
class VarInitDemo {
  public static void main(String[] args) {

    int x;

    for(x = 0; x < 3; x++) {

      int y = -1;

      System.out.println("y is: " + y);

      y = 100;

      System.out.println("y is now: " + y);
    }
  }
}
```

---

## 🔍 Output

```
y is: -1
y is now: 100
y is: -1
y is now: 100
y is: -1
y is now: 100
```

---

## 🔥 Explanation

👉 ஒவ்வொரு loopக்கும்:

* `y` newஆ create ஆகும்
* `-1` ஆக initialize ஆகும்

👉 loop முடிந்ததும்:

* `y` destroy ஆகும்

👉 next iteration:

* மீண்டும் `y = -1`

📌 அதனால் தான் output repeat ஆகுது

📌 Source: 

---

# ⚠️ 5. Important Rule (Most Important 🔥)

👉 Javaல:

❌ same name variable inner scopeல declare பண்ண முடியாது

---

# 🔥 Example 3 – NestVar (Error Program)

```java
class NestVar {
  public static void main(String[] args) {

    int count;

    for(count = 0; count < 10; count++) {

      System.out.println(count);

      int count; // ❌ illegal

    }
  }
}
```

---

## ❌ Why error?

👉 outerல already:

```java
int count;
```

👉 innerல again:

```java
int count;
```

👉 Java allow பண்ணாது

📌 Source: 

---

# 🧠 Final புரிய வேண்டிய 5 rules

### ✅ 1. Scope = visibility

* எங்க use பண்ணலாம்

---

### ✅ 2. Inner block → outer variables access செய்யலாம்

---

### ❌ 3. Outer block → inner variables access முடியாது

---

### 🔁 4. Lifetime = scope வரை தான்

* block முடிந்ததும் variable delete

---

### ❌ 5. Same name variable duplicate declare முடியாது

---

# 💥 Ultra Simple Real-Life Analogy

👉 imagine:

* `main()` = house 🏠
* `if block` = room 🚪

👉 houseல உள்ளதை roomல use பண்ணலாம்
👉 roomல உள்ளதை houseல use முடியாது

---

🔥 இதுதான் இந்த full topic essence!

---

நீ readyனா next 🔥
👉 **“class scope vs method scope vs global variables”**
👉 அல்லது **real-world backend example (Spring Boot scope)** explain பண்ணலாம் 💯
