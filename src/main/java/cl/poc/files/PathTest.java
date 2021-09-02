package cl.poc.files;

import java.io.Console;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PathTest {


    public static void main(String[] args) {

        Console console = System.console();

        char[] pwd = console.readPassword("Enter Password");

        System.out.println(new String(pwd));

    }
}

class Task extends RecursiveTask {


    @Override
    protected Long compute() {
        return null;
    }
}