package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        int[] sum = new int[arr.length-2];
        int maxsum=0;
        int index=0;
        for (int i=0; i<100; i++) {
            arr[i] = rand.nextInt(10000);
        }
        for (int i=0; i< arr.length-2;i++){
            for(int j=i; j<i+3;j++){
                sum[i]=sum[i]+arr[j];
            }
            if (sum[i] > maxsum){
                maxsum=sum[i];
                index=i;
            }
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(arr));
        System.out.println("Суммы: " + Arrays.toString(sum));
        System.out.println("Индекс: " + index);
    }
}
