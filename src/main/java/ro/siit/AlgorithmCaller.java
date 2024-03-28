package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
            int sum = 0; // Initialize sum to 0
            for (int i = 1; i <= 100; i++) {
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

            number = Math.abs(number); // Convert to absolute value to handle negative numbers

            if (number == 0) {
                return 0; // If the number is 0, its max digit is 0
            }

            int maxDigit = 0; // Initialize maxDigit to the smallest possible digit

            while (number > 0) {
                int currentDigit = number % 10; // Get the last digit
                if (currentDigit > maxDigit) {
                    maxDigit = currentDigit; // Update maxDigit if currentDigit is greater
                }
                number /= 10; // Remove the last digit
            }

            return maxDigit; // Return the max digit found
        }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        // Your implementation here

            number = Math.abs(number); // Convert to absolute value to handle negative numbers
            int originalNumber = number; // Store the original number for comparison
            int reverse = 0; // Initialize the reversed number

            while (number > 0) {
                int lastDigit = number % 10; // Get the last digit
                reverse = reverse * 10 + lastDigit; // Build the reversed number
                number /= 10; // Move to the next digit
            }

            return originalNumber == reverse; // Check if the original and reversed are the same
        }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        // Your implementation here
            List<Integer> primes = new ArrayList<>();
            for (int num = 2; num < limit; num++) {
                if (isPrime(num)) {
                    primes.add(num); // Add number to list if it is prime
                }
            }
            return primes;
        }

        private boolean isPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Not prime if divisible by any number other than 1 and itself
                }
            }
            return true; // Number is prime
        }
}

