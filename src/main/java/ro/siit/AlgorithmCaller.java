package ro.siit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
        int sum, number;

        sum = 0;

        for (number = 1;number <= 100; number++) {
            sum = sum + number;
        }

        return sum;
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        int dimension = numbers.length;
        Arrays.sort(numbers);
        return numbers[0];
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        int maxDigit = 0;
        int contor;

        while (number != 0) {

            contor = number % 10;

            if (contor > maxDigit) {
                maxDigit = contor;
            }

            number = number / 10;

        }
        return maxDigit; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == number);
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {

        List<Integer> prime = new ArrayList<>();

        for (int i = 2; i < limit; i++) {
            if(numberIsPrime(i)){
                prime.add(i);
            }
        }

        return prime;
    }

    private boolean numberIsPrime (int number){

        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}

