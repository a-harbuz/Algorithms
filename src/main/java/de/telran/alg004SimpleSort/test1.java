package de.telran.alg004SimpleSort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {2,0,11,3,5,9,13,6,10,7,15,8};
        System.out.println(Arrays.toString(sortLOR(arr)));


    }

//    public static int[] sortLORtmp (int[] arr) {
//        int[] result = new int[arr.length];
//        int opEl = arr[arr.length-1];
//        int x=0;
//        int y= arr.length-1;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i]< opEl) {
//                result[x] = arr[i];
//                x++;
//            }
//            else {
//                result[y] = arr[i];
//                y--;
//            }
//        }
//        result[x+1] = opEl;
//        return result;
//    }


    public static int[] sortLOR (int[] arr) {
        int[] result = new int[arr.length];
        int opEl = arr[arr.length-1];
        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]< opEl) L.add(arr[i]);
            else R.add(arr[i]);
        }

        //Собираем в один массив
        int x=0;
        for (int i = 0; i < L.size(); i++) {
            result[x] = L.get(i);
            x++;
        }
        result[x] = opEl;
        x++;
        for (int i = 0; i < R.size(); i++) {
            result[x] = R.get(i);
            x++;
        }

//        List<Integer> total = new ArrayList<>();
          //List<Integer> total = List.of(1,2,4);
//        total.addAll(left);
//        total.addAll(pivot);
//        total.addAll(right);
        return result;
    }

} // End Class
