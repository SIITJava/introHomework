package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("suma primelor 100 de numere este " + sum);
            return sum;
        }


    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array-ul nu poate fi null sau gol");
        }
        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return smallest;
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        if(number < 0) {
            number = -number;
        }
        if(number < 10) {
            return number;
        }

        int maxDigit = 0;

        while (number != 0){
            if(maxDigit < number % 10){
                maxDigit = number % 10;
            }
            number /= 10;
        }
        System.out.println(maxDigit);
        return maxDigit; // Placeholder return value

    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        String numAsString = Integer.toString(number);
        int left = 0;
        int right = numAsString.length() - 1;

        while (left < right) {

            if (numAsString.charAt(left) != numAsString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int num = 2; num < limit; num++) {

            if (isPrime(num)) {
                primes.add(num);
            }
        }

        return primes;
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}




