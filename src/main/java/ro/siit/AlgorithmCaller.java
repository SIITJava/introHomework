package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        // Your implementation here
            int sum = 0;
            for (int i=1; i<=100; i++){
                sum+=i;
            }
            return sum;
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        // Your implementation here
            int smallestNumber= numbers[0];
            for (int element:numbers){
                if(element<smallestNumber) smallestNumber=element;
            }
            return smallestNumber;
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        // Your implementation here
            if(number<0) number*=-1;
            int[] digitsArray= createDigitsArray(number);
            //System.out.println(Arrays.toString(digitsArray));
            //System.out.println(findMaxNumber(digitsArray));
            return findMaxNumber(digitsArray);
        }


    public int findMaxNumber(int [] array){
        int maxNumber= array[0];
        for (int element:array){
            if(element>maxNumber)maxNumber=element;
        }
        //System.out.println(maxNumber);
        return maxNumber;
    }

    public int[] createDigitsArray(int number) {
        int length = ("" + number).length();
        int[] digitsArray = new int[length];
        //System.out.println(Arrays.toString(digitsArray));
        for (int i = length - 1; i >= 0; i--) {
            digitsArray[i] = number % 10;
            number -= digitsArray[i];
            number /= 10;
        }
        return digitsArray;
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        // Your implementation here
            if(number<0) {
                return false;
            }

            int[] digitsArray= createDigitsArray(number);
            //System.out.println(Arrays.toString(digitsArray));

            boolean test=true;
            for(int i=0; i<= (digitsArray.length/2)-1; i++){
                //System.out.println(digitsArray[i]);
                //System.out.println(digitsArray[digitsArray.length-1-i]);
                if(digitsArray[i] != digitsArray[digitsArray.length-1-i]) {
                    test= false;
                    break;
                }
            }
            //System.out.println(test);
            return test;
        }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        // Your implementation here
        List <Integer> primeNumbers= new ArrayList<>();
            for(int i=limit-1; i>=2; i--){
                if (isPrime(i)){
                    primeNumbers.add(i);
                }
            }
        return primeNumbers;
    }

    public boolean isPrime (int number){
        if(number<2) return false;
        boolean test= true;
        for(int i=2; i<=number/2; i++){
            if(number%i ==0) {
                test=false;
                break;
            }
        }
        return test;
    }
}

