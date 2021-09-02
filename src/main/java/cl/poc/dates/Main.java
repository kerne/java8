package cl.poc.dates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("M", "R", "A", "P");

        Collections.sort(list, null);

        list.stream()
                .filter(e -> e.equalsIgnoreCase("a"))
                .peek(e -> System.out.println("E" + e));
    }
}

