package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        int s;
        s=0;
        for (int i=1;i<=100;i++)
            s=s+i;
        return s;
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        int min=numbers[0];
        for (int i=1;i<numbers.length;i++)
            if(min>numbers[i])min=numbers[i];
        return min;
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        int i=number%10;
        while(number!=0){
            if(number%10>i)i=number%10;
            number=number/10;
        }
        return i;
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        int b1=0,aux=number;
        while(aux>0){
            b1=b1*10+aux%10;
            aux=aux/10;
        }
        return number==b1;

    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        int nr=0;
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i<=limit;i++) {
            for (int d = 2; d <= i / 2; d++) if (i % d == 0) nr++;
            if (nr == 0) primes.add(i);
            else nr = 0;
    }
        return primes;
    }
}

