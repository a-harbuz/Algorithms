package de.telran.alg001;

import java.util.Arrays;

public class Main006sortBuble {
    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3,9,7,22};
        System.out.println(Arrays.toString(bubleSort(arr)));
    }



    public static int[] bubleSort (int[] arr) {
        int temp=0;
        int count=0;
            do {
                count = 0;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }
            } while(count != 0);

        return arr;


    }

}
