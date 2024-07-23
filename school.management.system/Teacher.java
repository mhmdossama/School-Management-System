public class Teacher {

    private int id;
    private String name;
    private double salary;
    private double earnedSalary;

    /* Creates New teacher object */
    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.earnedSalary = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        earnedSalary += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name + ", Salary earned: $" + earnedSalary;
    }
}