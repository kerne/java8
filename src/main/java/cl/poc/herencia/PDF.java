package cl.poc.herencia;

public class PDF extends Documento {
    public PDF(String title) {
        super(title);
    }

    @Override
    protected void validar() {
        System.out.println(title);
    }
}
