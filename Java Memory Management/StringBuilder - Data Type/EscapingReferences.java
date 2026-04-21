class Person {
    private StringBuilder name;

    Person(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }
}

public class EscapingReferences {
    public static void main(String[] args) {

        StringBuilder sb =  new StringBuilder("Dan");
        Person p = new Person(sb);

        sb.append("Dan");
        System.out.println(p.getName()); //DanDan

        StringBuilder sb2 = p.getName();
        sb2.append("Dan");

        System.out.println(p.getName()); //DanDanDan
    }
}