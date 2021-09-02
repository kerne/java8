package cl.poc.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class PocFork {

    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();

        VoidCalculation calculation = new VoidCalculation(4);
        pool.invoke(calculation);

        pool.shutdown();

        while (!calculation.isDone()) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(calculation.result);
    }
}


class SquareForkCalculation extends RecursiveTask<Integer> {

    private Integer n;

    public SquareForkCalculation(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {

        if (n <= 1) {
            return n;
        }

        SquareForkCalculation sq = new SquareForkCalculation(n - 1);
        sq.fork();

        return (n * n) + sq.join();
    }
}


class VoidCalculation extends RecursiveAction {

    Integer n;

    static int result;

    public VoidCalculation(Integer n) {
        this.n = n;
    }

    @Override
    protected void compute() {

        if (n == null) {
            throw new IllegalArgumentException("Finish program");
        }

        if (n < 1) {
            System.out.println("Closed");
            return;
        }
        VoidCalculation voidCalculation = new VoidCalculation(n - 1);


        voidCalculation.fork();
        square(n);
        voidCalculation.join();

    }

    private void square(int n) {
        result += n * n;
    }

}


