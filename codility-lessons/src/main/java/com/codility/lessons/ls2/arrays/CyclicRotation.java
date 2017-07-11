/*
https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

class Solution { public int[] solution(int[] A, int K); }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

 */
package com.codility.lessons.ls2.arrays;

import java.util.Arrays;

/**
 * TODO to be improved: if k > a.length, then get i=k%a...
 *
 * @author user
 */
public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation arrays = new CyclicRotation();
        int a[] = {3, 8, 9, 7, 6};
        int k = 3;
        int[] solution = arrays.solution(a, k);
        System.out.println("Result: " + Arrays.toString(solution));
    }

    public int[] solution(int[] a, int k) {

        if (k == 0) {
            return a;
        }

        for (int i = 1; i <= k; i++) {
            System.out.println("---------- i = " + i + "-------------");
            a = shift(a);
        }

        return a;
    }

    private int[] shift(int[] a) {
        System.out.println("a: " + Arrays.toString(a));
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                b[i + 1] = a[i];
            } else {
                b[0] = a[i];
            }
        }

        System.out.println("b: " + Arrays.toString(b));

        return b;
    }
}
