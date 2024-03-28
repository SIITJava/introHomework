package ro.siit;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AlgorithmCallerTest {
    @Test
    public void testSumOfFirst100Numbers() {
        AlgorithmCaller caller = new AlgorithmCaller();
        assertEquals(5050, caller.sumOfFirst100Numbers());
    }

    @Test
    public void testFindSmallestNumber() {
        AlgorithmCaller caller = new AlgorithmCaller();
        int[] numbers = {5, 3, 8, 1, 9, 2};
        assertEquals(1, caller.findSmallestNumber(numbers));
    }

    @Test
    public void testFindMaxDigit() {
        AlgorithmCaller caller = new AlgorithmCaller();
        assertEquals(9, caller.findMaxDigit(59823));
    }

    @Test
    public void testIsPalindrome() {
        AlgorithmCaller caller = new AlgorithmCaller();
        assertTrue(caller.isPalindrome(1221));
        assertTrue(caller.isPalindrome(34143));
        assertFalse(caller.isPalindrome(12345));
    }

    @Test
    public void testFindPrimes() {
        AlgorithmCaller caller = new AlgorithmCaller();
        List<Integer> primes = caller.findPrimes(20);
        assertEquals(8, primes.size());
        assertTrue(primes.contains(2));
        assertTrue(primes.contains(3));
        assertTrue(primes.contains(5));
        assertTrue(primes.contains(7));
        assertTrue(primes.contains(11));
        assertTrue(primes.contains(13));
        assertTrue(primes.contains(17));
        assertTrue(primes.contains(19));
    }
}

