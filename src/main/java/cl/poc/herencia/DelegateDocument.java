package cl.poc.herencia;

import java.util.ArrayList;
import java.util.List;

public class DelegateDocument {

    List<Documento> list = new ArrayList<>();

    public void addDocument(Documento documento) {
        this.list.add(documento);
    }

    public void validar() {
        for (Documento d : list) {
            d.validar();
        }
    }

}
