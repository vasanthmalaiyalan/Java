interface Walkable { // rule set and contract
    void walk();
}

abstract class Human { // like parent enforce
     abstract void work();
}

class Person extends Human implements Walkable {

    @Override
    void work() {
        System.out.println("Person working in office");
    }

    @Override
    public void walk() {
        System.out.println("Person walking");
    }
}

class Robot extends Human {

    @Override
    void work() {
        System.out.println("Robot working automatically");
    }
}

public class PolymorPhism {

    public static void main(String[] args) {

        // Polymorphism
        Human h1 = new Person();
        Human h2 = new Robot();

        h1.work(); // Person work
        h2.work(); // Robot work

        // Interface polymorphism
        Walkable w = new Person();
        w.walk();
    }
}