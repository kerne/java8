package cl.poc.pattern.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        DataSource dataSourceDecorator = new EncrypterDecorator(new FileDataSource());
        dataSourceDecorator.writeData("Cesar");
        System.out.println(dataSourceDecorator.readData());


    }
}
