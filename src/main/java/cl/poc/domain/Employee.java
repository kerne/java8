package cl.poc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {

    private int id;
    private String name;
    private double salary;
    private TypeEmployee typeEmployee;

    public Employee increment(double percentage) {
        this.salary += this.salary * percentage;
        return this;
    }

}
