package com.tts.bigOpractice;
import java.math.BigInteger;
public class LinearTimeAlgorithm {


    /**
     * Calculate the sum from 1 to N
     *
     */


        /**
         * O(n) - Calculate the sum from 1 to N via sum all the numbers
         */
        public BigInteger sumOfArithmeticSerie_via_add_all(long n) {
            BigInteger sum = BigInteger.valueOf(0);
            for (long i = 1; i <= n; i++) {
                sum = sum.add(BigInteger.valueOf(i));
            }
            return sum;
        }

}
