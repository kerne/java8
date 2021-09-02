package cl.poc.clases;

import java.util.Arrays;
import java.util.List;

public class Annonymous {

    private interface M{
        void parameters(List<String> p);
    }

    public static void main(String[] args) {

       m((e) -> System.out.println(e));

    }

    public static void m(M m){
        m.parameters(Arrays.asList("A","B"));
    }

}
