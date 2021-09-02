package cl.poc.herencia;

public class Documento {

    String title;

    public Documento(String title) {
        this.title = title;
    }

    protected void validar() {
        System.out.printf("DOCUMENTO %s", title);
    }

}
