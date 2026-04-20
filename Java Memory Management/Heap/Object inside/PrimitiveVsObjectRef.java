class Person {
    int age; // primitive
    String name; // reference (object)

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}

public class PrimitiveVsObjectRef {
    public static void main(String[] args) {

        // object creation
        Person p = new Person();

        // Assign values
        p.age = 25; // primitive (direct value)
        p.name = "vasanth"; //reference (point to string pool)

        // Display
        p.display();
    }
}