package cl.poc.excercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeSpec {

    @Test
    public void ok_when_word_is_a_palindrome() {
        assertTrue(Palindrome.isPalindrome("reconocer", "reconocer"));
    }

    @Test
    public void nok_when_word_is_a_palindrome() {
        assertFalse(Palindrome.isPalindrome("noreconocer", "reconocer"));
    }

}
