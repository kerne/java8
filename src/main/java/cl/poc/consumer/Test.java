package cl.poc.consumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.IntStream;

class MyException extends RuntimeException {}

class YourException extends RuntimeException {}

public class Test {
    public static void main(String[] args) {
        try {
            throw new YourException();
        } catch(MyException | YourException e2){
            System.out.println("Caught");
        }
    }
}