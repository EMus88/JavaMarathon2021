package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Количество чисел в файле не равно 10");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        int sum = 0;
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        if (numbersString.length != 10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] numbers = new int[10];
        int counter = 0;
        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
            sum = sum + numbers[counter - 1];
        }
        scanner.close();
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
