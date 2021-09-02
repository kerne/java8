package cl.poc.pattern;

import java.util.ArrayList;
import java.util.List;

public class MainInmutable {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Cesar");

        Animal animal = new Animal(list);
        list.clear();

        System.out.println(animal.getValue(0));
    }


}


final class Animal{

    private final List<String> list;

    public Animal(List<String> list){
        this.list = new ArrayList<>(list);
    }

    public String getValue(int index){
        return  this.list.get(index);
    }
}
