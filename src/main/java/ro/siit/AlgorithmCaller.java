package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += 1;// Your implementation here
            }
        }
        return 0; // Placeholder return value
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        public static void main(String[] args) {
            int[] numbers = [10, 5, 8, 3, 12, 7];
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {// Your implementation here
            }
        }
        return 0; // Placehold
        System.out.println("Smallest number in the array: " + min);   // er return value
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
            public static void main(String[] args) {
                int number = 78965;
                int maxDigit = 0;
                while (number > 0) {
                    int digit = number % 10;
                    if (digit > max digit) {
                        maxDigit = digit;
                    }
                    number /= 10;
            }
        }
        System.out.println("Max digit of the number: " + maxDigit);// Your implementation here
        return 0; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
            public static void main(String[] args) {
                int number = 1221;
                int reversedNumber = 0;
                int orriginalNumber = number;

                while (number != 0) {
                    int reminder =  number% 10;
                    reversedNumber = reversedNumber * 10 + reminder;
                }

                if (originalNumber == reversedNumber) {
                    System.out.println("The number is a palindrome.");
                } else {
                    System.out.println("The number is not a palindrome.");
                }
            }


    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        public static void main(String[] args) {
            int limit = 50;
            System.out.println("Prime numbers up to " + limit + ":");
            for (int i = 2; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                }
            }
        return new ArrayList<>();
            public static boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                ]
                return true;
                }
            }


