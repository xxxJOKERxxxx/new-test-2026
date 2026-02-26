import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int number = 10;
        Scanner scanner = new Scanner(System.in);
        int i =  scanner.nextInt();

        if (i == 0) {
            System.out.println("деление на ноль запрещено!!!");
        }
        System.out.println(number/i);
    }

}