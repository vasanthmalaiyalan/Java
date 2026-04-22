class Person {
    String name;

    // Constructor 
    Person(String name) {
        this.name = name;
        System.out.println("Constructor called");
    }

    // Method
    void sayHello() {
        System.out.println("Hello " + name);
    }
}

public class ConstructorVsMethod {
    public static void main(String[] args) {

        Person p = new Person("Dan"); //Constructor call

        p.sayHello(); // method call
    }
}