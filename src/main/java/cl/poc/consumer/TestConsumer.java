package cl.poc.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 */
public class TestConsumer {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);

        System.out.println(result);


        List<String> letras = Arrays.asList("a", "b", "c", "d");
        String r = letras
                .stream()
                .reduce("x", String::concat);

        System.out.println(r);

    }
}
