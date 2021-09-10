package cl.poc.collections;


import org.springframework.data.util.Pair;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairMain {
    public static void main(String[] args) {

        Map<Numero, Optional<String>> valr = get();

        valr.entrySet()
                .stream().forEach(System.out::println);

    }

    private static Map<Numero, Optional<String>> get() {
        return Stream.of(Numero.values())
                .map(numero -> CompletableFuture.supplyAsync(() -> {
                    try {
                        if (Numero.UNO.equals(numero)) {
                            return Pair.of(numero, Optional.ofNullable(numero.name()));
                        }
                    } catch (RuntimeException e) {
                    }
                    return Pair.of(numero, Optional.ofNullable(numero.name()));
                }))
                .map(CompletableFuture::join)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
    }

}
