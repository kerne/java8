package cl.poc.future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<String> list = Arrays.asList("1", "2", "3");
//        List<String> list = Collections.emptyList();
        if(list.isEmpty()){
            return;
        }
        ExecutorService executors = Executors.newFixedThreadPool(list.size());

        List<CompletableFuture<String>> listFuture = list.stream().map(e -> CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(2000);
                if (e.equalsIgnoreCase("3")) {
                    throw new InterruptedException("Error");
                }
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException.getMessage());
                throw new RuntimeException(interruptedException.getMessage());
            }
            return e;
        })).collect(Collectors.toList());

        if (!listFuture.isEmpty()) {
            List<String> cList = allFuture(listFuture).get();

            if (cList != null) {
                System.out.println("Registros :" + cList.size());
                cList.forEach(System.out::println);
            }
        }
        if (!executors.isTerminated()) {
            System.out.println("Close");
            executors.shutdown();
        }

    }

    private static <T> CompletableFuture<List<T>> allFuture(List<CompletableFuture<T>> futures) {
        CompletableFuture[] cfs = futures.toArray(new CompletableFuture[futures.size()]);
        return CompletableFuture.allOf(cfs)
                .thenApply(e -> futures.stream().map(CompletableFuture::join).collect(Collectors.toList()))
                .exceptionally(e -> null);
    }

}
