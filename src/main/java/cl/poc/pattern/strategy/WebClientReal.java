package cl.poc.pattern.strategy;

public class WebClientReal implements WebClientStrategy{
    @Override
    public void call() {
        System.out.println("Real");
    }
}
