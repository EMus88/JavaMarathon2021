package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  throws FileNotFoundException{
        File file = new File("Text.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            sum = sum + Integer.parseInt(number);
        }
        average = sum / numbers.length;

        scanner.close();

        System.out.println(average);
        System.out.format("%.3f%n",average);

    }

}

