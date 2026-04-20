abstract class Worker {
    abstract void work();
}

class Person extends Worker {
    @Override
    void work() {
        System.out.println("Person working");
    }
}

class Robot extends Worker {
    @Override
    void work() {
        System.out.println("Robot working");
    }
}

public class PloymorphismApproach {

    // common method
    static void startWork(Worker w) {
        w.work();
    }

    public static void main(String[] args) {

        Worker w1 = new Person();
        Worker w2 = new Robot();

        startWork(w1);
        startWork(w2);

        // future
        Worker w3 = new Person();
        startWork(w3);
    }
}