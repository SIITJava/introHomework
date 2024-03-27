    package ro.siit;
    
    import java.util.ArrayList;
    
    public class AlgorithmCaller {
    
        // 1. Calculate the sum of the first 100 numbers higher than 0
        public int sumOfFirst100Numbers() {
            int sum = 0;
            for (int i = 1; i < 101; i++ ) {
                sum += i;
            }
            return sum;
        }
    
        // 2. Display the smallest number from an array of numbers
        public int findSmallestNumber(int[] numbers) {
            int smallest = numbers[0];
            for ( int i = 0; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            System.out.println(smallest);
            return smallest;
        }
    
        // 3. Display the max digit of a number
        public int findMaxDigit(int number) {
            String numberToString = Integer.toString(number);
            
            int maxDigit = Character.getNumericValue(numberToString.charAt(0));
            
            for (int i = 1; i < numberToString.length(); i++) {
                int digit = Character.getNumericValue(numberToString.charAt(i));
                
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
            
            return maxDigit;
        }
    
        // 4. Check if a number is palindrome
        public boolean isPalindrome(int number) {
            String numberToString = Integer.toString(number);
            String reversedNumber = new StringBuilder(numberToString).reverse().toString();
	        
            return numberToString.equals(reversedNumber);
        }
    
        // 5. Display all the prime numbers lower than a given number
        public boolean findPrimes(int limit) {
            if (limit < 0) {
                return false;
            }
            
            for (int i = 2; i <= limit; i++) {
	            return limit % i != 0;
            }
        }
    }
    
