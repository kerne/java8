package cl.poc.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    enum Numbers {
        ONE("ONEs"), TWO("TWO"), THREE("THREE");

        private String name;

        Numbers(String name) {
            this.name = name;
        }

        public static Stream<Numbers> stream() {
            return Stream.of(Numbers.values());
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        Consumer<String> consumer = (e) -> Numbers.stream().filter(n -> n.name().equalsIgnoreCase(e)).forEach(data -> {
            System.out.println(e);
        });

        Arrays.asList("ONE", "TWO", null).forEach(e -> {
            consumer.accept(e);
        });

        Supplier<List<Numbers>> supplier = () -> Numbers.stream().collect(Collectors.toList());
//        supplier.get().forEach(System.out::println);



        List<String> finalTiposProductos = Arrays.asList("a", "b", "c");
        List<String> numProductos = Arrays.asList("a", "b", "c");

        Stream<String> twoList = Stream.of(finalTiposProductos, numProductos).flatMap(Collection::stream);
        List<String> prodSelec = twoList.collect(Collectors.toList());
        System.out.println(prodSelec);
    }


    public static List<String> combine() {

        List<String> prodSelec = new ArrayList<>();

        List<String> finalTiposProductos = Arrays.asList("a", "b", "c");
        List<String> numProductos = Arrays.asList("a", "b", "c");

        Stream<String> t = Stream.of(finalTiposProductos, numProductos).flatMap(Collection::stream);

        List<String> join = t.collect(Collectors.toList());

        IntStream.range(0, finalTiposProductos.size())

                .forEach(i -> {

                    prodSelec.add(finalTiposProductos.get(i));

                    prodSelec.add(numProductos.get(i));

                });

        return prodSelec;
    }

}
