package com.narendra.java.recursion;

public class BinarySearch {

    static int binarySearch(int a[], int left, int right, int k) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (k == a[mid])
            return mid;
        if (k < a[mid])
            return binarySearch(a, left, mid - 1, k);
        return binarySearch(a, mid + 1, right, k);

    }

    public static void main(String[] args) {
        int input[] = {-1, 0, 1, 2, 3, 4, 7, 9, 10, 20};

        int k = 20;

        System.out.println(binarySearch(input, 0, input.length-1, k));
    }
}
