package sem3;

import lombok.*;

@Data // + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private int salary;

    public Person(int age) {
        this.age = age;
    }
}
