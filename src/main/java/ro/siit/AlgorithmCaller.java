package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
        int s=0;  //Placeholder for sum
        for(int i=0;i<=100;i++){
            s=s+i;
        }

        return s; // Placeholder return value
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        int smallest=numbers[0]; //Placeholder for the smallest number from array
        for(int n:numbers)
            {
                if(n<smallest)
                    smallest=n;
            }
        return smallest; // Placeholder return value
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        // Your implementation here
        int maxDigit=number%10;
        int digit=0;
        while(number > 0){
            digit=number%10;

            if(digit>maxDigit) {
                maxDigit=digit;
            }

            number=(number-digit)/10;
        }

        return maxDigit; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        // Your implementation here
        int rotateNumber=0;
        int initialNumber=number;
        while(number>0){
            rotateNumber=rotateNumber*10+number%10;

            number=(number-number%10)/10;
        }

        // Placeholder return value
        return initialNumber == rotateNumber;
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        // Your implementation here
        List<Integer> primes =new ArrayList<>(); //New arrayList where is added every prime number
        while(limit>0){
            if(isPrime(limit)){
                primes.add(limit);}

            limit--;
        }
        return primes; // Placeholder return value
    }


    //New method that check if a number is prime or not
    public boolean isPrime(int number){
            int index=number;
            int contor=0;

            while(index>0){
                if(number%index==0){
                    contor++;
                }
                index--;
            }
            if(contor==2)
                return true;
            else
                return false;
    }
}

