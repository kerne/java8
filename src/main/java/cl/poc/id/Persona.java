package cl.poc.id;

import java.util.ArrayList;
import java.util.List;

public class Persona {


    private List<Direcciones> list = new ArrayList<>();

    public static void main(String[] args) {

        Persona persona = new Persona();


        Persona.Direcciones direcciones = new Direcciones();

        persona.list.add(direcciones);
        persona.list.add(direcciones);
        persona.list.add(direcciones);
        persona.list.add(direcciones);

        System.out.println(persona.list);

    }


    static class Direcciones {

    }

}


