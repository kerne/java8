package cl.poc.excercises;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeSpec {

    @Test
    public void ok_when_word_is_a_palindrome() {
        assertTrue(Palindrome.isPalindrome("reconocer", "reconocer"));
    }

}
