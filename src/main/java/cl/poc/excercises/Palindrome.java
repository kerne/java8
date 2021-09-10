package cl.poc.excercises;

import java.util.stream.Stream;

public class Palindrome {

    public static boolean isPalindrome(String word, String palindrome) {
        return (long) (int) Stream.of(word)
                .filter(s -> s.length() == palindrome.length())
                .filter(s -> s.compareToIgnoreCase(
                        new StringBuffer(palindrome).reverse().toString()
                ) == 0)
                .count() != 0;
    }
}
