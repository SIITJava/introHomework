package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {

        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        return sum; // Placeholder return value
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {


        int min = numbers[0];

        for (int numar : numbers){
            if (min > numar){
                min = numar;
            }
        }
        return min; // Placeholder return value
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {

        int a;
        int max = 0;

        while (number > 0){
            a = number % 10;
            if (max < a){
                max = a;
            }
            number = number / 10;
        }

        return max; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {

        int nrIn = number;
        int invers = 0;

        while(number != 0){
            int ultimaCifra = number % 10;
            invers = invers * 10 + ultimaCifra;
            number /= 10;
        }
        if (invers == nrIn){
            return true;
        }

        return false; // Placeholder return value
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        return new ArrayList<>(); // Placeholder return value
    }
}

