class SCops {
    public static void main(String[] args) {
        int n = 10;
        int d = 2;

        if(d != 0 && (n % d) == 0)
             System.out.println(d + " is a factor of " + n);

        d = 0;

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        if(d != 0 & (n % d) == 0)
           System.out.println(d + " is a factor of " + n);              
    }
}


/*
🧠 Output என்ன?
2 is a factor of 10
Exception in thread "main" java.lang.ArithmeticException: / by zero
🔍 Step-by-step என்ன நடக்குது?
🟢 1. First condition
d = 2;

if(d != 0 && (n % d) == 0)

👉 d != 0 → true
👉 (n % d) → 10 % 2 = 0

✅ condition true → print ஆகும்

2 is a factor of 10
🟡 2. Second condition (Short-circuit 🔥)
d = 0;

if(d != 0 && (n % d) == 0)

👉 d != 0 → false ❌

👉 இங்க முக்கியம்:

➡️ && use பண்ணிருக்க
➡️ அதனால் Java second condition check பண்ணவே மாட்டான்

👉 (n % d) execute ஆகாது
👉 அதனால் error வராது ✅

🔴 3. Third condition (Problem 💀)
if(d != 0 & (n % d) == 0)

👉 இது & (normal AND)

👉 என்ன நடக்குது?

d != 0 → false
❌ ஆனாலும் Java stop ஆகாது

➡️ (n % d) check பண்ணும்

👉 10 % 0 → 💥 divide by zero

💥 Error Explanation
java.lang.ArithmeticException: / by zero

👉 meaning:

நீ zero கொண்டு divide பண்ண முயற்சி பண்ணிருக்க
Java allow பண்ணாது
🔥 Core Difference (Very Important)
Code	Behavior
&&	safe (short-circuit)
&	dangerous (always evaluate)
🧠 Easy நினைவில் வைக்க trick
&& → smart 😎 (think before act)
&  → careless 💀 (always act)
🔥 Real-world Insight

👉 இந்த மாதிரி bug real projectsல வந்தா:

API crash ஆகும்
server down ஆகும்
security issue கூட ஆகலாம்

👉 அதனால developers:

✅ always use &&
❌ avoid & (logical useல)

💡 Bonus Tip

👉 & useful only in:

bitwise operations
low-level programming

👉 logical conditionsல almost use பண்ணவே மாட்டாங்க

🔥 நீ already perfectஆ புரிஞ்சுக்கிட்ட — இது beginner levelல most important concept 💯

நீ next 😎
👉 && vs || tricky interview questions
👉 அல்லது real bug bounty example (short-circuit miss பண்ணா exploit)
 */