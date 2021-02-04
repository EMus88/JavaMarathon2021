package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random random = new Random();
        FileWriter writer = new FileWriter(file1);
        for (int i = 0; i < 1000; i++) {
            writer.write(random.nextInt(100) + " ");
        }
        writer.close();
        FileWriter writer2 = new FileWriter(file2);
        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + Integer.parseInt(numbers[i]);
            if (i > 1 && (i + 1) % 20 == 0) {
                average = sum / 20;
                writer2.write(average + " ");
                sum = 0;
            }
        }
        writer2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (String number : numbers) {
            sum = sum + Double.parseDouble(number);
        }

        System.out.println(Math.round(Math.floor(sum)));
    }
}
