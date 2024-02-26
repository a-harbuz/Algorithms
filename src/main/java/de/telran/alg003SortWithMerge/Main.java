package de.telran.alg003SortWithMerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] l = {0,1,4,8,10,12,15};
        int[] r = {2,3,5,6,7};
        System.out.println(Arrays.toString(merge(l,r)));

        int[] m = {2,0,8,3,5,9,6,10,7};
        System.out.println(Arrays.toString(sortWithMerge(m)));
    }

    public static int[] merge (int[] arrL, int[] arrR) {
        int[] result = new int[arrL.length+arrR.length];
        int i=0;
        int j=0;
        int k=0;
        do {
            if (arrL[i] < arrR[j]) {
                result[k] = arrL[i];
                i++;
                k++;
            } else {
                result[k] = arrR[j];
                j++;
                k++;
            }
        } while (i<arrL.length && j<arrR.length);

        while (i<arrL.length) {
            result[k] = arrL[i];
            i++;
            k++;
        }

        while (j<arrR.length) {
            result[k] = arrR[j];
            j++;
            k++;
        }

        return result;
        //Arrays.sort();
        //DualPivotQuicksort
    }

    public static int[] sortWithMerge (int[] arr) {
        int mid = arr.length/2;
        //if (mid==0) return arr;
        if (arr.length<=1) return arr;
        int[] leftArr = Arrays.copyOfRange(arr,0,mid);
        int[] rightArr = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(sortWithMerge(leftArr), sortWithMerge(rightArr));
    }


}
