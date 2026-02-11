public class Person {

    public final double PI;
    private String name;

    public Person(String name) {
        this.name = name;
        PI = 3.14;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Имя : " + name);
    }

}
