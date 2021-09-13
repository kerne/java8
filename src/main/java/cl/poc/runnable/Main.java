package cl.poc.runnable;

import lombok.SneakyThrows;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread = new Thread(counter);

        thread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter.doStop();
    }
}


class Counter implements Runnable {

    private boolean doStop;

    @SneakyThrows
    @Override
    public void run() {
        System.out.printf("Thread %s%n", Thread.currentThread().getName());
        while (keepRunning()) {
            System.out.print(String.join(".", "."));
            Thread.sleep(500);
        }
    }

    public synchronized void doStop() {
        this.doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !this.doStop;
    }
}