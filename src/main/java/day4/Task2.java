package day4;
import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 0;
        int min=10000;
        int end0=0;
        int sum0=0;
        int[] arr = new int[100];
        for (int i=0; i<100; i++) {
            arr[i] = rand.nextInt(10000);
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]==0 || arr[i]%10==0){
                end0++;
                sum0=sum0+arr[i];
            }
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(arr));
        System.out.println("наибольший элемент массива :" + max);
        System.out.println("наименьший элемент массива :" + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 :" + end0);
        System.out.println("сумму элементов массива, оканчивающихся на 0 :" + sum0);
    }
}
