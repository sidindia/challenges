/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

    The number of elements initialized in nums1and nums2 are m and n respectively.


    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]


*/

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int array1[] = { 4, 8, 10, 0, 0, 0 };
        int array2[] = { 20, 30, 50 };

        merge(array1, 3, array2, 3);
    }

    public static void merge(int[] array1, int m, int[] array2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[k] = array1[i];
                i--;
            } else {
                array1[k] = array2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            array1[k--] = array2[j--];
        }

        System.out.println(Arrays.toString(array1));
    }

}
