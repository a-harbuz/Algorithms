package de.telran.alg004SimpleSort;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,0,11,3,5,9,13,6,10,7,15,8};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(quickSort(list));

    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr){
        if (arr.size()<=1) return arr;
        int pivot = arr.get(arr.size()-1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i=0;i<arr.size()-1;i++){
            if (arr.get(i)<pivot) left.add(arr.get(i));
            else right.add(arr.get(i));
        }

        //склеиваем массив
        ArrayList<Integer> total = new ArrayList<>();
        total.addAll(quickSort(left));
        total.add(pivot);
        total.addAll(quickSort(right));

        return total;
    }

}
