package cl.poc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PocComparator {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        list.add(new Person("Cesar", "Araya", 32));
        list.add(new Person("Daisy", "Araya", 33));
        list.add(new Person("Antonia", "Araya", 12));
        list.add(new Person("Lucas", "Araya", 3));

        list.stream().sorted(Comparator.comparing(Person::getAge, (s1, s2) -> s1.compareTo(s2))).forEach(System.out::println);


    }
}

class Other {
    public static <T> void t(T t) {
        System.out.println(t);
    }
}


class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
