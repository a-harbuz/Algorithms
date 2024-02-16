package de.telran.alg001;

import java.util.Arrays;

public class Main006sortBuble {
    public static void main(String[] args) {
        int[] arr = {2,22,4,5,1,23,3,9,7};
        System.out.println(Arrays.toString(bubleSort(arr)));
        //System.out.println(Arrays.toString(stoneSort(arr)));
    }


    /// Большие цифры подымаются вверх.
    public static int[] bubleSort (int[] arr) {
        /// Идеальная реализация bubleSort
        int count=0;
            do {
                count = 0;
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }
            } while(count != 0);

        return arr;
    }


    /// Kamennaya Sortirovka = цифры бегут по другому, мелкие падают в низ.
    public static int[] stoneSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return null;
    }


    public static int[] bubbleSortV2 (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 2; j >=i; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


    //поиск отсутствующего
//    function findMissingNumber(arr) {
//        let sum1 = 0;
//        for (let i = 0; i < arr.length; i++) {
//            sum1 += arr[i];
//        }
//        let sum2 = 0;
//        for (let i = 1; i < arr.length + 2; i++) {
//            sum2 += i;
//        }
//
//        return sum2 - sum1;
//    }
//    let array = [5, 3, 2, 1];


} // End of Class