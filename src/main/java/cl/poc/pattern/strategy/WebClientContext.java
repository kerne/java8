package cl.poc.pattern.strategy;

public class WebClientContext {

    private final WebClientStrategy strategy;

    public WebClientContext(WebClientStrategy strategy) {
        this.strategy = strategy;
    }

    void call() {
        strategy.call();
    }
}
