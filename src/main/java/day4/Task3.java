package day4;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[12][8];
        int[] sum = new int [12];
        int maxsum=0;
        int index = 0;
        for (int i=0; i<12;i++){
            for (int j=0; j<8;j++){
                arr[i][j] = rand.nextInt(50);
                System.out.print("\t" + arr[i][j]);
                sum[i]=sum[i]+arr[i][j];
            }
            System.out.print(" сумма: " + sum[i]);
            System.out.println();
            if (sum[i]>=maxsum){
                maxsum=sum[i];
                index=i;
            }
            }
        System.out.println("Индекс: " + index);
    }
}
