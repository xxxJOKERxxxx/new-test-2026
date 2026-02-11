import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Как зовут вашего друга?");
        String name = sc.nextLine();

        System.out.println("Сколько лет вашему другу?");
        int age = sc.nextInt();

        System.out.println("Моему другу " + name + " сейчас " + age + " лет!" );
    }
}