interface Walkable { // rule set and contract
    void walk();
}

abstract class Human { // like parent enforce
     abstract void work();
}

class Person extends Human implements Walkable {

    
}