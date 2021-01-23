package day4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int n=s.nextInt();
        int more8=0;
        int equalle1=0;
        int even=0;
        int odd=0;
        int sum=0;
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= rand.nextInt(11);
            if (arr[i]>8) {
                more8++;
            }
            if (arr[i]==1){
                equalle1++;
            }
            if (arr[i]%2==0 && arr[i]!=0){
                even++;
            }
            if (arr[i]%2!=0 && arr[i]!=0){
                odd++;
            }
            sum=sum+arr[i];
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + equalle1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);

    }
        }
