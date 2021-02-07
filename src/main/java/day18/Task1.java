package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 2, -8, 2};
        System.out.println(recursionSum(numbers, numbers.length - 1));

    }

    public static int recursionSum(int[] number, int i) {
        if (i < 0) {
            return 0;
        }
        return (number[i] + recursionSum(number, i - 1));
    }
}