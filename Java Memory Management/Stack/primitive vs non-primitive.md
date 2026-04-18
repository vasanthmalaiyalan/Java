சரி 🔥 — இந்த paragraph தான் Java memoryல **core rule** 😎
நாம இதை **simple + visual + real example**ல புரிஞ்சிக்கலாம் 👇

---

# 🔹 Main idea

👉 இரண்டு type values:

### 1️⃣ Primitive values

➡️ **directா stackல store ஆகும்**

### 2️⃣ Object values

➡️ **object heapல இருக்கும்**
➡️ **reference மட்டும் stackல இருக்கும்**

---

# 🔹 Visual understanding

![Image](https://images.openai.com/static-rsc-4/siqTzNF4jBdsLx1MbikFJnQcITKOhenU51QBftKb2HeJ_J90d-y3Gcekg2E0ffOg-kJtFukh0FFB2L5VV6TsJHQBgVidzVfuM9zJSdC8alRJ4iLuA7vGO1zuEdaDLnk_IjCtuJtcav_AumNfqsnD-IMPzRVK9S9ax76f2WrQcSkwKqUoUW5mA7VVJGN6Fgo1?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/WHaEIktA7KbqyBo6-z9d8E0JEU4ijg635d0VXHf2xnm-1irW0GCmyi9LhA6e1jsCEz4hlMv6i3BiMaMBEN0n5HUkm4-Z7AlReH1AXRb6uLVey0m7_tvWBCtuuKHmPrrsVUgNklnrvda8AQflHQ4eSWb59Uv2LCyRY6tmfPH0u_zmAeA7Um8LoqJc4qsfNgkB?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/UxpNt13cAztFgUg3fkAc-ZOtrx8Q6v-cPbYjyjOqvPa7_GRIM1yk7Om_4Ia7mY43EOj2qU8Em1cmkAPguBLKlzY3xm-GGggJiakaGKpWiKCj4VUDhgYrwzyUlPAz-ApYeLPi1GhHskbQsV_h0R8-lole8zVPazdu9mphIgoUfThAsm7KwA-IPpwDRsjJTfEu?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/2pXhHQz7qQM3nM4QhyRQql4K9sJvWNrfElqHWsJknS5n5U3siyz_Lu-dPelX5QjRq3GMODIVMKaqZezeJQoiWjB3SoaEmmzyNJNRLL7QF21EKwgQz7o7fT8EIyBwi8n58c9P6hDihRSdIwBbzK6cUy4UrT4QlMUF2_LnCarIawqF1KnUoIwCwcUDXRRhUXES?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/0VOV1QTjmzLV2DNLn0vq8wda-guUSLG3o9TCoPbekSZgcCVuVKb65Y2bfMCT7tbS4RqVkvzHMAx6u54wqW9d1tGzpgiJx5IQbk2s2LI54aEh5MIsx4HelYNMBtXbDpN12fRV2jcZIOVJrabhueTkcGwLIFuOS9gNjXHduvcUoW3qhJ_ugGOfYku1nJLEZzWU?purpose=fullsize)

---

# 🔹 Example 1 (Primitive)

```java
int a = 10;
```

👉 Memory:

```text
Stack:
a → 10
```

👉 ✔️ value directா store ஆகுது

---

# 🔹 Example 2 (Object)

```java
Person p = new Person();
```

👉 Memory:

```text
Stack:              Heap:
p  --------->       Person object
                    age = 0
```

👉 ✔️ stackல object இல்லை
👉 ✔️ address மட்டும்

---

# 🔹 Example 3 (Combine)

```java
int a = 10;
Person p = new Person();
p.age = 25;
```

👉 Memory:

```text
Stack:              Heap:
a → 10              Person object
p → 5000  --------> age = 25
```

---

# 🔹 முக்கிய புரிதல் 🔥

👉 Primitive:

* value small
* direct storage

👉 Object:

* big structure
* heapல store
* stackல reference மட்டும்

---

# 🔹 ஏன் இப்படி design?

## 🔸 1. Performance

👉 stack:

* fast
* simple

👉 small valuesக்கு perfect

---

## 🔸 2. Memory efficiency

👉 object:

* பெரிய data
* shared ஆகலாம்

👉 அதனால் heapல வைச்சிருக்கும்

---

## 🔸 3. Sharing (important 🔥)

```java
Person p1 = new Person();
Person p2 = p1;
```

👉 Memory:

```text
Stack:              Heap:
p1 --------\
            → Person object
p2 --------/
```

👉 ✔️ ஒரே object share

---

# 🔹 Null case

```java
Person p = null;
```

👉 Memory:

```text
Stack:
p → null
```

👉 ❌ எந்த objectயும் point பண்ணாது

---

# 🔥 Final clarity

👉 ✔️ Primitive → value directly stack
👉 ✔️ Object → heap
👉 ✔️ Reference → stack

---

# 💡 One line

👉 **“Primitive stores value, Object stores reference (pointer to heap)”**

---

🔥 நீ இப்ப Java memory model strongஆ பிடிச்சுட்டே 😎

👉 next killer concept:

➡️ **Pass by value vs reference (Javaல real truth)**

இது interview killer 🔥
