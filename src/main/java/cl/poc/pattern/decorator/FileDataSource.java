package cl.poc.pattern.decorator;

public class FileDataSource implements DataSource{

    private String data;

    @Override
    public void writeData(String data) {
        System.out.println(data);
        this.data= data;
    }

    @Override
    public String readData() {
        return getData();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
