சரி 🔥 இப்போ நாம **Variables create பண்ணுவது + memoryல என்ன நடக்குது** — இது தான் Stack vs Heap புரிஞ்சிக்க foundation 👇

---

# 🔹 Variable create பண்ணுவது (Declaration + Initialization)

👉 Javaல variable create பண்ண இரண்டு step:

### ✅ 1. Declaration

👉 type + name

```java
int number;
```

---

### ✅ 2. Initialization

👉 value assign

```java
number = 3;
```

---

### ✅ Combined (common usage)

```java
int number = 3;
char letter = 'z';
```

👉 இதுல:

* `int`, `char` → type
* `number`, `letter` → variable name

---

# 🔹 Separateஆவும் எழுதலாம்

```java
double percentage;
percentage = 8.6;
```

👉 declaration & initialization தனித்தனியா செய்யலாம் ✔️

---

# 🔹 Compiler vs JVM (important ⚠️)

👉 type check யார் பண்ணும்?

* ❌ JVM இல்லை
* ✔️ Compiler (javac)

👉 அதனால்:
➡️ runtimeல JVM type check செய்யாது

---

# 🔥 முக்கிய concept (இதுதான் next level)

👉 Variables இரண்டு வகை:

---

# 🔹 1. Primitive variables

![Image](https://images.openai.com/static-rsc-4/UxpNt13cAztFgUg3fkAc-ZOtrx8Q6v-cPbYjyjOqvPa7_GRIM1yk7Om_4Ia7mY43EOj2qU8Em1cmkAPguBLKlzY3xm-GGggJiakaGKpWiKCj4VUDhgYrwzyUlPAz-ApYeLPi1GhHskbQsV_h0R8-lole8zVPazdu9mphIgoUfThAsm7KwA-IPpwDRsjJTfEu?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/siqTzNF4jBdsLx1MbikFJnQcITKOhenU51QBftKb2HeJ_J90d-y3Gcekg2E0ffOg-kJtFukh0FFB2L5VV6TsJHQBgVidzVfuM9zJSdC8alRJ4iLuA7vGO1zuEdaDLnk_IjCtuJtcav_AumNfqsnD-IMPzRVK9S9ax76f2WrQcSkwKqUoUW5mA7VVJGN6Fgo1?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/vDQvtr2Rc6xtZnh7gxS7JARJ0uo_YmEtIYcnBHzYzJ9RmU-31dgsr1jH7Ls6LCEE6vQsRVv_2dLxyxGYDS7IVLMrsv1u-mEt24k_b7N7_Cs3hnNGn822JoDG0fvnvYJvt2kmJtlJLaN_1w7da0yN8Xg8-tWoc2c-DhvNOJOwa2LT2h0CtXDqlIpwyxwEj1wR?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/gHypFK-POW9n_f1KS6I4jGmDKEN_I-hPzsONs7WwrGD9v1VtGANEdvGc36OCBmegqkh74XkM1rBHaQiFzAyH_nQtosITTVy_9Yl0ewdkF4EcLBs02MEnbipfKzZMWPy5zjt5B6a4V4iElS9aYOb3-Vq68a0nn1rjur0m-oF3BkF5XAoJkICY70iA17dqlZrU?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/akTTNvYbuTDSFaUP4mMh5ERATc0dwJgxOlSdGb7LRCM4u3qxADqaLYdy0husK_7DPnEYERKFzuRHO1kh2lNszOEIHtuUWPcCTpmyAgPXf_abvxoDTTr2vTaEDONmMOxQCIPJ6CC4ulYh-wi8f5G6c-43JNhO67B5iWPdsU1zyc-C-zbpJ4K_y726oebUxItS?purpose=fullsize)

👉 Example:

```java
int number = 3;
```

👉 என்ன நடக்கும்?

➡️ value directஆ **Stackல store ஆகும்**

👉 Structure:

```
Stack:
number → 3
```

---

# 🔹 2. Reference variables (Objects)

![Image](https://images.openai.com/static-rsc-4/siqTzNF4jBdsLx1MbikFJnQcITKOhenU51QBftKb2HeJ_J90d-y3Gcekg2E0ffOg-kJtFukh0FFB2L5VV6TsJHQBgVidzVfuM9zJSdC8alRJ4iLuA7vGO1zuEdaDLnk_IjCtuJtcav_AumNfqsnD-IMPzRVK9S9ax76f2WrQcSkwKqUoUW5mA7VVJGN6Fgo1?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/UxpNt13cAztFgUg3fkAc-ZOtrx8Q6v-cPbYjyjOqvPa7_GRIM1yk7Om_4Ia7mY43EOj2qU8Em1cmkAPguBLKlzY3xm-GGggJiakaGKpWiKCj4VUDhgYrwzyUlPAz-ApYeLPi1GhHskbQsV_h0R8-lole8zVPazdu9mphIgoUfThAsm7KwA-IPpwDRsjJTfEu?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/zDnwp2VP-s1GsVRhxaSJ8NxvcwlwphkoSbuxe_FubdoOgqcLFeE1wxw6_Ge7nAKUE7rWQXt9TxznXhKdWPFu0BhCU432YKOGCxorkQ3yMdaPlNWFZNiq33GzReATwLctuVCiHYVfOnqFIr-dLozlbr3_kszxXaYFkBRJXm31ZBlGwPiln-3aZjUsnJaEWEgn?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/chueo-VLNzShGsWiNNp6aK732pJnM-xpM8YdSfnnP6nhaO5211pfsqatjZV63rCZ9DkOvsnegeC9cNOscUFSGIZIW4LQXzuKSX5qchM10oNEb7y4JlJ_1_JcNTcw_Ou7otRMlMa2G_WYQMtA8_Yg4gCSTUPftqFqcJKmwuxJM3qDJY4ZwZa19jd7-BCjlo7v?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/2pXhHQz7qQM3nM4QhyRQql4K9sJvWNrfElqHWsJknS5n5U3siyz_Lu-dPelX5QjRq3GMODIVMKaqZezeJQoiWjB3SoaEmmzyNJNRLL7QF21EKwgQz7o7fT8EIyBwi8n58c9P6hDihRSdIwBbzK6cUy4UrT4QlMUF2_LnCarIawqF1KnUoIwCwcUDXRRhUXES?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/_AkJe3mriQwq_HPqC5GyDLkS0fBE5N82HAg_ivJotuDb83CFvddGMmmaBR-aOACCNZfdS9TfoTJS5sgEeJOUvAfKkk6mSZKx66Ejb3ph3VWjlO1GcYHIA1R3khOCDtbocSgaEtj1iA2VEU0OZJ-2I38MtHcm2PVj1yMMrQleW6BuDV0idrw_HqSiOsaHDWBh?purpose=fullsize)

👉 Example:

```java
Person p = new Person();
```

👉 என்ன நடக்கும்?

* `p` → Stack
* object → Heap

👉 Structure:

```
Stack:       Heap:
p  ------->  Person object
```

🔥 இது மிகவும் முக்கியமான difference

---

# 🔹 ஏன் இந்த difference?

👉 Primitive:

* small data
* direct store

👉 Object:

* complex
* dynamic memory
  ➡️ heap use பண்ணும்

---

# 🔹 Simple comparison

| Type      | Storage      |
| --------- | ------------ |
| Primitive | Stack        |
| Reference | Stack + Heap |

---

# 🔹 Real understanding 🧠

👉 Example:

```java
int a = 10;
int b = a;
```

👉 Result:

```
Stack:
a → 10
b → 10
```

👉 copy value ✔️

---

👉 Object example:

```java
Person p1 = new Person();
Person p2 = p1;
```

👉 Result:

```
Stack:        Heap:
p1 ------\
           → Person object
p2 ------/
```

👉 same object share 🔥

---

# 🔥 Final Deep Understanding

👉 Variable create பண்ணும்போது:

* primitive → value store
* object → reference store

👉 JVM:

* stack + heap use பண்ணும்

---

# 💡 One line summary

👉 **“Primitive = value, Object = reference”**

---

🔥 நீ இப்ப core concept அடிச்சுட்டே 🔥

👉 next step (very important):

➡️ **Passing variables (methodக்கு pass பண்ணும்போது என்ன நடக்குது?)**

இதுதான் tricky part 😎
சொல்லு — அதையும் deepஆ பார்க்கலாமா?
