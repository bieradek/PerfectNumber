package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // 1 2 3 // true
        System.out.println(isPerfectNumber(28)); // 1 2 4 7 14 // true
        System.out.println(isPerfectNumber(-1)); // false
        System.out.println(isPerfectNumber(496));  // 1 2  // true
        System.out.println(isPerfectNumber(5)); //false
        System.out.println(isPerfectNumber(7));
        System.out.println(isPerfectNumber(8));
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(11));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sumFactors = 0;
        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
//                System.out.println("Factor has been found and is equal to " + factor);
                sumFactors = sumFactors + factor;
//                System.out.println("Sum of the factors is: " + sumFactors);
                if (sumFactors == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take number 6:
It's proper divisors are 1,2 and 3(since 6 is the value of the perfect number, it is excluded) and the sum of its proper divisors is 1+2+3=6;
 */
