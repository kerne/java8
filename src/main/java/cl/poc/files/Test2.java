package cl.poc.files;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class A<T> {
    T t;

    void set(T t) {
        this.t = t;
    }

    T get() {
        return t;
    }
}

public class Test2 {
    public static <T> void print1(A<? extends Animal> obj) {
//        obj.set(new Dog()); //Line 22
        System.out.println(obj.get().getClass());
    }

    public static <T> void print2(A<? super Dog> obj) {
        obj.set(new Dog()); //Line 27
        System.out.println(obj.get().getClass());
    }

    public static void main(String[] args) {
        A<Animal> obj = new A<>();

        print1(obj); //Line 33
        print2(obj); //Line 34
    }
}