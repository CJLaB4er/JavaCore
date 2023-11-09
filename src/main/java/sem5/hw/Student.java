package sem5.hw;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Student {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");


    private String name;
    private List<Integer> grades;
    private String specialty;

    public Student(String name, List<Integer> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", AVGGrades=" + decimalFormat.format(getAverageGrade()) +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван", Arrays.asList(5, 4, 5, 5, 5, 5, 5), "Информатика"));
        students.add(new Student("Игорь", Arrays.asList(5, 5, 5, 4, 4, 4, 5), "Информатика"));
        students.add(new Student("Никита", Arrays.asList(5, 5, 5, 5, 5, 5, 5), "Информатика"));
        students.add(new Student("Ольга", Arrays.asList(5, 5, 5, 5, 5, 5, 5), "Менеджмент"));
        students.add(new Student("Алексей", Arrays.asList(3, 5, 5, 5, 4, 5, 5, 4), "Информатика"));
        students.add(new Student("Наталья", Arrays.asList(4, 5, 5, 5, 4, 4, 5, 4), "Информатика"));
        students.add(new Student("Вадим", Arrays.asList(4, 5, 5), "Информатика"));
        students.add(new Student("Александр", Arrays.asList(5, 5, 5), "Информатика"));


        List<Student> result = students.stream()
                .filter(s -> s.specialty.equals("Информатика"))
                .filter(s -> s.getAverageGrade() >= 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());

        for (Student s : result) {
            System.out.println(s);
        }

    }


}
