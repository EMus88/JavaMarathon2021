package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = new String();
        long start1 = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            str = str + i + " ";
        }
        long stop1 = System.nanoTime();
        long worktime1 = stop1 - start1;
        System.out.println(worktime1);

        StringBuilder stringBuilder = new StringBuilder();
        long start2 = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i + " ");
        }
        long stop2 = System.nanoTime();
        long worktime2 = stop2 - start2;
        System.out.println(worktime2);
    }
}
