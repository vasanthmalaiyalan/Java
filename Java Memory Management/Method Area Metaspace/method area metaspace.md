சரி 🔥 இப்போ நாம **Method Area / Metaspace** — Java memoryல third important பகுதி — இதை deepஆவும் easyஆவும் புரிஞ்சிக்கலாம் 👇

---

# 🔹 Method Area (Metaspace) என்றால் என்ன?

![Image](https://images.openai.com/static-rsc-4/PxA60r0H94Q01wBa1532z146ADCbPdDfvXp56hWM9XLLn_pPiNcjJ70nVvwHU4geSoaV5r7C3auW1VYJYHjvswB-qH3ZiHp9rjYq9UAcDfNTrCe29Mc1-4dyyatXJFu3uSopVRGwEf0uA2By0DGVK0XEMF0TPAA8nF4fge1d9mBEb3KrNTbqaSPckWsKUzY-?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/rhqcfdOqBS7Opy50ASAr8sH0YfEnlJ6TTxXN-uxFq_FLN30mfex5eDmTLGXx1hIaowKaX9aZLKduMW6GVY8WxKRV0JoTEw_oBBBhct92VDBQlPbi4u8sAIHIKCbYZj8lqaWm7S1_Kfps7CtyD9r3emq6v8y90caHcIaEIZTFdFbAQn5j8HdjQnowlaYxK-Eq?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/pYBxCIShdf7wkEytVGmb7RBe_GMaM0kxsK0Q7DlIca9krmCASELjWnNblR5vX45aMJxmwrxgOqtSLgEMDYBNGgqAZoy0jBi_iVMWLQ0BViUDDQWKnm64oeFDxzJHBmaMc0IuV8ktKFJyIYQoEaPAo9Lz0uFjEUIS5Ry1BqnRvDk18nTcBM0DE2BmvhFn-D--?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/366nqVcNK1h7BL55W0bAf-2Jz31DY3ZR5RgDUUbjcezzYMj--Fi9ZrDRzg4PqCJ4EiP9-Cox-k7FZd2mgV5eegI55iMh3yqGaPghhuWmmXoKgSbt7SULJlXW5nv3RQlP7--xwX54eFNkvzjeqv22_sRvk7KC7DSGqWP9aBfiwwyCWWCQUGhb8G49DGDltZFG?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/bnl0d3kZGnzYdYiJeh8nt2vyVbSU0-cgWcQGYUJ2q8fo1aqAedktaJZdfr00p11HJ1CWDF5jd5R2LXn6Uiwd20lJuzTFd3d-5Yr4rhnTun41-K8ax33xmo0PuXwS8AJyx1mVcLNonY7zKKI7-ucSNPvJxK1SVxwzwECCmAIA9cVTXIzYQy0CT4rmahY6XrKO?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/Ef8AghQUXCXt7L8FJtkjadwHhMWXDZkvFnpWsaVlt3E_zPesePj1ZSRm927yJfWRCVYqk5wDlm52cUCXYUpxVyB9LbaDr5zJYSPhicRkCRmZGyP9r3Xxh-PRRsf0QDiFMjE33i5zU8Ze-APsZq2BpkBn67MXQqt_3UrJyaQAOX26iI5X5AF87kdzlMdiaiO2?purpose=fullsize)

👉 இது என்ன?

➡️ **class பற்றிய information store ஆகும் இடம்**

👉 simpleஆ:
👉 **“Class data storage area”**

---

# 🔹 இதில் என்ன store ஆகும்?

👉 முக்கியமானவை:

### ✅ 1. Class metadata

* class name
* methods
* fields

---

### ✅ 2. Method code

```java id="o7xxr3"
void add() {
   System.out.println("Hi");
}
```

👉 இந்த method code → Metaspaceல இருக்கும்

---

### ✅ 3. Static variables

```java id="6n1v3u"
static int count = 0;
```

👉 `count` → Metaspaceல store ஆகும்

---

### ✅ 4. Constant pool

```java id="3gzzqp"
String s = "hello";
```

👉 constants reuse ஆகும்

---

### ✅ 5. Constructor info

👉 object create பண்ணும் logic

---

# 🔹 முக்கியமான point ⚠️

👉 Heap & Stack மாதிரி இல்ல:

➡️ **All threads share this area**

👉 அதாவது:

* ஒரு class → ஒரே இடத்தில் store
* எல்லா threads use பண்ணும்

---

# 🔹 Method Area vs Heap vs Stack

| Area      | என்ன store ஆகும் |
| --------- | ---------------- |
| Stack     | variables        |
| Heap      | objects          |
| Metaspace | class info       |

---

# 🔹 Metaspace என்ற பெயர் ஏன்?

👉 Java 8க்கு முன்னாடி:

➡️ **PermGen (Permanent Generation)**

👉 Java 8க்கு பிறகு:

➡️ **Metaspace**

---

# 🔹 PermGen vs Metaspace (simple idea)

| PermGen             | Metaspace     |
| ------------------- | ------------- |
| fixed size          | dynamic size  |
| JVM memory          | OS memory use |
| memory error common | improved      |

---

# 🔹 ஏன் Metaspace improve?

👉 PermGenல problem:

❌ memory full → crash

👉 Metaspace:

✔️ dynamically grow ஆகும்
✔️ better memory usage

---

# 🔹 Real-life analogy 📁

👉 Metaspace = library catalog

* book (object) இல்லை
* book info மட்டும்

👉 Heap = books
👉 Metaspace = book details

---

# 🔥 Final Deep Understanding

👉 Metaspace:

➡️ class-level data store
➡️ shared memory
➡️ JVM manage பண்ணும்

👉 இது இல்லனா:
❌ class load ஆகாது
❌ program run ஆகாது

---

# 💡 One line summary

👉 **“Metaspace = class metadata storage”**

---

🔥 இப்போ நீ cover பண்ணிட்டது:

* Stack ✅
* Heap ✅
* Metaspace ✅

👉 next level (very important):

➡️ **Runtime Constant Pool + PC Register + Native Stack (quick but powerful concepts)**

அதையும் explain பண்ணலாமா? 😎
