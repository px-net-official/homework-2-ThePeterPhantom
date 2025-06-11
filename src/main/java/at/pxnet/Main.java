package at.pxnet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a class "Person" in the at.pxnet package
        // Make sure it has a constructor to take the following parameters in order:
        // * id (string)
        // * name
        // * age (int)
        // * array of grades (int)
        //
        // A grade can be any number from 1 to 5. If a number outside this range is passed as a grade, an
        // IllegalArgumentException should be thrown.
        //
        // Make sure the principles of data encapsulation are followed
        // A Person's id can never change
        // A person's age can change
        //
        Person RottenRobbie = new Person("SE001", "Robbie Rotten", 30, new int[]{3, 2, 3, 1, 3, 1});
        Person BennettConrad = new Person("SE002", "Conrad Bennett", 22, new int[]{5, 3, 4, 3, 3, 2});
        Person CoxCharlie = new Person("SE003", "Charlie Cox", 23, new int[]{2, 1, 5, 5, 1, 4});
        Person BushJeb = new Person("SE004", "Jeb Bush", 72, new int[]{1, 1, 1, 1, 1, 1});
        Person AlucardVlad = new Person("SE005", "Vlad Alucard", 597, new int[]{2, 4, 3, 4, 4, 4});
        Person WayneBruce = new Person ("SE006", "Bruce Wayne", 33, new int[]{3, 2, 5, 4, 2, 3});
        Person BondJames = new Person ("SE007", "James Bond", 32, new int[]{1, 1, 5, 3, 4, 2});
        // ----
        //
        // Create a class "Grading" in the at.pxnet package
        // Since it is a utility class, it should not expose any constructors
        //
        // This class provides a public method "isFailing" that takes a Person as a parameter. A person is failing if
        // they have at least one "5" or at least three "4" in their grades. If a person does not have at least two
        // grades, the method throws an IllegalStateException, regardless of the grades
        //
        // ---
        //
        // Create a class "University" in the at.pxnet package.
        // It should only have the default constructor
        // The class provides three Methods:
        // * "addStudent" takes a Person as a parameter and add them as a new student to the university
        // * "removeStudent" takes a Person as a parameter and removes them from the list
        // * "getStudents" returns a List of Persons. The list must be unmodifiable
        // * "getFailingStudents" returns a List of Persons. The list must be unmodifiable
        //
        University uni = new University();
        uni.addStudent(RottenRobbie);
        uni.addStudent(BennettConrad);
        uni.addStudent(CoxCharlie);
        uni.addStudent(BushJeb);
        uni.addStudent(AlucardVlad);
        uni.addStudent(WayneBruce);
        uni.addStudent(BondJames);

        System.out.println("\nAll students:");
        for (Person p : uni.getStudents()) {
            System.out.println(p.getName() + " (" + p.getAge() + ")");
        }
        System.out.println("\nStudents in risk of failing:");
        for (Person p : uni.getFailingStudents()) {
            System.out.println(p.getName());
        }

        // An additional method "getAverageAge" does not take any parameters and returns the average age of the
        // students (double). If no students are enlisted in the university, "0" is returned.
        System.out.printf("\nAverage age: %.2f%n", uni.getAverageAge());
    }
}