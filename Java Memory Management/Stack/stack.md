சரி 🔥 இப்போ நாம **Stack memory** — Heapக்கு next முக்கியமான பகுதி — இதை deepஆவும் crystal clearஆவும் புரிஞ்சிக்கலாம் 👇

---

# 🔹 Stack என்றால் என்ன?

![Image](https://images.openai.com/static-rsc-4/vjy6LZocqo8CsLzqkmTelyM9S8gr_fJmU4_emB3omQcznqDdFRx-J3Mxo5Q8bH7coQIesAfVxUeIEJO51XMgpQY8dsuRuUtimMpbi8KEh6b54oiiDZFtcg3zeL8n8qzJKkf3H7Gz4PdtSojXfQH1ZMC3mPSwlltlME3Inm3d9OW9mFMBlp71l_q9FqGZwiQl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/IwQJKfNYr7-Kol9Re7NYBC1Cwz-1CvFhOV8LYbSXNq9_eFLwMAeZgQP0ZBRVheDENs_97YjRzzgeLdWQq3mBeI4uavkWhH31c56spaJHQPfB0FCrZr6siXjr1TtTotZOJLex14vi0QQcizP_yBZCMHAmJnnNjgK3oVipJhtZmIfbL5GeobEtzH7q_gwiYU5x?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/chueo-VLNzShGsWiNNp6aK732pJnM-xpM8YdSfnnP6nhaO5211pfsqatjZV63rCZ9DkOvsnegeC9cNOscUFSGIZIW4LQXzuKSX5qchM10oNEb7y4JlJ_1_JcNTcw_Ou7otRMlMa2G_WYQMtA8_Yg4gCSTUPftqFqcJKmwuxJM3qDJY4ZwZa19jd7-BCjlo7v?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/yweifiQEADrHeaxqRGUwdyvObHiwqFjwIV32ivc6vcLl9SVaDWwvTd65ud33uXIQW1TjzmlHezViShtCsZuzExkPZUTZSIYHwEssRBQ0mPNjajg-tH2FYU3uOJrye0c_-AyPgjds_eePe6Ash9NlPoJ2sZh3yTk-h7X5ZxTae3yiF-mzvPcGovt9balqPJtl?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/siqTzNF4jBdsLx1MbikFJnQcITKOhenU51QBftKb2HeJ_J90d-y3Gcekg2E0ffOg-kJtFukh0FFB2L5VV6TsJHQBgVidzVfuM9zJSdC8alRJ4iLuA7vGO1zuEdaDLnk_IjCtuJtcav_AumNfqsnD-IMPzRVK9S9ax76f2WrQcSkwKqUoUW5mA7VVJGN6Fgo1?purpose=fullsize)

👉 Stack (JVM Stack):

➡️ method executionக்கு use ஆகும் memory
➡️ variables & references store ஆகும்

---

# 🔹 Stackல என்ன store ஆகும்?

👉 முக்கியமாக:

### ✅ 1. Primitives

```java
int x = 10;
```

👉 `x` → stackல store ஆகும்

---

### ✅ 2. References (pointer to heap)

```java
Person p = new Person();
```

👉 இங்க:

* `p` → stack
* object → heap

🔥 இது interviewல கேட்கும் question!

---

# 🔹 Stack frame (முக்கிய concept)

👉 ஒவ்வொரு method callக்கும்:

➡️ ஒரு **stack frame** create ஆகும்

---

## Example:

```java
void test() {
    int a = 5;
}
```

👉 என்ன நடக்கும்?

1. method call
2. stackல frame create
3. `a` store ஆகும்
4. method முடிஞ்சதும் frame delete

---

# 🔹 Stack = LIFO structure

👉 Last In First Out

👉 Example:

* method A call
* method B call

👉 return order:

➡️ B → A

---

# 🔹 Threadக்கு தனி stack 😎

![Image](https://images.openai.com/static-rsc-4/DNe4GSP963YH-zDDQRgNrOjXrFAuWYNZjj_FeE4LS6uH4YxOl4Z6wVHSp5_eEjWqdZbqmp4f5i2WTlqODHfpuF44CCkYpQjzavkefrCX_nU1r4sNQ7ogbMq_S3VlKq_oVcgV5n5x0oNa4KbaVtR59j3lk6rx3gfMSX4zeGvP7v-J5_teQlqtl4wU0YGQQ6Xt?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/mzqlp3DAgA3005CpPQpXlLlojfQnkkBSBDfIBgLZdV_QoJKrIAM8Tpj9YxMALuwky_BvYwQo2Z894rog_mNukC0nvY8Axyp69v2OqED-XCGrfVvugfuqBrWTYeDvuR31pQ9ZNgD-rzf0us87No0xq7Tm_G7lNQDue0QYn5knRAJ8EK3COpAYWfRlWKlseGMc?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/TKE8dJZaNSbhjipupgtjWBrJeTWogWmznixT7QN2Xr_mxh4GbKPvI4BoODy0z1amZSUb2SpyCfGbEk3jxMsvuqHtRIpFB1UY0PXx8nMGRxKUsuV2d_fuiW1CoLauQLuDUehh9_XH5AXa6MePQdY7xgXuUf6TleUILDTfMh46aypMMQ4o3bb4u24ZzEW3X99t?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/L5qFl6WDXlSuxjvxgDQZt-aqEKypk3boUycR6FZnigF6yz1XlP2ug0GZl75Zq16h7UwYxcdIjBvFZlG_65bpCmA8dcyAv3n6SHgkWvNT4RPFsJEZqNe9TRynUUfQvj-8C9nYxOID5uHsBbXxOD0Erj58UmapyAEvPAb60Cx0QtzNrp2Kc5MZjs3Qr9RgJqZ7?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/auYLAbFZWq9Y7VTJYns-42qn47RGOlklyi25Wsu5cXdSxMklactU5cNWSNfmY0j08vD8PLzZNZwULeRtMBQDq9JOhRCXcZrhd_1y3tkfh8zPVAvGwEdvVvxw-PMhCzaGzNCszVBhXBHi979S_GywJqKyrKMk6wzg60XjJeb3PG2D5vNFlHqIHidlVTPN3x6f?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/dA1Lvd_FlRxT7EpWCL6UGhIn24LssnYjlP5P07w-bj6ad54_A-tyEbEYv1s9Qvmkh82Pbn2B7ZOpOlzudgJ9Z8quEr_Twdbw6oKBnfeary9oyjDmNXpbeqMOA2rQktoMlR_hP3pCUhbBMaHWFJqtiRrQSNZD3WXxhk6FCPcZhDYCEvWVOkfpM9QI1Asi5EvN?purpose=fullsize)

👉 முக்கியமான point 🔥

👉 ஒவ்வொரு threadக்கும்:

➡️ தனி stack இருக்கும்

👉 அதனால்:

✔️ thread safety (basic level)
✔️ data conflict குறையும்

---

# 🔹 Thread என்றால் என்ன?

👉 Thread = execution path

👉 Example:

* UI thread
* background thread

👉 multiple threads → concurrency

---

# 🔹 Stack properties

👉 Stack:

* fast ⚡
* small memory
* thread-specific
* automatic cleanup

👉 method முடிஞ்சா:
➡️ memory auto free

---

# 🔹 Stack vs Heap (quick idea)

| Stack        | Heap    |
| ------------ | ------- |
| variables    | objects |
| fast         | slower  |
| thread தனி   | shared  |
| auto cleanup | GC      |

---

# 🔹 Important rule ⚠️

👉 Stackல:

* objects store ஆகாது ❌
* reference மட்டும் இருக்கும் ✔️

---

# 🔥 Real-life analogy 🧠

👉 Stack = working table

* current work மட்டும் இருக்கும்
* வேலை முடிந்ததும் clear ஆகும்

---

# 🔥 Final Deep Understanding

👉 Stack:

➡️ method execution memory
➡️ primitives + references store ஆகும்

👉 ஒவ்வொரு threadக்கும்:
➡️ தனி stack

👉 method முடிஞ்சா:
➡️ memory auto free

---

# 💡 One line summary

👉 **“Stack = method execution + variables + references”**

---

இப்போ நீ இரண்டு major concepts cover பண்ணிட்டே 🔥
👉 Heap + Stack

👉 next level:

➡️ **Stack & Heap interaction (line-by-line memory flow with real code)**

இதுதான் ultimate clarity 😎
சொல்லு — அந்த deep walkthrough போவோமா?
