package cl.poc.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class PocFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallFuture callFuture = new CallFuture();

        System.out.println(future(() -> callFuture.call(5)));

        callFuture.shutdown();
    }


    public static Integer future(Supplier<Future<Integer>> supplier) throws InterruptedException, ExecutionException {
        Future<Integer> integerFuture = supplier.get();
        while (!integerFuture.isDone()) {
            System.out.println("Waiting...");
            Thread.sleep(1000);
        }
        return integerFuture.get();
    }
}


class CallFuture {

    ExecutorService executorService = Executors.newSingleThreadExecutor();


    public Future<Integer> call(Integer n1) {
        return executorService.submit(() -> {
            Thread.sleep(5000);
            return n1 * n1;
        });
    }

    public void shutdown() {
        this.executorService.shutdown();
    }

}
