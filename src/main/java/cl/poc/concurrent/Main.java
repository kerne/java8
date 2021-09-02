package cl.poc.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        ExecutorService ex = Executors.newSingleThreadExecutor();

//        List<Square> list = Arrays.asList(new Square(2), new Square(3), new Square(4), new Square(5));
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
        ex.execute(new SquareTask(new Square(2), cyclicBarrier));
        ex.execute(new SquareTask(new Square(3), cyclicBarrier));
        ex.execute(new SquareTask(new Square(4), cyclicBarrier));
        ex.execute(new SquareTask(new Square(5), cyclicBarrier));

        cyclicBarrier.await();

//        List<Future<Square>> tasks = list.stream().map(e -> ex.submit(new SquareTask(e))).collect(Collectors.toList());
//
//        tasks.stream().forEach(e -> {
//            try {
//
//                    System.out.println(e.get().calculate());
//
//            } catch (InterruptedException | ExecutionException interruptedException) {
//                interruptedException.printStackTrace();
//            }
//        });

        ex.shutdown();

    }


}

class Square {

    Integer number;

    public Square(Integer number) {
        this.number = number;
    }

    public Integer calculate() {
        return this.number * this.number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}

class SquareTask implements Runnable {

    Square n1;

    CyclicBarrier cyclicBarrier;


    public SquareTask(Square n1, CyclicBarrier cyclicBarrier) {
        this.n1 = n1;
        this.cyclicBarrier = cyclicBarrier;
    }


    @Override
    public void run() {
        try {
            System.out.printf("Calculate %d%n " ,  n1.calculate());
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}