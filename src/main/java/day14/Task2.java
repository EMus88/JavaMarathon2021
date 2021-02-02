package day14;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        File file = new File("People.txt");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (NumberFormatException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> list = new ArrayList();
        int indOfSpace;
        int year;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            indOfSpace = line.indexOf(" ");
            year = Integer.parseInt(line.substring(indOfSpace + 1, line.length()));
            if (year < 0) {
                list.clear();
                throw new NumberFormatException();
            }
            list.add(line);
        }
        return list;
    }

}

