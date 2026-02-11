import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person2 = new Person("Andrei");
        System.out.println(person2.getName());
        person2.setName("Alexander");
        System.out.println(person2.getName());


    }
}