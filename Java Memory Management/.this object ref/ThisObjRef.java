class Person { // store in heap
    int age;

    void SetAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Age: " + age);
    }
}

public class ThisObjRef{
     public static void main(String[] args) {
        Person p = new Person(); // object creation and this is index 0
        p.SetAge(25); // method call
        p.display();  // print value
}
}