class IncrementOperator {
    public static void main(String[] args) {
        int i = 5;

        System.out.println(++i); // 6 -> becuase first increment
        System.out.println(i++); // this one is actual value of firat increment (first print than increment)
        System.out.println(i); //this is that i++ then inccrement value
    }
}

/*
🧠 Explanation

👉 ++i → first increment → print → 6
👉 i++ → first print → then increment → still prints 6
👉 final i = 7
 */