package cl.poc.concurrent.runnable;

public class Task implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted :" + Thread.currentThread().getName());
        }

        System.out.println("Finished :" + Thread.currentThread().getName());

    }
}
