package cl.poc.pattern.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        WebClientContext webClientContext = new WebClientContext(new WebClientReal());

        webClientContext.call();

    }
}
