class Person {
    private String name;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

public class BookExample {
    public static void main(String[] args) {

        // object creation
        Person p = new Person();

        // setting values
        p.setName("Vasanth");
        p.setHobby("Coding");

        // Geting values
        System.out.println(p.getName());
        System.out.println(p.getHobby());
    }
}