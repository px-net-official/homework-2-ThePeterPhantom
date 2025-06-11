package at.pxnet;
import java.util.Arrays;

public class Person {
    private final String id;
    private String name;
    private int age;
    private int[] grades;

    public Person(String id, String name, int age, int[] grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        setGrades(grades);
    }

    private void setGrades(int[] grades) {
        if (grades == null || grades.length == 0) {
            this.grades = new int[0];
            return;
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 5) {
                throw new IllegalArgumentException("Grade has an invalid input: " + grade);
            }
        }
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }
}