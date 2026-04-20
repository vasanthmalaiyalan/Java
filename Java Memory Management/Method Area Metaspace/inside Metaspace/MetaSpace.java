class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

public class MetaSpace {
    public static void main(String[] args) {
        Person p = new Person("Vasanth");
        p.sayHello();
    }
}