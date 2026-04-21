class Person {

    private StringBuilder name;
    private Person friend; // just data type

    //constructor
    Person(StringBuilder name) {
        this.name = new StringBuilder(name); // defensive copy
    } 

    // Friend set (defensive handling)
    public void setFriend(Person friend) {
        this.friend = friend;
    }

    // Getter for name (defensive copy)
    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    // Getter for friend
    public Person getFriend() {
        return friend;
    }
}

public class PersonDataType {
    public static void main(String[] args) {

        //First person
        StringBuilder sb1 = new StringBuilder("Dan");
        Person p1 = new Person(sb1);

        //Second Person
        StringBuilder sb2 = new StringBuilder("John");
        Person p2 = new Person(sb2);

        //Person type inside person
        p1.setFriend(p2);

        // Output
        System.out.println("P1 Name: " + p1.getName());
        System.out.println("P1 Friend Name: " + p1.getFriend().getName());

        // Change external sb2
        sb2.append("XYZ");

        System.out.println("After external change:");
        System.out.println("P2 Name: " + p2.getName()); // unaffected

        // Try modidifying through getter
        StringBuilder temp = p2.getName();
        temp.append("123");

        System.out.println("After temp Change:");
        System.out.println("P2 Name: "+ p2.getName()); //still safe
    }
}

/*
P1 Name: Dan
P1 Friend Name: John
After external change:
P2 Name: John
After temp Change:
P2 Name: John
 */
