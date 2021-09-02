package cl.poc.bundle;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;


class P {
    private int var = 100;
    class Q {
        String var = "Java";
        void print() {
            System.out.println(var);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new P().new Q().print();
    }
}