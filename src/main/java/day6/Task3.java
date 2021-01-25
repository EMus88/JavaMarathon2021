package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher ticher = new Teacher("Алексей Иванович", "физика");
        Student Zhora = new Student("Жора");
        ticher.evaluate(Zhora);

    }
}