package sem3.hw;

public class Supervisor extends Employee {


    public Supervisor(String name, String stringBD, int salary) {
        super(name, stringBD, salary);
    }

    public static void increaseSalary(Employee[] emp, int increment) {
        for (int i = 0; i < emp.length; i++) {
            Employee tmp = emp[i];
            if (tmp.getClass().getSimpleName().equals("Employee")) {
                tmp.info();
                tmp.upSalary(increment);
                System.out.printf("Зарплата увеличена на %d\n", increment);
                tmp.info();
                System.out.println();
            } else {
                System.out.printf("Нельзя поднять зарплату руководителю %s!\n", tmp.getName());
            }
        }
    }

}
