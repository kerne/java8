package cl.poc.collections;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EnumMapMain {

    public static void main(String[] args) {
        EnumMap<Numero, String> numbers = new EnumMap<>(Numero.class);

        new ArrayList<>(Stream.of(Numero.values())
                .map(numero -> {
                    numbers.put(numero, numero.name());
                    return numbers;
                })
                .collect(Collectors.toList()))
                .forEach(System.out::println);

    }

    enum Numero {
        UNO, DOS, TRES
    }

}
