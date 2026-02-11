import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int CONST = 3;


        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Person person2 = new Person(name);
        person2.printName();
    }
}