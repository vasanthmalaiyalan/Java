class Empty {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }
    }
}

/*
🔹 init
i = 0
🔹 condition
i < 10
🔴 update (missing ❗)
(empty)

👉 அதனால்:

i++;  // inside loop 🔥
🔁 Flow
i=0 → print → i++ → 1
i=1 → print → i++ → 2
...
i=9 → print → i++ → 10
stop
💥 Output
Pass #0
Pass #1
...
Pass #9
🧠 Key Insight
update இல்லனா → manually inside loop பண்ணணும் 🔥
 */