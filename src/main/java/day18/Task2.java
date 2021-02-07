package day18;

public class Task2 {
    public static void main(String[] args) {
        long num = 45777777345775445l;
        System.out.println(count7(num));

    }

    public static long count7(long num) {
        if (num >= 10) {
            if (num % 10 == 7) {
                return 1 + count7(num/10);
            }
            return count7(num/10);
        }
        return 0;
    }
}

