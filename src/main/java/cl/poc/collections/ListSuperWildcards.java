package cl.poc.collections;

import java.util.ArrayList;
import java.util.List;

public class ListSuperWildcards {

    public static void main(String[] args) {
        List<? super Genealogia> listex = new ArrayList<>();
        listex.add(new Man(new Hijo()));
        listex.add(new Female(new Hija()));
        System.out.println(listex);
    }
}

class Padre {
}

class Hijo extends Padre {
}

class Hija extends Padre {
}

class Genealogia<T extends Padre> {
    private final T t;

    Genealogia(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t.getClass().getSimpleName();
    }
}

class Man extends Genealogia<Hijo> {
    Man(Hijo hijo) {
        super(hijo);
    }
}

class Female extends Genealogia<Hija> {
    Female(Hija hija) {
        super(hija);
    }
}