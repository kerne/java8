package cl.poc.concurrent.semaphore;

import cl.poc.domain.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

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

        assertEquals(maxSalary.getSalary(), 400_000.0, 0);

    }

    @Test
    public void min_list_employee_by_salary() {
        Employee maxSalary = Arrays.stream(listEmployee)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        assertEquals(maxSalary.getSalary(), 200_000.0, 0);

    }

    @Test
    public void when_map_to_int_get_first_employee() {
        int maxSalary = Arrays.stream(listEmployee)
                .mapToInt(Employee::getId)
                .min()
                .orElseThrow(NoSuchElementException::new);

        assertEquals(1, maxSalary);
    }


    @Test
    public void average_salary() {
        double maxSalary = Arrays.stream(listEmployee)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElseThrow(NoSuchElementException::new);

        assertEquals(300000.0, maxSalary, 0.0);
    }


    @Test
    public void total_salary_employees() {
        double maxSalary = Arrays.stream(listEmployee)
                .mapToDouble(Employee::getSalary)
                .reduce(0.0, Double::sum);

        assertEquals(900000.0, maxSalary, 0.0);
    }

    @Test
    public void summarizing_salary_employee() {

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(listEmployee)
                .collect(Collectors.summarizingDouble(Employee::getSalary));


        assertEquals(doubleSummaryStatistics.getCount(), 3);
        assertEquals(doubleSummaryStatistics.getMin(), 200_000, 0);
        assertEquals(doubleSummaryStatistics.getMax(), 400_000, 0);
        assertEquals(doubleSummaryStatistics.getAverage(), 300_000, 0);
        assertEquals(doubleSummaryStatistics.getSum(), 900_000, 0);


    }


}
