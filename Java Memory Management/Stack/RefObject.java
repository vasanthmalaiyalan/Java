interface Walkable {}

abstract class Human {}

class Person extends Human implements Walkable {
    private String name;
    private int age;

    Person(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    @Override
    public String toString() {
        String decoratedName = "My name is " + name + " and I am " + age + " years old.";
        return decoratedName;
    }
}

public class RefObject {
    public static void main(String[] args) {
        int x = 0;
        Person jeoBloggs = new Person("Jeo Bloggs", 23);
        System.out.println(x);
        System.out.println(jeoBloggs.toString());
    }
}