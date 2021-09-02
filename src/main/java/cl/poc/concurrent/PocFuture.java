package cl.poc.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PocFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallFuture callFuture = new CallFuture();

        Future<Integer> nFuture = callFuture.call(5);

        while (!nFuture.isDone()) {
            System.out.println("Calculating");
            Thread.sleep(1000);
        }
        System.out.println(nFuture.get());
        callFuture.shutdown();
    }
}


class CallFuture {

    ExecutorService executorService = Executors.newSingleThreadExecutor();


    public Future<Integer> call(Integer n1) {
        return executorService.submit(() -> {
            Thread.sleep(10000);
            return n1 * n1;
        });
    }

    public void shutdown() {
        this.executorService.shutdown();
    }

}
