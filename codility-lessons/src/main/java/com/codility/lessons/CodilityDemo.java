package com.codility.lessons;

import java.math.BigInteger;

public class CodilityDemo {

    public static void main(String[] args) {
        int a[] = {1, 2, 1};
        int a1 = -2147483648;
        int a2 = -2147483648;
        System.out.println(a1 + a2);
        CodilityDemo codility = new CodilityDemo();
        System.out.println(codility.solution(a));
    }

    public int solution(int[] a) {

        try {
            if (a == null) {
                return -1;
            }

            if (a.length == 0) {
                return -1;
            }

            if (a.length > 100001) {
                return -1;
            }

            BigInteger totalSum = calculateSum(a);

            BigInteger sumFist = BigInteger.ZERO;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < -2147483648 || a[i] > 2147483647) {
                    return -1;
                }

                if (i > 0) {
                    sumFist = sumFist.add(BigInteger.valueOf(a[i - 1]));
                }

                BigInteger secondSum = totalSum.subtract(BigInteger.valueOf(a[i])).subtract(sumFist);

                if (secondSum.equals(sumFist)) {
                    return i;
                }
            }

        } catch (Exception e) {
            return -1;
        }

        return -1;
    }

    private BigInteger calculateSum(int[] a) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < a.length; i++) {
            sum = sum.add(BigInteger.valueOf(a[i]));
        }

        return sum;
    }
}
