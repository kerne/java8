package cl.poc.runnable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {


        Thread thread1 = new Thread(new Counter());
        Thread thread2 = new Thread(new Counter());
        Thread thread3 = new Thread(new Counter());

        Arrays.asList(thread1, thread2, thread3).stream().forEach(e -> e.start());
    }
}


class Counter implements Runnable {

    private static AtomicInteger counter = new AtomicInteger(3);

    @Override
    public void run() {
        System.out.println(counter.getAndDecrement());
    }
}