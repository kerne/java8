package cl.poc.concurrent;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        int[] sum = IntStream.rangeClosed(1, 3).map(i -> i * i).map(i -> i * i).toArray();

        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
            result += sum[i];
        }
        System.out.println(result);
    }
}