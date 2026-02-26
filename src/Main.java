import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int i = 1;
        stackOverflowGenerator(i);
    }
    public static int stackOverflowGenerator(int i) {
       return stackOverflowGenerator(i);

    }

}