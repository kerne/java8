package cl.poc.concurrent.runnable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("Group1");

        Thread thread;
        for (int i = 0; i < 5; i++) {
            thread = new Thread(group, new Task(), "Thread" + i);
            thread.start();
        }
        group.interrupt();

    }
}
