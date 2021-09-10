package cl.poc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {

    private final int id;
    private final String name;
    private final double salary;
    private final TypeEmployee typeEmployee;

}
