package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random rand = new Random();
        String mark = new String();
        int int_mark = rand.nextInt(3)+2;
        switch (int_mark) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + "оцнил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку: " + mark);
    }
}
