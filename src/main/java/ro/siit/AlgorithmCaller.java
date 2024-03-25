package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
        return 100*101/2;
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        // Your implementation here
        if(numbers == null){
            return 0; // Placeholder return value
        }
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        // Your implementation here
        if (number < 0){
            number = -number;
        }

        if (number < 10){
            return number;
        }

        int maxDigit = 0;

        while(number != 0){
            if (maxDigit < number % 10){
                maxDigit = number % 10;
            }
            number /= 10;
        }

        return maxDigit;
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        // Your implementation here
        int temp = number;
        int palindrome = temp % 10;
        temp /= 10;

        while (temp != 0){
            palindrome = palindrome * 10 + temp % 10;
            temp /= 10;
        }

        return palindrome == number; // Placeholder return value
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        // Your implementation here
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = limit - 1; i >= 2 ; i--) {
            boolean check = true;
            for(int d = 2; d <= Math.sqrt(i); d++){
                if (i % d == 0) {
                    check = false;
                    break;
                }
            }
            if (check){
                primes.add(i);
            }
        }
        return primes; // Placeholder return value
    }
}

