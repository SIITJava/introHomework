package ro.siit;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public int sumOfFirst100Numbers() {
        public class IntroToJavaTema1 {

            public static void main(String[] args) {
                int nmb;
                int total = 0;

                for (nmb = 1; nmb <= 100; nmb++) {
                    total = total + nmb;
                }
                System.out.println(total);

            }
        }

        return 5050; // Placeholder return value
    }

    // 2. Display the smallest number from an array of numbers
    public int findSmallestNumber(int[] numbers) {
        public class IntroToJavaTema2 {

            public static void main(String[] args) {

                //Initialize array
                int [] arr = new int [] {25, 11, 7, 75, 56};
                //Initialize min with first element of array.
                int min = arr[0];
                //Loop through the array
                for (int i = 0; i < arr.length; i++) {
                    //Compare elements of array with min
                    if(arr[i] <min)
                        min = arr[i];
                }
                System.out.println("Smallest element present in given array: " + min);
            }
        }
        return 0; // Placeholder return value
    }

    // 3. Display the max digit of a number
    public int findMaxDigit(int number) {
        import java.util.Scanner;

        public class IntroToJavaTema3 {

            public static void main(final String args[]) {

                final Scanner in = new Scanner(System.in);

                int a, b, c;
                System.out.println("Please enter 3 digit number. Ex : 197, 187, 981 etc.");
                final int num = in.nextInt();

                a = num / 100;
                b = (num / 10) % 10;
                c = num % 10;

                if (a > b) {
                    if (a > c) {
                        System.out.println(a);
                    } else {
                        System.out.println(c);
                    }
                } else {
                    if (b > c) {
                        System.out.println(b);
                    } else {
                        System.out.println(c);
                    }
                }
            }
        }
        return 0; // Placeholder return value
    }

    // 4. Check if a number is palindrome
    public boolean isPalindrome(int number) {
        import java.util.Scanner;

        public class IntroToJavaTema4 {

            public static void main(String args[]) {
                int x, number, y = 0, temp = 0;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter any number: ");
                number = s.nextInt();
                x = number;
                while (number > 0) {
                    x = number % 10;
                    number = number / 10;
                    temp = temp * 10 + x;
                }
                y = x; // Set y to the original number
                if (temp == y) {
                    System.out.println("Number is Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
            }
        }
        return false; // Placeholder return value
    }

    // 5. Display all the prime numbers lower than a given number
    public List<Integer> findPrimes(int limit) {
        public class MyClass {
            static void primenumber(int MyNum) {
                int n = 0;
                if (MyNum == 2 || MyNum == 3){
                    System.out.print(MyNum + " ");
                }
                else if (MyNum % 6 == 1 || MyNum % 6 == 5) {
                    for(int i = 2; i*i <= MyNum; i++) {
                        if(MyNum % i == 0){
                            n++;
                            break;
                        }
                    }

                    if (n == 0){
                        System.out.print(MyNum + " ");
                    }
                }
            }
        return new ArrayList<>(); // Placeholder return value
    }
}

