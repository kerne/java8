package cl.poc.excercises;

import cl.poc.domain.Employee;
import cl.poc.domain.TypeEmployee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StreamSpec {

    Employee[] listEmployee = {
            new Employee(1, "Cesar", 200_000.0, TypeEmployee.SLAVE),
            new Employee(2, "Patricio", 300_000.0, TypeEmployee.SLAVE),
            new Employee(3, "Lucas", 400_000.0, TypeEmployee.MASTER)
    };

    private static void accept(Employee employee) {
        employee.increment(0.1);
    }

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

    @Test
    public void partition_employee() {
        Map<Boolean, List<Employee>> partitionList = Arrays.stream(listEmployee)
                .collect(Collectors.partitioningBy(employee -> employee.getId() < 2));

        assertEquals(partitionList.get(true).size(), 1);
        assertEquals(partitionList.get(false).size(), 2);
    }

    @Test
    public void grouping_by_first_letter_of_employee() {
        Map<Character, List<Employee>> partitionList =
                Arrays
                        .stream(listEmployee)
                        .collect(Collectors.groupingBy(employee -> employee.getName().charAt(0)));

        assertEquals(partitionList.get('C').get(0).getName(), "Cesar");
        assertEquals(partitionList.get('P').get(0).getName(), "Patricio");
        assertEquals(partitionList.get('L').get(0).getName(), "Lucas");
    }

    @Test
    public void grouping_by_type_of_employee() {
        Map<TypeEmployee, List<Employee>> partitionList = Arrays
                .stream(listEmployee)
                .collect(Collectors.groupingBy(Employee::getTypeEmployee));

        assertEquals(partitionList.get(TypeEmployee.SLAVE).size(), 2);
        assertEquals(partitionList.get(TypeEmployee.MASTER).size(), 1);
    }


    @Test
    public void increase_salary_10_percentage_all_employee() {
        List<Employee> employees = Arrays.stream(listEmployee)
                .map(employee -> employee.increment(0.1))
                .collect(Collectors.toList());

        assertThat(employees, contains(
                        hasProperty("salary", equalTo(220_000.0)),
                        hasProperty("salary", equalTo(330_000.0)),
                        hasProperty("salary", equalTo(440_000.0))
                )
        );
    }

}
