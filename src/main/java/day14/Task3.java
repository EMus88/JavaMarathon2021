package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("People.txt");
        try {
            System.out.println(parseFileToObjectList(file).toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (NumberFormatException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<Person> parseFileToObjectList(File file) throws FileNotFoundException {
        List list = new ArrayList();
        int indOfSpace;
        int year;
        String name;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            indOfSpace = line.indexOf(" ");
            year = Integer.parseInt(line.substring(indOfSpace + 1, line.length()));
            name = line.substring(0,indOfSpace);
            Person person = new Person(name,year);
            if (year < 0) {
                list.clear();
                throw new NumberFormatException();
            }
            list.add(person);
        }
        return list;
    }

}