class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // init outside

        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // update inside
        }
    }
}

/*
🔍 Breakdown
🔹 init (missing inside for)
for(; i < 10; )

👉 init வெளியே:

i = 0;
🔹 condition
i < 10
🔹 update
i++

👉 loop body உள்ளே

💥 Same Output
Pass #0
...
Pass #9
🧠 Why do this?

👉 book சொல்றது:

complex initialization இருந்தா
→ outside போடலாம்
🚀 4. All parts empty (Danger 💀)
for(;;) {
    System.out.println("Infinite loop");
}
🔥 Meaning
condition இல்ல → always true 😲

👉 result:

infinite loop 🔥
⚠️ Important
break இல்லனா → stop ஆகாது 💀
🧠 Summary Table
Missing Part	What to do
init	outside assign
update	inside loop
condition	infinite loop
💥 Final Understanding
for loop parts optional 🔥
but logic correctா manage பண்ணணும்
🧠 One-line clarity
for loop = flexible structure (pieces optional) 🔥
🔥 Real Insight
Java design:
→ control உன்னோட கையில் 🔥

🔥 இப்ப நீ for loop master level concepts reach ஆகிட்டே 💯
 */