package cl.poc.pattern.observable;

public class MainObserver {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();
        NewsChannel channel3 = new NewsChannel();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);


        agency.setNews("news");


    }
}
