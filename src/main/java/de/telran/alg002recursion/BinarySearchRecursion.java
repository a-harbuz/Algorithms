package de.telran.alg002recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,9,10,12,14};
        System.out.println(binSearch(arr,10,0,arr.length-1));

    }

    public static int binSearch (int[] arr, int num, int start, int end) {
        //Бинарный поиск через рекурсию
        if (start>end) throw new RuntimeException("Dont have nummer");
        int mid = (start+end)/2;

        if (num > arr[mid])  start=mid+1;
        else if (num < arr[mid]) end=mid-1;
        else return mid;
        return binSearch (arr, num, start, end);
    }
}
