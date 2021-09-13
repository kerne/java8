package cl.poc.excercises;

import java.util.stream.Stream;

public class Palindrome {
    public static boolean isPalindrome(String word, String palindrome) {
        return Stream.of(word)
                .filter(s -> s.length() == palindrome.length())
                .filter(s -> 0 == s.compareToIgnoreCase(new StringBuffer(palindrome).reverse().toString()))
                .count() != 0;
    }
}
