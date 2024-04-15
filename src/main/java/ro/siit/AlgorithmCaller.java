package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
            int sum = 0; // Initialize sum to 0
            for (int i = 1; i <= 100; i = i + 1) {
                sum += i; // Add each number to sum
            }
            return sum; // Return the calculated sum
        }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        // Your implementation here
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }

            int smallest = numbers[0]; // Start with the first element as the smallest
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i]; // Update smallest if a smaller number is found
                }
            }
            return smallest; // Return the smallest number found
        }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        // Your implementation here
        int maxDigit = -1; // Assume number is non-negative
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            number /= 10;
        }
        return maxDigit;
        }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        // Your implementation here
        if (number < 0) {
                return false; // Assume false for negative numbers
            }
            int originalNumber = number;
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return originalNumber == reversedNumber;
        }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        // Your implementation here
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

        private boolean isPrime (int n) {
            for (int i = 2; i <= n / 2; i++) {
                if (n%i == 0) {
                    return false; // Not prime if divisible by any number other than 1 and itself
                }
            }
            return true; // Number is prime
        }
}

