package cl.poc.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface I1 {

    void m1() throws java.io.IOException;

}

class I implements I1 {

    @Override
    public void m1() throws FileNotFoundException {

    }
}
