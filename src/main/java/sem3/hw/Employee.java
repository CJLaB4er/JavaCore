package sem3.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String stringBD;
    private Date birthday;
    private int salary;

    public Employee(String name, String stringBD, int salary) {
        this.name = name;
        this.stringBD = stringBD;
        this.salary = salary;
        this.birthday = stringToDate(stringBD);
    }

    private Date stringToDate(String birthday) {
        SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formatData.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public String getStringBD() {
        return stringBD;
    }

    public int getSalary() {
        return salary;
    }

    //        Метод-заготовка для сравнения экземпляров класса по дате рождения без условных операторов.
    public int compareTo(Employee emp) {
        return this.birthday.compareTo(emp.birthday);
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", position='" + this.getClass().getSimpleName() + '\'' +
                ", salary=" + salary +
                '}');
    }

    public void upSalary(int salary) {
        this.salary += salary;
    }

}


