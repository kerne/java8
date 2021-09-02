package cl.poc.pattern.decorator;

public class DataSourceDecorator implements DataSource{

    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);

    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }
}
