import java.util.List;
import java.util.ArrayList;

public class School {

    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        return "School has earned $" + totalMoneyEarned + " and spent $" + totalMoneySpent;
    }
}