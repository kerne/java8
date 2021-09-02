package cl.poc.lambda;

import java.util.function.Predicate;

public class Ex1lambadas {

    public static void main(String[] args) {

        check(new Ex1lambadas().new Persona(2), p -> p.age > 0);

    }

    static void check(Persona p, Predicate<Persona> o) {
        if (o.test(p))
            System.out.println("PERSONA " + p.age);

    }

    class Persona {
        int age;

        public Persona(int age) {
            this.age = age;
        }
    }
}
