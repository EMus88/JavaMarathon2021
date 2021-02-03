package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        File fileForMissing = new File("src/main/resources/missing_shoes.txt");
        List<String> list = new ArrayList();
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(fileForMissing);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(";");
            if (Integer.parseInt(words[words.length - 1]) == 0) {
                for (int i = 0; i < words.length-1; i++) {
                    pw.print(words[i] + ", ");
                    pw.print(words[words.length-1]);// чтобы последний элемент заносился без пробела и запятой в конце
                }
                pw.println();
            }
        }
        pw.close();
    }
}



