package sem3.hw;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("Ivan", "1986-12-15", 2500),
                new Employee("Oleg", "1986-12-15", 2500),
                new Employee("Natalia", "1990-11-04", 2500),
                new Supervisor("Igor", "1986-08-07", 5000),
                new Supervisor("Oleg", "1984-01-26", 5000)
        };

        Supervisor.increaseSalary(employees, 1000);

    }

}
