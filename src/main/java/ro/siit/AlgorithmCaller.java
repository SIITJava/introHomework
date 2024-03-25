package ro.siit;

public class AlgorithmCaller {

    // 1. Calculate the sum of the first 100 numbers higher than 0
    public static class SumaNumerelor {

        public static void main(String[] args) {
            int limita = 100;
            int suma = 0;

            for (int i = 1; i <= limita; i++) {
                suma += i;
            }

            System.out.println("Suma numerelor până la " + limita + " este: " + suma);
        }
    }

    // 2. Display the smallest number from an array of numbers
    public static class CelMaiMicNumarDinSir {

        public static void main(String[] args) {

            int[] numere = {2, 6, 9, 3, 7};
            int celMaiMic = gasesteCelMaiMicNumar(numere);

            System.out.println("Cel mai mic număr din array este: " + celMaiMic);
        }
        public static int gasesteCelMaiMicNumar(int[] arr) {
            int celMaiMic = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < celMaiMic) {
                    celMaiMic = arr[i];
                }
            }
            return celMaiMic;
        }
    }


    // 3. Display the max digit of a number
    public static class MaximulCifreiDinNumar {

        public static void main(String[] args) {

            int numar = 598236;
            int cifraMaxima = gasesteCifraMaxima(numar);

            System.out.println("Cifra maximă din număr este: " + cifraMaxima);
        }
        public static int gasesteCifraMaxima(int num) {
            int cifraMaxima = 0;
            while (num > 0) {
                int cifra = num % 10;
                cifraMaxima = Math.max(cifraMaxima, cifra);
                num /= 10;
            }
            return cifraMaxima;
        }
    }


    // 4. Check if a number is palindrome
    public static class NumarPalindrome {
        public static void main(String[] args) {
            int numar = 34143;
            boolean estePalindrome = verificaPalindrome(numar);

            if (estePalindrome) {
                System.out.println(numar + " este un număr palindrom.");
            } else {
                System.out.println(numar + " nu este un număr palindrom.");
            }
        }
        public static boolean verificaPalindrome(int num) {

            int numarOriginal = num;
            int numarInversat = 0;

            while (num > 0) {
                int cifra = num % 10;
                numarInversat = numarInversat * 10 + cifra;
                num /= 10;
            }
            return numarOriginal == numarInversat;
        }
    }


    // 5. Display all the prime numbers lower than a given number
    public static void main(String[] args) {
        int limita = 72;
        System.out.println("Numere prime mai mici decât " + limita + ":");
        afiseazaNumerePrime(limita);
    }
    public static boolean estePrim(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void afiseazaNumerePrime(int limita) {
        for (int i = 2; i < limita; i++) {
            if (estePrim(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
