package cl.poc.exceptions;

public class Test {
    private static void m() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            m();
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException.");
        } catch (Exception e) {
            System.out.println("Caught Exception.");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Termined");
    }
}