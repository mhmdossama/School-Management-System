import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher ossama = new Teacher(1, "OSSAMA", 5000);
        Teacher sayed = new Teacher(2, "Sayed", 3000);
        Teacher ebrahim = new Teacher(3, "Ebrahim", 4000);
        Teacher alio = new Teacher(4, "ALIO", 5000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ossama);
        teacherList.add(sayed);
        teacherList.add(ebrahim);
        teacherList.add(alio);

        Student s1 = new Student(1, "s1", 4);
        Student s2 = new Student(2, "s2", 3);
        Student s3 = new Student(3, "S3", 2);
        Student s4 = new Student(4, "S4", 1);
        Student s5 = new Student(5, "S5", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        School Madrsa = new School(teacherList, studentList);

        s1.payFees(6600);

        System.out.println("Total Money Earned: " + Madrsa.getTotalMoneyEarned());

        System.out.println("SALARIES");

        System.out.println("Teacher's salary: " + ossama.getSalary());
        ossama.receiveSalary(6600);
        System.out.println("Total Money Spent: " + Madrsa.getTotalMoneySpent());
    }
}