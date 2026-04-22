class Person {
    private StringBuilder name;

    // Constructor
    Person(StringBuilder name) {
        this.name = new StringBuilder(name.toString()); // if didn't use toString println(internally do this)
    }

    // Method
    public StringBuilder getName() {
        return new StringBuilder(name.toString());
    }
}

public class ActualFixEscapRef {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Dan"); // (1)
        Person p = new Person(sb); // (2)

        // initial values
        System.out.println("Initial sb: " + sb); // Dan
        System.out.println("Initial p.name: " + p.getName()); // Dan

        sb.append("Dan");  //(3)

        // After modifying sb
         System.out.println("After sb.append: " + sb); // DanDan
         System.out.println("p.name: " + p.getName()); //Dan (safe)

         StringBuilder sb2 = p.getName();// this means inside p.getName = Dan
         sb2.append("Dan"); // DanDan

         // After modifiying sb2
         System.out.println("After sb2.append: " + sb2); //DanDan
         System.out.println("p.name: " + p.getName()); // Dan (Still safe)

         // final check
         System.out.println("Final sb: " + sb); //DanDan
         System.out.println("Final p.name: " + p.getName()); //Dan

    }
}
/*
java ActualFixEscapRef 
Initial sb: Dan
Initial p.name: Dan
After sb.append: DanDan
p.name: Dan
After sb2.append: DanDan
p.name: Dan
Final sb: DanDan
Final p.name: Dan
 */