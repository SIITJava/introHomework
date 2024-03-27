package ro.siit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.reverse;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        int i =100
        int sum = (i)*(i+1)/2
        return 5050; // Placeholder return value
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        int arr[] = {9, -1, 13, -12, 99};
        int min = arr[0];
        for(int n=0; n< arr.length; n++)
            min = arr[n];
        System.out.println(min);
        return min; // Placeholder return value
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        int a, b, c;
        int highestdigit
        if (a > b && a > c) {
            System.out.println(a);
                        else{
                if (a < c)
                    System.out.println(c);
                else {
                    System.out.println(b);
                }
            }
        }
        return highestdigit; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
      int num = 145541;
        int rev = reverse(num)
              if (num == rev){
                  System.out.println(" Your number is a palindrome");
              } else {
                  System.out.println(" Your number is not a palindrome");
              }
        return false; // Placeholder return value
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {

        return new ArrayList<>(); // Placeholder return value
    }
}

