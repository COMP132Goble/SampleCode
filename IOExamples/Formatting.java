package IOExamples;

public class Formatting {
    public static void main(String[] args) {
        int numStudents = 19;
        char letterGrade = 'A';
        double my_gpa = 3.95;

        System.out.printf("There are %d students\n", numStudents);
        System.out.printf("William's course grade was %c, and his GPA is %f\n", letterGrade, my_gpa);

        double gpa = 3.275;
        final double PI = 3.14159;

        System.out.printf("gpa = %.2f", gpa);
        System.out.printf("PI = %.3f", PI);
    }
}
