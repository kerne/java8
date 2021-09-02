package cl.poc.optional;

import java.util.Optional;

class MyException extends Exception {
}

public class Main {

    public static void main(String[] args) throws Exception {
        checkException();
    }

    public static void checkException() throws Exception {
        Optional<String> optional = (Optional<String>) Optional.ofNullable(null).map(e -> e).orElseThrow(MyException::new);
        System.out.println(optional.orElseThrow(MyException::new));
    }


    public static void checkEmpty() {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional);
    }

}
