package cl.poc.herencia;

public class WORD extends Documento {
    public WORD(String title) {
        super(title);
    }

    @Override
    protected void validar() {
        System.out.println("0>" + title);
    }
}
