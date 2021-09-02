package cl.poc.pattern.observable;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

    private String news;

    @Override
    public void update(Observable o, Object arg) {
        this.setNews((String)arg);
        System.out.println(arg);
    }

    public void setNews(String news) {
        this.news = news;
    }
}
