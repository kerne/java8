package cl.poc.runnable;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Player extends Thread {
    CyclicBarrier cb;

    public Player() {
        super();
    }

    public Player(CyclicBarrier cb) {
        this.cb = cb;
        this.start();
    }

    public void run() {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
        }
    }
}

class Match implements Runnable {
    public void run() {
        System.out.println("Match is starting...");
    }
}

public class Test {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        Match match = new Match();
        CyclicBarrier cb = new CyclicBarrier(2, match);
        Player p1 = new Player(cb);
        cb.await();
        /*INSERT*/
    }
}