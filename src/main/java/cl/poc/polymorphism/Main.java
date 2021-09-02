package cl.poc.polymorphism;

public class Main {

    public static void main(String[] args) {

        MyDate myDate = new MyDate(1, 1, 2020);

        Order order = new Order(10000, 1, myDate, new Good(), "Cesar");

        System.out.println(order.hashCode());

    }
}
