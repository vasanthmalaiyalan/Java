class Person {
    private StringBuilder name;

    // Constructor (Constructor)
    Person(StringBuilder name) {
        this.name = new StringBuilder(name); // constructor prebuilt in java if address to jump char[]
    }

    // Getter (Method)
    public StringBuilder getName() {
        return new StringBuilder(name);
    }
}

public class FixEscapRef {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Dan");

        Person p = new Person(sb);

        sb.append("Dan");
        System.out.println("After External change: " + p.getName());

        // getter
        StringBuilder sb2 = p.getName();
        sb2.append("Dan");

        System.out.println("After sb2 change: " + p.getName());
    }
}