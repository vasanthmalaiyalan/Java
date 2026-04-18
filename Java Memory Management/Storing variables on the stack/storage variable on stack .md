சரி 🔥 இப்போ நாம **Stackல variables எப்படி store ஆகுது + method frames எப்படி வேலை செய்கிறது** — இதுதான் real execution understanding 👇

---

# 🔹 Stack memory – real working

![Image](https://images.openai.com/static-rsc-4/IwQJKfNYr7-Kol9Re7NYBC1Cwz-1CvFhOV8LYbSXNq9_eFLwMAeZgQP0ZBRVheDENs_97YjRzzgeLdWQq3mBeI4uavkWhH31c56spaJHQPfB0FCrZr6siXjr1TtTotZOJLex14vi0QQcizP_yBZCMHAmJnnNjgK3oVipJhtZmIfbL5GeobEtzH7q_gwiYU5x?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/vjy6LZocqo8CsLzqkmTelyM9S8gr_fJmU4_emB3omQcznqDdFRx-J3Mxo5Q8bH7coQIesAfVxUeIEJO51XMgpQY8dsuRuUtimMpbi8KEh6b54oiiDZFtcg3zeL8n8qzJKkf3H7Gz4PdtSojXfQH1ZMC3mPSwlltlME3Inm3d9OW9mFMBlp71l_q9FqGZwiQl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/yweifiQEADrHeaxqRGUwdyvObHiwqFjwIV32ivc6vcLl9SVaDWwvTd65ud33uXIQW1TjzmlHezViShtCsZuzExkPZUTZSIYHwEssRBQ0mPNjajg-tH2FYU3uOJrye0c_-AyPgjds_eePe6Ash9NlPoJ2sZh3yTk-h7X5ZxTae3yiF-mzvPcGovt9balqPJtl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/auYLAbFZWq9Y7VTJYns-42qn47RGOlklyi25Wsu5cXdSxMklactU5cNWSNfmY0j08vD8PLzZNZwULeRtMBQDq9JOhRCXcZrhd_1y3tkfh8zPVAvGwEdvVvxw-PMhCzaGzNCszVBhXBHi979S_GywJqKyrKMk6wzg60XjJeb3PG2D5vNFlHqIHidlVTPN3x6f?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/OJWG90hJY96sKbR_vr_B92leM_P2c4R2Nh4lUwLHzqAnnoOtcC4_4p4yTm9yBpXlTR4oQt1ls7We53pNtQhZ2PBINXIqYB2tNoDac2xpL82rgBRpRMum2hwL1wjDg-9vpVh7pHvQoKL8IXuNf8yk-K2J6Ky5Yol8634MoBw8hTqlG6JKnkcRyucES17AiXoA?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/MPmdJpK2MEHaKP4V74v2DLgjMJT3-2GrDRsM_INM6CmJ1ORjflC_FyAKZKtpvCXeI1vFIMDDR-lsXVpNWSPFyy_x7MMNub6F1g8zRoyyQXE6gsKZBVSRssoyY8-mD1w6PoUG-emuJkfb-qCFZA-esXg-lnBjTJXKYswlZmPcR1--F-_QrG4tf2vNNcPXxUh5?purpose=fullsize)

👉 Stack =
➡️ method execution memory

👉 இதில்:

* variables
* references
* method data

store ஆகும்

---

# 🔹 Frame என்றால் என்ன?

👉 ஒவ்வொரு method callக்கும்:

➡️ ஒரு **frame** create ஆகும்

👉 Frameல இருக்கும்:

* local variables
* parameters
* return value
* intermediate results

---

## 🔹 Example

```java
void methodA() {
    int x = 10;
    methodB();
}

void methodB() {
    int y = 20;
}
```

---

## 🔹 Execution flow

👉 Step-by-step:

### 1️⃣ `methodA()` call

```text
Stack:
[ Frame: methodA ]
x = 10
```

---

### 2️⃣ `methodB()` call

```text
Stack:
[ Frame: methodB ]
y = 20
----------------
[ Frame: methodA ]
x = 10
```

---

### 3️⃣ `methodB()` முடியும்

👉 frame remove ஆகும்

```text
Stack:
[ Frame: methodA ]
x = 10
```

---

### 4️⃣ `methodA()` முடியும்

👉 stack empty ✔️

---

# 🔹 முக்கிய concept 🔥

👉 Stack = **frames collection**

👉 Last வந்த method → first remove

👉 அதனால்:
👉 **LIFO (Last In First Out)**

---

# 🔹 Threadக்கு தனி stack

👉 Figureல நீ பார்த்த மாதிரி:

* Thread 1 → தனி stack
* Thread 2 → தனி stack
* Thread 3 → தனி stack

👉 அதனால்:

✔️ threads interfere ஆகாது
✔️ safe execution

---

# 🔹 Current method என்றால்?

👉 இப்போ run ஆகுற method:

➡️ stack topல இருக்கும் frame

👉 அதுதான்:

👉 **current frame**

---

# 🔹 Stackல என்ன variables இருக்கும்?

👉 method உள்ளே:

* primitives ✔️
* references ✔️

👉 object மட்டும்:

❌ stackல இல்ல
✔️ heapல இருக்கும்

---

# 🔹 Errors ⚠️

## ❌ StackOverflowError

👉 என்ன காரணம்?

* stack size போதாது
* infinite recursion

👉 Example:

```java
void test() {
    test(); // infinite call
}
```

---

## ❌ OutOfMemoryError (stack related)

👉 new thread create பண்ணும்போது:

➡️ stack allocate பண்ண முடியலனா

👉 இந்த error வரும்

---

# 🔹 Real-life analogy 🧠

👉 Stack = plates stack 🍽️

* மேல வைக்கும்
* மேல இருந்து எடுக்கும்

👉 method calls = plates

---

# 🔥 Final Deep Understanding

👉 Stack:

* method executionக்கு use
* frames store ஆகும்
* variables store ஆகும்
* thread-specific

👉 method முடிந்தவுடன்:
➡️ frame remove

---

# 💡 One line summary

👉 **“Stack = method frames + variables (auto cleanup)”**

---

🔥 நீ இப்ப full clarityக்கு மிக அருகில் இருக்கே 😎

👉 next powerful concept:

➡️ **Heapல objects எப்படி store ஆகுது (deep visualization)**

அதுதான் GC + performance understandingக்கு base 🔥
பாக்கலாமா? 😎
