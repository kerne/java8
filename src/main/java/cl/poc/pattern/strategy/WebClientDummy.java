package cl.poc.pattern.strategy;

public class WebClientDummy implements WebClientStrategy{
    @Override
    public void call() {
        System.out.println("Dummy");
    }
}
