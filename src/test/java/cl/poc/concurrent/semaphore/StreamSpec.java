package cl.poc.concurrent.semaphore;

import cl.poc.domain.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class StreamSpec {

    Employee[] listEmployee = {
            new Employee(1, "Cesar", 200_000.0),
            new Employee(2, "Patricio", 300_000.0),
            new Employee(3, "Lucas", 400_000.0)
    };

    @Test
    public void max_list_employee_by_salary() {
        Employee maxSalary = Arrays.stream(listEmployee)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        Assert.assertEquals(maxSalary.getSalary(), 400_000.0, 0);

    }

    @Test
    public void min_list_employee_by_salary() {
        Employee maxSalary = Arrays.stream(listEmployee)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        Assert.assertEquals(maxSalary.getSalary(), 200_000.0, 0);

    }

    @Test
    public void get_first_employee() {
        int maxSalary = Arrays.stream(listEmployee)
                .mapToInt(Employee::getId)
                .min()
                .orElseThrow(NoSuchElementException::new);

        Assert.assertEquals(1, maxSalary);
    }


}
